package es.mdef.mipediatralib.interfaces;

/**
 * Interfaz que representa una visita rutinaria.
 * Esta interfaz hereda de la interfaz IConsultation.
 */
public interface IRegularVisit extends IConsultation {
    /**
     * Devuelve la medida tomada durante la visita.
     *
     * @return la medida tomada durante la visita.
     */
    IMeasurement getMeasurement();

    /**
     * Establece la medida tomada durante la visita.
     *
     * @param measurement la medida tomada durante la visita.
     */
    void setMeasurement(IMeasurement measurement);
}