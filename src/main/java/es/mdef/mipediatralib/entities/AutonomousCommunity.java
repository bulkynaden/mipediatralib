package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.interfaces.IAutonomousCommunity;
import lombok.Data;

/**
 * Representa una comunidad autónoma.
 * Esta clase implementa la interfaz IAutonomousCommunity.
 */
@Data
public class AutonomousCommunity implements IAutonomousCommunity {
    /**
     * Nombre de la comunidad autónoma.
     */
    private String name;
}