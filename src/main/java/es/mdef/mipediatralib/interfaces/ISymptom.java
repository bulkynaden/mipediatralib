package es.mdef.mipediatralib.interfaces;

/**
 * Interfaz que representa un síntoma.
 */
public interface ISymptom {

    /**
     * Devuelve el nombre del síntoma.
     *
     * @return el nombre del síntoma.
     */
    String getName();

    /**
     * Establece el nombre del síntoma.
     *
     * @param name el nombre del síntoma.
     */
    void setName(String name);
}