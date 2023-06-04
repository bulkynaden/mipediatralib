package es.mdef.mipediatralib.interfaces;

import java.util.Set;

/**
 * Interfaz que representa una vacuna.
 */
public interface IVaccine {
    /**
     * Obtiene el número de dosis de la vacuna.
     *
     * @return el número de dosis de la vacuna.
     */
    int getDose();

    /**
     * Establece el número de dosis de la vacuna.
     *
     * @param dose el nuevo número de dosis de la vacuna.
     */
    void setDose(int dose);

    /**
     * Obtiene los detalles de la vacuna.
     *
     * @return los detalles de la vacuna.
     */
    IVaccineDetails getVaccineDetails();

    /**
     * Establece los detalles de la vacuna.
     *
     * @param vaccineDetails los nuevos detalles de la vacuna.
     */
    void setVaccineDetails(IVaccineDetails vaccineDetails);

    /**
     * Obtiene los periodos de dosis de la vacuna.
     *
     * @return los periodos de dosis de la vacuna.
     */
    Set<IVaccineDosePeriod> getVaccineDosePeriods();

    /**
     * Establece los periodos de dosis de la vacuna.
     *
     * @param vaccineDosePeriods los nuevos periodos de dosis de la vacuna.
     */
    void setVaccineDosePeriods(Set<IVaccineDosePeriod> vaccineDosePeriods);
}