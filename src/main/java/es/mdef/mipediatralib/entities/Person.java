package es.mdef.mipediatralib.entities;

import es.mdef.mipediatralib.constants.BloodType;
import es.mdef.mipediatralib.constants.Gender;
import es.mdef.mipediatralib.interfaces.IAutonomousCommunity;
import es.mdef.mipediatralib.interfaces.IPerson;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.ZonedDateTime;

/**
 * Representa a una persona en el sistema. Hereda de la clase Patient.
 * Esta clase implementa la interfaz IPerson.
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Person extends Patient implements IPerson {
    /**
     * Nombre de la persona.
     */
    private String name;

    /**
     * Apellido de la persona.
     */
    private String lastName;

    /**
     * DNI (Documento Nacional de Identidad) de la persona.
     */
    private String dni;

    /**
     * Género de la persona.
     */
    private Gender gender;

    /**
     * Comunidad autónoma a la que pertenece la persona.
     */
    private IAutonomousCommunity autonomousCommunity;

    /**
     * Fecha de nacimiento de la persona.
     */
    private ZonedDateTime birthdate;

    /**
     * Grupo sanguíneo de la persona.
     */
    private BloodType bloodType;

    /**
     * Peso al nacer de la persona.
     */
    private double birthWeight;
}