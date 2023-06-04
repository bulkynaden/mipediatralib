package es.mdef.mipediatralib.interfaces;

/**
 * Interfaz que representa una comunidad autónoma.
 */
public interface IAutonomousCommunity {
    /**
     * Obtiene el nombre de la comunidad autónoma.
     *
     * @return Nombre de la comunidad autónoma.
     */
    String getName();

    /**
     * Establece el nombre de la comunidad autónoma.
     *
     * @param name Nombre de la comunidad autónoma.
     */
    void setName(String name);
}