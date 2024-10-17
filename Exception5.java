/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel23
 */

import java.util.GregorianCalendar;
/*
NOTA:
El valor 69 representa el mes de febrero, ya que los meses en gregoriancalendar se indexan desde cero.
Por ello el 1 representa el mes de febrero , en este caso por eso se establece la fecha de nacimiento el 4 de febrero de 1964.
Entonces si el valor mayor a 11 (dado que los meses se indexan desde cero), se producira un illegalArgumentException a la hora de ejecutarlo,ya que no 
hay un mes correspondiente a ese numero.
Ahora si sale el numero "59" se refiere a que si el valor 1 representa el mes de febrero ,que normalmente tiene 28 o 29 dias.Dado que 59 es mayor que la
cantidad de dias en febrero,no tiene un efecto en el codigo.
Luego el valor dia se utiliza para establecer la fecha de nacimiento en el objeto gregoriancalendar.Si el valor excede el numero de dias permitidos
para el mes dado, la clase gregoriancalendar lo acomodara de manera automatica a la fecha al siguiente valido.
*/
public class Exception5 {
    public static void main(String[] args) {
        Persona alguien = new Persona();

        GregorianCalendar fechaNacimiento = new GregorianCalendar(1964, 1, 4);
        System.out.println(alguien.obtenerEdad(fechaNacimiento));

        try {
            alguien.ponFechaNacimiento(new GregorianCalendar(2001, 5, 29));
        } catch (EdadFueraDeRangoException e) {
            System.out.println("Se ha producido la excepción");
            System.out.println(e.getMessage());
        }

        try {
            alguien.ponGenero('X');
        } catch (GeneroInvalidoException e) {
            System.out.println("Se ha producido la excepción");
            System.out.println(e.getMessage());
        }

        System.out.println(alguien.obtenerEdad(new GregorianCalendar(2001, 5, 29)));
    }
}

