package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.interfaces.IConsultation;
import es.mdef.mipediatralib.interfaces.IFile;
import es.mdef.mipediatralib.interfaces.IPatient;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Representa una consulta realizada por un especialista a un paciente en un centro.
 * Esta clase es abstracta y implementa la interfaz IConsultation.
 */
@Data
@EqualsAndHashCode(of = {"center", "date", "specialist", "comments"})
public abstract class Consultation implements IConsultation {
    /**
     * Centro en el que se realiza la consulta.
     */
    private String center;

    /**
     * Fecha y hora de la consulta.
     */
    private ZonedDateTime date;

    /**
     * Paciente que asiste a la consulta.
     */
    private IPatient patient;

    /**
     * Especialista que realiza la consulta.
     */
    private String specialist;

    /**
     * Archivos relacionados con la consulta.
     */
    private Set<IFile> files = new HashSet<>();

    /**
     * Comentarios adicionales sobre la consulta.
     */
    private String comments;


    /**
     * Establece el paciente al que se le realizó la consulta.
     *
     * @param patient el paciente al que se le realizó la consulta.
     */
    @Override
    public void setPatient(IPatient patient) {
        if (this.patient != null) {
            this.patient.getConsultations().remove(this);
        }

        this.patient = patient;

        if (patient != null) {
            patient.getConsultations().add(this);
        }
    }
}