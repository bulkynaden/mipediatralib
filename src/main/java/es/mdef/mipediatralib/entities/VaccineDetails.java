package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.interfaces.IVaccineDetails;
import lombok.Data;

/**
 * Representa los detalles de una vacuna.
 * Esta clase implementa la interfaz IVaccineDetails.
 */
@Data
public class VaccineDetails implements IVaccineDetails {
    /**
     * Nombre completo de la vacuna.
     */
    private String name;

    /**
     * Nombre corto de la vacuna.
     */
    private String shortName;
}