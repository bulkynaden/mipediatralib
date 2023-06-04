package es.mdef.mipediatralib.interfaces;

import java.time.Period;

/**
 * Interfaz que representa el periodo de dosis de una vacuna según la comunidad autónoma.
 */
public interface IVaccineDosePeriod {
    /**
     * Obtiene la vacuna asociada.
     *
     * @return la vacuna asociada.
     */
    IVaccine getVaccine();

    /**
     * Establece la vacuna asociada.
     *
     * @param vaccine la vacuna asociada.
     */
    void setVaccine(IVaccine vaccine);

    /**
     * Obtiene la comunidad autónoma asociada.
     *
     * @return la comunidad autónoma asociada.
     */
    IAutonomousCommunity getAutonomousCommunity();

    /**
     * Establece la comunidad autónoma asociada.
     *
     * @param autonomousCommunity la comunidad autónoma asociada.
     */
    void setAutonomousCommunity(IAutonomousCommunity autonomousCommunity);

    /**
     * Obtiene el tiempo hasta la siguiente dosis recomendada.
     *
     * @return el tiempo hasta la siguiente dosis.
     */
    Period getTimeToDose();

    /**
     * Establece el tiempo hasta la siguiente dosis recomendada.
     *
     * @param timeToDose el nuevo tiempo hasta la siguiente dosis.
     */
    void setTimeToDose(Period timeToDose);

    /**
     * Indica si la vacuna es requerida o es opcional.
     *
     * @return true si la vacuna es requerida, false si es opcional.
     */
    boolean isRequired();

    /**
     * Establece si la vacuna es requerida o es opcional.
     *
     * @param required true si la vacuna es requerida, false si es opcional.
     */
    void setRequired(boolean required);
}