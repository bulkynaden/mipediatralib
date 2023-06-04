package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.interfaces.IMeasurement;
import lombok.Data;

/**
 * Representa una medición realizada a una persona.
 * Esta clase implementa la interfaz IMeasurement.
 */
@Data
public class Measurement implements IMeasurement {
    /**
     * Diámetro craneal registrado en la medición.
     */
    private double cranialDiameter;

    /**
     * Altura registrada en la medición.
     */
    private double height;

    /**
     * Peso registrado en la medición.
     */
    private double weight;
}