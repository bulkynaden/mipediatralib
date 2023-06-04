package es.mdef.mipediatralib.interfaces;

import java.time.ZonedDateTime;

/**
 * Interfaz que representa los datos de una vacuna y las personas asociadas.
 */
public interface IVaccinesPersons {
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
     * Obtiene la persona asociada.
     *
     * @return la persona asociada.
     */
    IPerson getPerson();

    /**
     * Establece la persona asociada.
     *
     * @param person la persona asociada.
     */
    void setPerson(IPerson person);

    /**
     * Obtiene la fecha de la vacuna.
     *
     * @return la fecha de la vacuna.
     */
    ZonedDateTime getDate();

    /**
     * Establece la fecha de la vacuna.
     *
     * @param date la fecha de la vacuna.
     */
    void setDate(ZonedDateTime date);

    /**
     * Obtiene la fecha prevista de la vacuna.
     *
     * @return la fecha prevista de la vacuna.
     */
    ZonedDateTime getExpectedDate();

    /**
     * Establece la fecha prevista de la vacuna.
     *
     * @param expectedDate la fecha prevista de la vacuna.
     */
    void setExpectedDate(ZonedDateTime expectedDate);

    /**
     * Obtiene la foto de la vacuna.
     *
     * @return la foto de la vacuna.
     */
    IFile getPhoto();

    /**
     * Establece la foto de la vacuna.
     *
     * @param photo la foto de la vacuna.
     */
    void setPhoto(IFile photo);

    /**
     * Obtiene la reacción a la vacuna.
     *
     * @return la reacción a la vacuna.
     */
    String getReaction();

    /**
     * Establece la reacción a la vacuna.
     *
     * @param reaction la reacción a la vacuna.
     */
    void setReaction(String reaction);

    /**
     * Indica si la vacuna ha sido administrada al paciente.
     *
     * @return true si la vacuna ha sido administrada, false de lo contrario.
     */
    boolean isHasBeenAdministered();

    /**
     * Establece si la vacuna ha sido administrada al paciente.
     *
     * @param hasBeenAdministered true si la vacuna ha sido administrada, false de lo contrario.
     */
    void setHasBeenAdministered(boolean hasBeenAdministered);
}