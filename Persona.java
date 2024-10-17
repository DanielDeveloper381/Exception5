/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel23
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Persona {
    private GregorianCalendar fechaNacimiento;
    private char genero;

    public void ponFechaNacimiento(GregorianCalendar fechaNacimiento) throws EdadFueraDeRangoException {
        int edad = calcularEdad(fechaNacimiento);
        if (edad < 0) {
            throw new EdadFueraDeRangoException("La fecha de nacimiento es inválida");
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    public void ponGenero(char genero) throws GeneroInvalidoException {
        if (genero != 'H' && genero != 'M') {
            throw new GeneroInvalidoException("El género debe ser 'H' o 'M'");
        }
        this.genero = genero;
    }

    public int calcularEdad(GregorianCalendar fechaNacimiento) {
        Calendar now = new GregorianCalendar();
        int res = now.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if ((fechaNacimiento.get(Calendar.MONTH) > now.get(Calendar.MONTH))
                || (fechaNacimiento.get(Calendar.MONTH) == now.get(Calendar.MONTH)
                && fechaNacimiento.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
            res--;
        }
        return res;
    }

    public String obtenerEdad(GregorianCalendar fechaNacimiento) {
        int edad = calcularEdad(fechaNacimiento);
        return "Edad: " + edad + " años";
    }
}
