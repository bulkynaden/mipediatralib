package es.mdef.mipediatralib.utils;

import es.mdef.mipediatralib.interfaces.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Clase que se encarga de gestionar la vacunación de personas.
 */
public class VaccinationManager {
    /**
     * El tiempo predeterminado para alertar sobre una vacuna pendiente.
     */
    private static Period defaultTimeToAlert = Period.of(0, 0, 30);

    /**
     * Instancia de la clase.
     */
    private static VaccinationManager instance;

    private VaccinationManager() {
    }

    /**
     * Obtiene la instancia singleton de VaccinationManager.
     *
     * @return La instancia singleton de VaccinationManager.
     */
    public static VaccinationManager getInstance() {
        if (instance == null) {
            instance = new VaccinationManager();
        }
        return instance;
    }

    /**
     * Devuelve el tiempo que le queda a una persona para vacunarse.
     *
     * @param birthday La fecha de nacimiento de la persona.
     * @param vaccine  Un objeto VaccineDosePeriod que contiene información sobre el período de dosis de una vacuna.
     * @return El tiempo que le queda a una persona para vacunarse.
     */
    private static Period getTimeLeftForVaccine(ZonedDateTime birthday, IVaccineDosePeriod vaccine) {
        LocalDate birthDate = birthday.toLocalDate();

        Period personAge = Period.between(birthDate, LocalDate.now());

        return vaccine.getTimeToDose().minus(personAge);
    }

    /**
     * Crea un comparator para ordenar los períodos de dosis de una vacuna.
     *
     * @param birthdate La fecha de nacimiento de la persona.
     * @return Un comparator para ordenar los períodos de dosis de una vacuna.
     */
    private Comparator<IVaccineDosePeriod> createVaccineComparator(ZonedDateTime birthdate) {
        return (d1, d2) -> {
            ZonedDateTime vaccineDate1 = birthdate.plus(d1.getTimeToDose());
            ZonedDateTime vaccineDate2 = birthdate.plus(d2.getTimeToDose());
            return vaccineDate1.compareTo(vaccineDate2);
        };
    }

    /**
     * Determina si una vacuna está pendiente según la fecha de nacimiento y el período de dosis de una vacuna.
     *
     * @param birthdate La fecha de nacimiento de la persona.
     * @param vaccine   Un objeto VaccineDosePeriod que contiene información sobre el período de dosis de una vacuna.
     * @return Verdadero si la vacuna está pendiente; de lo contrario, falso.
     */
    private boolean isVaccinePending(ZonedDateTime birthdate, IVaccineDosePeriod vaccine) {
        ZonedDateTime vaccineDate = birthdate.plus(vaccine.getTimeToDose());
        ZonedDateTime alertDate = ZonedDateTime.now().plus(defaultTimeToAlert);
        return alertDate.isAfter(vaccineDate) || alertDate.isEqual(vaccineDate);
    }

    /**
     * Devuelve una lista de objetos IReminder que representan las vacunas pendientes para la persona dada.
     *
     * @param person          La persona para la cual se deben determinar las vacunas pendientes.
     * @param vaccines        Una colección de objetos VaccineDosePeriod que contienen información sobre los períodos de dosis de vacunas.
     * @param vaccinesPersons Una colección de objetos IVaccinesPersons que contienen información sobre la relación entre las personas y sus vacunas.
     * @return Una lista de objetos IReminder que representan las vacunas pendientes para la persona dada.
     */
    public <T extends IVaccinesPersons, U extends IVaccineDosePeriod> List<IReminder> getVaccinesPending(IPerson person, Collection<T> vaccinesPersons, Collection<U> vaccines) {
        IAutonomousCommunity autonomousCommunity = person.getAutonomousCommunity();
        ZonedDateTime birthdate = person.getBirthdate();

        Set<IVaccinesPersons> administeredVaccines = vaccinesPersons.stream().filter(e -> e.getPerson().equals(person) && e.isHasBeenAdministered()).collect(Collectors.toSet());

        Comparator<IVaccineDosePeriod> vaccineDosePeriodComparator = createVaccineComparator(birthdate);

        return vaccines.stream()
                .filter(IVaccineDosePeriod::isRequired)
                .filter(v -> v.getAutonomousCommunity().equals(autonomousCommunity))
                .filter(v -> isVaccinePending(birthdate, v))
                .filter(v -> administeredVaccines.stream().noneMatch(e -> e.getVaccine() == v.getVaccine()))
                .sorted(vaccineDosePeriodComparator)
                .map(v -> new IReminder() {
                    @Override
                    public Period getTimeLeft() {
                        return getTimeLeftForVaccine(person.getBirthdate(), v);
                    }

                    @Override
                    public IPatient getPatient() {
                        return person;
                    }

                    @Override
                    public String getName() {
                        return v.getVaccine().getVaccineDetails().getName() + " - " + v.getVaccine().getDose();
                    }
                })
                .collect(Collectors.toList());
    }

    /**
     * Establece el tiempo predeterminado para alertar sobre una vacuna pendiente.
     *
     * @param timeToAlert El tiempo predeterminado para alertar sobre una vacuna pendiente.
     * @return La instancia de VaccinationManager.
     */
    public VaccinationManager setTimeToAlert(Period timeToAlert) {
        VaccinationManager.defaultTimeToAlert = timeToAlert;
        return instance;
    }
}