package fpdualeveris;

/**
 * @author rdiahern
 * Primer desaf�o Java
 * 
 */

import variables.Developer;

public class FPDual {

	public static void main(String[] args) {

		variablesChallenge();

	}

	/**
	 * M�todo principal
	 * 
	 */

	private static void variablesChallenge() {

		// Creaci�n de programadores(4 min)
		Developer programmer1 = new Developer("Mar�a");
		Developer programmer2 = new Developer("Sandra");
		Developer programmer3 = new Developer("Raul");
		Developer programmer4 = new Developer("Pedro");
		Developer programmer5 = new Developer("Patricia");

		// Mostrar nombre de la empresa
		System.out.println("El programador pertenece a la empresa: " + Developer.BUSINESS);

		// Mostrar n�mero de empleados
		System.out.println("El total de empleados para el trabajador 1 es " + programmer1.getContEmployee());
		System.out.println("El total de empleados para el trabajador 5 es " + programmer5.getContEmployee());

		// Restar 2 d�as de vacaciones al segundo trabajador

		programmer2.controlholidays(2);

		// Mostrar d�as de vacaciones
		System.out.println("El programador 1 cuenta con " + programmer1.getDayshol() + " d�as de vacaciones");
		System.out.println("El programador 2 cuenta con " + programmer2.getDayshol() + " d�as de vacaciones");
		System.out.println("El programador 3 cuenta con " + programmer3.getDayshol() + " d�as de vacaciones");
		System.out.println("El programador 4 cuenta con " + programmer4.getDayshol() + " d�as de vacaciones");
		System.out.println("El programador 5 cuenta con " + programmer5.getDayshol() + " d�as de vacaciones");

		// Mostrar n�mero de empleado
		System.out.println("El n�mero de empleado del programador 1 es : " + programmer1.getNum());
		System.out.println("El n�mero de empleado del programador 2 es : " + programmer2.getNum());
		System.out.println("El n�mero de empleado del programador 3 es : " + programmer3.getNum());
		System.out.println("El n�mero de empleado del programador 4 es : " + programmer4.getNum());
		System.out.println("El n�mero de empleado del programador 5 es : " + programmer5.getNum());

	}

}
