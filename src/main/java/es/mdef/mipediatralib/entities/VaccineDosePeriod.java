package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.interfaces.IAutonomousCommunity;
import es.mdef.mipediatralib.interfaces.IVaccine;
import es.mdef.mipediatralib.interfaces.IVaccineDosePeriod;
import lombok.Data;

import java.time.Period;

/**
 * Clase que representa el periodo de dosis de una vacuna según la comunidad autónoma.
 * Esta clase implementa la interfaz IVaccineDosePeriod.
 */
@Data
public class VaccineDosePeriod implements IVaccineDosePeriod {
    /**
     * Vacuna asociada al periodo de dosis.
     */
    private IVaccine vaccine;

    /**
     * Comunidad autónoma a la que se aplica el periodo de dosis.
     */
    private IAutonomousCommunity autonomousCommunity;

    /**
     * Periodo de tiempo hasta la dosis de la vacuna.
     */
    private Period timeToDose;

    /**
     * Indica si la dosis es requerida o no en la comunidad autónoma.
     */
    private boolean required;
}