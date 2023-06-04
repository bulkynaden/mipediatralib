package es.mdef.mipediatralib.interfaces;

import java.time.Period;

/**
 * Interfaz que representa un recordatorio con tiempo restante y un nombre.
 * Las clases que implementan esta interfaz son comparables según el tiempo restante para el recordatorio.
 */
public interface IReminder extends Comparable<IReminder> {

    /**
     * Devuelve el tiempo restante para este recordatorio como un Period.
     *
     * @return el tiempo restante como un Period
     */
    Period getTimeLeft();

    /**
     * Devuelve el nombre de este recordatorio.
     *
     * @return el nombre del recordatorio
     */
    String getName();

    /**
     * Devuelve el paciente que debe realizar este recordatorio.
     *
     * @return el paciente que debe realizar este recordatorio
     */
    IPatient getPatient();

    /**
     * Compara dos objetos IReminder según su tiempo restante.
     *
     * @param o el otro objeto IReminder a comparar
     * @return un valor negativo si este recordatorio tiene menos tiempo restante,
     * cero si tienen el mismo tiempo restante,
     * o un valor positivo si este recordatorio tiene más tiempo restante
     */
    @Override
    default int compareTo(IReminder o) {
        return comparePeriods(this.getTimeLeft(), o.getTimeLeft());
    }

    /**
     * Compara dos objetos Period según la cantidad total de días (aproximados).
     *
     * @param p1 el primer objeto Period a comparar
     * @param p2 el segundo objeto Period a comparar
     * @return un valor negativo si p1 tiene menos días,
     * cero si tienen la misma cantidad de días,
     * o un valor positivo si p1 tiene más días
     */
    private int comparePeriods(Period p1, Period p2) {
        long days1 = p1.toTotalMonths() * 30L + p1.getDays();
        long days2 = p2.toTotalMonths() * 30L + p2.getDays();
        return Long.compare(days1, days2);
    }
}