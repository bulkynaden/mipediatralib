package es.mdef.mipediatralib.constants;

/**
 * Enumeración que representa los posibles valores para el sexo de un paciente.
 */
public enum Gender {

    /**
     * Valor que representa el sexo masculino.
     */
    HOMBRE("Hombre"),

    /**
     * Valor que representa el sexo femenino.
     */
    MUJER("Mujer");

    /**
     * Valor que representa el sexo.
     */
    private final String value;

    /**
     * Constructor de la clase.
     *
     * @param value Valor que representa el sexo.
     */
    Gender(String value) {
        this.value = value;
    }

    /**
     * Método que devuelve el sexo correspondiente a un valor.
     *
     * @param value Valor del sexo.
     * @return Sexo correspondiente al valor.
     */
    public static Gender fromValue(String value) {
        for (Gender gender : Gender.values()) {
            if (gender.value.equalsIgnoreCase(value.trim())) {
                return gender;
            }
        }
        return null;
    }

    /**
     * Método que devuelve el valor del sexo.
     *
     * @return Valor del sexo.
     */
    public String getValue() {
        return value;
    }

    /**
     * Método que devuelve el valor del sexo.
     *
     * @return Valor del sexo.
     */
    @Override
    public String toString() {
        return value;
    }
}
