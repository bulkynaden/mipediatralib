package es.mdef.mipediatralib.utils;

import es.mdef.mipediatralib.interfaces.*;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que gestiona recordatorios relacionados con vacunas y consultas.
 */
public class ReminderManager {

    /**
     * Obtiene una lista de recordatorios para un periodo específico relacionados con vacunas y consultas.
     *
     * @param vaccineDosePeriods una colección de períodos de dosis de vacunas.
     * @param person             una persona para la cual se calcularán los recordatorios.
     * @param period             un período para calcular los recordatorios pendientes.
     * @param vaccinesPersons    una colección de la relación entre las vacunas y las personas.
     * @return una lista de recordatorios ordenada por el tiempo restante.
     */
    public static <T extends IVaccinesPersons, U extends IVaccineDosePeriod> List<IReminder> getReminders(Collection<T> vaccinesPersons, Collection<U> vaccineDosePeriods, IPerson person, Period period) {
        List<IReminder> reminders = new ArrayList<>();

        for (IConsultation consultation : person.getConsultations()) {
            Period timeLeft = consultation.getTimeLeft();

            if (!timeLeft.isNegative() && timeLeft.minus(period).isNegative()) {
                reminders.add(consultation);
            }
        }

        List<IReminder> vaccines = VaccinationManager.getInstance().setTimeToAlert(period).getVaccinesPending(person, vaccinesPersons, vaccineDosePeriods);
        reminders.addAll(vaccines);

        return reminders.stream().sorted().collect(Collectors.toList());
    }
}