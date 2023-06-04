package es.mdef.mipediatralib.interfaces;

import java.util.Set;

/**
 * Interfaz que representa una consulta de urgencias.
 * Esta interfaz hereda de la interfaz IConsultation.
 */
public interface IEmergency extends IConsultation {

    /**
     * Devuelve el diagnóstico de la consulta de urgencias.
     *
     * @return el diagnóstico de la consulta de urgencias.
     */
    String getDiagnosis();

    /**
     * Establece el diagnóstico de la consulta de urgencias.
     *
     * @param diagnosis el diagnóstico de la consulta de urgencias.
     */
    void setDiagnosis(String diagnosis);

    /**
     * Devuelve el tratamiento recomendado para la consulta de urgencias.
     *
     * @return el tratamiento recomendado para la consulta de urgencias.
     */
    String getTreatment();

    /**
     * Establece el tratamiento recomendado para la consulta de urgencias.
     *
     * @param treatment el tratamiento recomendado para la consulta de urgencias.
     */
    void setTreatment(String treatment);

    /**
     * Devuelve la lista de síntomas presentados por el paciente durante la consulta de urgencias.
     *
     * @return la lista de síntomas presentados por el paciente durante la consulta de urgencias.
     */
    Set<ISymptom> getSymptoms();

    /**
     * Establece la lista de síntomas presentados por el paciente durante la consulta de urgencias.
     *
     * @param symptoms la lista de síntomas presentados por el paciente durante la consulta de urgencias.
     */
    void setSymptoms(Set<ISymptom> symptoms);
}