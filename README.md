# Exception5
1. En el ejemplo 5 de excepciones (donde se crea una excepción para la edad fuera de rango) realice:
 Cambie el campo de edad por la fecha de nacimiento (clase GregorianCalendar)
 Cambie el método ponEdad por ponFechaNacimiento
 Agregue una excepción a el método ponGenero para que sólo acepte ‘H’ p ‘M’
Cambie las validaciones calculando la edad de la persona al momento de agregarla, se puede
utilizar el método que pongo a continuación para calcular la edad en años
public int edad (GregorianCalendar nacimiento) {
Calendar now = new GregorianCalendar();
int res = now.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);
if ((nacimiento.get(Calendar.MONTH) > now.get(Calendar.MONTH))
|| (nacimiento.get(Calendar.MONTH) == now.get(Calendar.MONTH) &&
nacimiento.get(Calendar.DAY_OF_MONTH) > now
.get(Calendar.DAY_OF_MONTH))) {
res--;
}
