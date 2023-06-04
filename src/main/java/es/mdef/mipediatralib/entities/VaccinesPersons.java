package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.interfaces.IFile;
import es.mdef.mipediatralib.interfaces.IPerson;
import es.mdef.mipediatralib.interfaces.IVaccine;
import es.mdef.mipediatralib.interfaces.IVaccinesPersons;
import lombok.Data;

import java.time.ZonedDateTime;

/**
 * Clase que contiene los datos de las vacunas administradas y los pacientes asociados.
 * Esta clase implementa la interfaz IVaccinesPersons.
 */
@Data
public class VaccinesPersons implements IVaccinesPersons {
    /**
     * Vacuna administrada.
     */
    private IVaccine vaccine;

    /**
     * Persona asociada a la vacuna administrada.
     */
    private IPerson person;

    /**
     * Fecha y hora de administración de la vacuna.
     */
    private ZonedDateTime date;

    /**
     * Fecha y hora esperada para la próxima dosis de la vacuna.
     */
    private ZonedDateTime expectedDate;

    /**
     * Foto relacionada con la vacuna administrada.
     */
    private IFile photo;

    /**
     * Reacción o efecto adverso reportado tras la administración de la vacuna.
     */
    private String reaction;

    /**
     * Indica si la vacuna ha sido administrada o no.
     */
    private boolean hasBeenAdministered;
}