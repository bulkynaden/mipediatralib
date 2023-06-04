package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.interfaces.IVaccine;
import es.mdef.mipediatralib.interfaces.IVaccineDetails;
import es.mdef.mipediatralib.interfaces.IVaccineDosePeriod;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Representa una vacuna y sus propiedades.
 */
@Data
public class Vaccine implements IVaccine {
    /**
     * Número de dosis de la vacuna.
     */
    private int dose;

    /**
     * Detalles de la vacuna.
     */
    private IVaccineDetails vaccineDetails;

    /**
     * Períodos de dosis de la vacuna.
     */
    private Set<IVaccineDosePeriod> vaccineDosePeriods = new HashSet<>();
}