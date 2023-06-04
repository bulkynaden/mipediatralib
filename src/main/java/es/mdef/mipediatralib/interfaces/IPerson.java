package es.mdef.mipediatralib.interfaces;

import es.mdef.mipediatralib.constants.BloodType;
import es.mdef.mipediatralib.constants.Gender;

import java.time.ZonedDateTime;

/**
 * Representa a una persona en el sistema. Hereda de la interfaz IPatient.
 */
public interface IPerson extends IPatient {

    /**
     * Devuelve el nombre de la persona.
     *
     * @return el nombre de la persona.
     */
    String getName();

    /**
     * Establece el nombre de la persona.
     *
     * @param name el nombre de la persona.
     */
    void setName(String name);

    /**
     * Devuelve los apellidos de la persona.
     *
     * @return los apellidos de la persona.
     */
    String getLastName();

    /**
     * Establece los apellidos de la persona.
     *
     * @param lastName los apellidos de la persona.
     */
    void setLastName(String lastName);

    /**
     * Devuelve el Documento Nacional de Identidad (DNI) de la persona.
     *
     * @return el DNI de la persona.
     */
    String getDni();

    /**
     * Establece el Documento Nacional de Identidad (DNI) de la persona.
     *
     * @param dni el DNI de la persona.
     */
    void setDni(String dni);

    /**
     * Devuelve el sexo de la persona.
     *
     * @return el sexo de la persona.
     */
    Gender getGender();

    /**
     * Establece el sexo de la persona.
     *
     * @param gender el sexo de la persona.
     */
    void setGender(Gender gender);

    /**
     * Devuelve la comunidad autónoma de la persona.
     *
     * @return la comunidad autónoma de la persona.
     */
    IAutonomousCommunity getAutonomousCommunity();

    /**
     * Establece la comunidad autónoma de la persona.
     *
     * @param autonomousCommunity la comunidad autónoma de la persona.
     */
    void setAutonomousCommunity(IAutonomousCommunity autonomousCommunity);

    /**
     * Devuelve la fecha de nacimiento de la persona.
     *
     * @return la fecha de nacimiento de la persona.
     */
    ZonedDateTime getBirthdate();

    /**
     * Establece la fecha de nacimiento de la persona.
     *
     * @param birthdate la fecha de nacimiento de la persona.
     */
    void setBirthdate(ZonedDateTime birthdate);

    /**
     * Devuelve el grupo sanguíneo de la persona.
     *
     * @return el grupo sanguíneo de la persona.
     */
    BloodType getBloodType();

    /**
     * Establece el grupo sanguíneo de la persona.
     *
     * @param bloodType el grupo sanguíneo de la persona.
     */
    void setBloodType(BloodType bloodType);

    /**
     * Devuelve el peso de la persona al nacer.
     *
     * @return el peso de la persona al nacer.
     */
    double getBirthWeight();

    /**
     * Establece el peso de la persona al nacer.
     *
     * @param birthWeight el peso de la persona al nacer.
     */
    void setBirthWeight(double birthWeight);
}