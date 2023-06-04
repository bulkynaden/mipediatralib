package es.mdef.mipediatralib.interfaces;

/**
 * Interfaz que representa una medición.
 */
public interface IMeasurement {

    /**
     * Devuelve el diámetro craneal registrado en la medición.
     *
     * @return el diámetro craneal registrado en la medición.
     */
    double getCranialDiameter();

    /**
     * Establece el diámetro craneal registrado en la medición.
     *
     * @param cranialDiameter el diámetro craneal registrado en la medición.
     */
    void setCranialDiameter(double cranialDiameter);

    /**
     * Devuelve la altura registrada en la medición.
     *
     * @return la altura registrada en la medición.
     */
    double getHeight();

    /**
     * Establece la altura registrada en la medición.
     *
     * @param height la altura registrada en la medición.
     */
    void setHeight(double height);

    /**
     * Devuelve el peso registrado en la medición.
     *
     * @return el peso registrado en la medición.
     */
    double getWeight();

    /**
     * Establece el peso registrado en la medición.
     *
     * @param weight el peso registrado en la medición.
     */
    void setWeight(double weight);
}