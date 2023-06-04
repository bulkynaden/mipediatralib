package es.mdef.mipediatralib.constants;

/**
 * Enumeración para representar los grupos sanguíneos.
 * <p>
 * Esta enumeración contiene los diferentes tipos de grupos sanguíneos, junto con sus
 * respectivos antígenos y anticuerpos.
 */
public enum BloodType {
    A_POSITIVE("A+", "A", "Rh+"),
    A_NEGATIVE("A-", "A", "Rh-"),
    B_POSITIVE("B+", "B", "Rh+"),
    B_NEGATIVE("B-", "B", "Rh-"),
    AB_POSITIVE("AB+", "AB", "Rh+"),
    AB_NEGATIVE("AB-", "AB", "Rh-"),
    O_POSITIVE("O+", "O", "Rh+"),
    O_NEGATIVE("O-", "O", "Rh-");

    private final String displayName;
    private final String antigen;
    private final String antibody;

    /**
     * Constructor privado para inicializar los valores de la enumeración.
     *
     * @param displayName La representación del grupo sanguíneo.
     * @param antigen     El antígeno del grupo sanguíneo.
     * @param antibody    El anticuerpo del grupo sanguíneo.
     */
    BloodType(String displayName, String antigen, String antibody) {
        this.displayName = displayName;
        this.antigen = antigen;
        this.antibody = antibody;
    }

    /**
     * Devuelve la representación del grupo sanguíneo.
     *
     * @return La representación amigable del grupo sanguíneo.
     */
    @Override
    public String toString() {
        return displayName;
    }

    /**
     * Devuelve el antígeno del grupo sanguíneo.
     *
     * @return El antígeno del grupo sanguíneo.
     */
    public String getAntigen() {
        return antigen;
    }

    /**
     * Devuelve el anticuerpo del grupo sanguíneo.
     *
     * @return El anticuerpo del grupo sanguíneo.
     */
    public String getAntibody() {
        return antibody;
    }
}