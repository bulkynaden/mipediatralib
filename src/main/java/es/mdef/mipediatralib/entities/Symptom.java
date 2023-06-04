package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.interfaces.ISymptom;
import lombok.Data;

/**
 * Representa un síntoma que puede presentar un paciente.
 */
@Data
public class Symptom implements ISymptom {
    /**
     * Nombre del síntoma.
     */
    private String name;
}