package es.mdef.mipediatralib.interfaces;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * Interfaz que representa una consulta.
 * Esta interfaz hereda de la interfaz IReminder.
 */
public interface IConsultation extends IReminder {

    /**
     * Devuelve el centro donde se realizó la consulta.
     *
     * @return el centro donde se realizó la consulta.
     */
    String getCenter();

    /**
     * Establece el centro donde se realizó la consulta.
     *
     * @param center el centro donde se realizó la consulta.
     */
    void setCenter(String center);

    /**
     * Devuelve la fecha y hora en que se realizó la consulta.
     *
     * @return la fecha y hora en que se realizó la consulta.
     */
    ZonedDateTime getDate();

    /**
     * Establece la fecha y hora en que se realizó la consulta.
     *
     * @param date la fecha y hora en que se realizó la consulta.
     */
    void setDate(ZonedDateTime date);

    /**
     * Devuelve el paciente al que se le realizó la consulta.
     *
     * @return el paciente al que se le realizó la consulta.
     */
    IPatient getPatient();

    /**
     * Establece el paciente al que se le realizó la consulta.
     *
     * @param patient el paciente al que se le realizó la consulta.
     */
    void setPatient(IPatient patient);

    /**
     * Devuelve el nombre del especialista que realizó la consulta.
     *
     * @return el nombre del especialista que realizó la consulta.
     */
    String getSpecialist();

    /**
     * Establece el nombre del especialista que realizó la consulta.
     *
     * @param specialist el nombre del especialista que realizó la consulta.
     */
    void setSpecialist(String specialist);

    /**
     * Devuelve la lista de archivos que se han enviado para la consulta.
     *
     * @return la lista de archivos que se han enviado para la consulta.
     */
    Set<IFile> getFiles();

    /**
     * Establece la lista de archivos que se han enviado para la consulta.
     *
     * @param files la lista de archivos que se han enviado para la consulta.
     */
    void setFiles(Set<IFile> files);

    /**
     * Devuelve los comentarios sobre la consulta.
     *
     * @return los comentarios sobre la consulta.
     */
    String getComments();

    /**
     * Establece los comentarios sobre la consulta.
     *
     * @param comments los comentarios sobre la consulta.
     */
    void setComments(String comments);

    /**
     * Devuelve el tiempo que queda para realizar la consulta.
     *
     * @return el tiempo que queda para realizar la consulta.
     */
    @Override
    default Period getTimeLeft() {
        return Period.between(LocalDate.now(), LocalDate.from(getDate()));
    }
}