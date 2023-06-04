package es.mdef.mipediatralib.interfaces;

/**
 * Interfaz que representa los detalles de una vacuna.
 */
public interface IVaccineDetails {

    /**
     * Obtiene el nombre completo de la vacuna.
     *
     * @return el nombre completo de la vacuna.
     */
    String getName();

    /**
     * Establece el nombre completo de la vacuna.
     *
     * @param name el nuevo nombre completo de la vacuna.
     */
    void setName(String name);

    /**
     * Obtiene el nombre corto de la vacuna.
     *
     * @return el nombre corto de la vacuna.
     */
    String getShortName();

    /**
     * Establece el nombre corto de la vacuna.
     *
     * @param shortName el nuevo nombre corto de la vacuna.
     */
    void setShortName(String shortName);
}