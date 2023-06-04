package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.interfaces.IMeasurement;
import es.mdef.mipediatralib.interfaces.IRegularVisit;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Representa una visita rutinaria de un paciente al centro médico.
 * Esta clase hereda de la clase Consultation y también implementa la interfaz IRegularVisit.
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RegularVisit extends Consultation implements IRegularVisit {
    /**
     * Medición realizada durante la visita rutinaria.
     */
    private IMeasurement measurement;

    @Override
    public String getName() {
        return "Visita rutinaria";
    }
}