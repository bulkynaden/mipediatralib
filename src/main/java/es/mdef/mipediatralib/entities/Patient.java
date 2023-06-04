package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.interfaces.IConsultation;
import es.mdef.mipediatralib.interfaces.IFile;
import es.mdef.mipediatralib.interfaces.IPatient;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Representa a un paciente.
 * Esta clase implementa la interfaz IPatient.
 */
@Data
public class Patient implements IPatient {
    /**
     * Comentarios adicionales sobre el paciente.
     */
    private String comments;

    /**
     * Conjunto de consultas asociadas al paciente.
     */
    private Set<IConsultation> consultations = new HashSet<>();

    /**
     * Foto del paciente.
     */
    private IFile photo;

    /**
     * Añade una consulta al paciente.
     *
     * @param consultation Consulta a añadir.
     */
    public void addConsultation(IConsultation consultation) {
        this.consultations.add(consultation);
    }
}