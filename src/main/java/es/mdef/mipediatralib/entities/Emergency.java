package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.interfaces.IEmergency;
import es.mdef.mipediatralib.interfaces.ISymptom;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Representa una consulta de urgencias.
 * Esta clase hereda de la clase Consultation y también implementa la interfaz IEmergency.
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Emergency extends Consultation implements IEmergency {

    /**
     * Diagnóstico de la consulta de urgencias.
     */
    private String diagnosis;

    /**
     * Tratamiento recomendado para la consulta de urgencias.
     */
    private String treatment;

    /**
     * Lista de síntomas presentados por el paciente durante la consulta de urgencias.
     */
    private Set<ISymptom> symptoms = new HashSet<>();

    /**
     * Devuelve el nombre de la consulta de urgencias.
     *
     * @return Nombre de la consulta de urgencias.
     */
    @Override
    public String getName() {
        return "Consulta de urgencias";
    }
}