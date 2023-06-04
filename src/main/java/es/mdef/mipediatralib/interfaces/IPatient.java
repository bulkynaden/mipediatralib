package es.mdef.mipediatralib.interfaces;

import java.util.Set;

/**
 * Representa a un paciente en el sistema.
 */
public interface IPatient {

    /**
     * Devuelve los comentarios del paciente.
     *
     * @return los comentarios del paciente.
     */
    String getComments();

    /**
     * Establece los comentarios del paciente.
     *
     * @param comments los comentarios del paciente.
     */
    void setComments(String comments);

    /**
     * Devuelve la lista de visitas realizadas por el paciente.
     *
     * @return la lista de visitas realizadas por el paciente.
     */
    Set<IConsultation> getConsultations();

    /**
     * Establece la lista de visitas realizadas por el paciente.
     *
     * @param consultations la lista de visitas realizadas por el paciente.
     */
    void setConsultations(Set<IConsultation> consultations);

    /**
     * Obtiene la foto del paciente.
     *
     * @return la foto del paciente.
     */
    IFile getPhoto();

    /**
     * Establece la foto del paciente.
     *
     * @param photo la foto del paciente.
     */
    void setPhoto(IFile photo);

    /**
     * Añade una consulta al paciente.
     *
     * @param consultation la consulta a añadir.
     */
    void addConsultation(IConsultation consultation);
}