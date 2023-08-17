package ejercicio52;

import java.util.Scanner;

public class ejercicio52 {
	
	public static void main(String[] args) {
		/*
		 * Consigna: Indicale a un empleador de un local, que indique cu�ntos sanguches
		 * de milanesa se producen cada 2hs. El local abre a las 8hs, y cierra a las
		 * 14hs.
		 * 
		 * Luego, realiz� lo siguiente: Determin� la cantidad m�xima y la cantidad
		 * m�nima. Mostralas en pantalla. Orden� num�ricamente de manera ascendente las
		 * cantidades. Luego, mostr� el array ordenado en pantalla. Descartar todas las
		 * cantidades mayores a 20, y mostrar en pantalla �nicamente las cantidades
		 * menores a 20. Al final del programa, indicar el promedio de cantidades en el
		 * d�a. Luego de terminar el algoritmo, entregar por classroom como
		 * "Apellido.zip", en en cual se debe incluir el paquete (package) y la clase
		 * (class). Se considerar� para la evaluaci�n: Que el algoritmo cumpla con los
		 * puntos anteriormente mencionados. Cada frase mostrada en pantalla, debe estar
		 * expresada de manera prolija. La correcta indentaci�n del c�digo (o sea, que
		 * el c�digo est� ordenado). No es necesario comentar la sintaxis del programa.
		 */
		Scanner datos = new Scanner(System.in);

		int cant_sang = 0, cant_sangmax = 0, cant_sangmin = 1443, promedio = 0;
		int horamin = 0, horamax = 0;
		int[] arreglo = new int[8];

		for (int i = 0; i <= 7; i += 2) { /* que empieza en 0 termina en menor igual a 7 y se va sumando de 2 en 2 */
			/*
			 * if(i == 0) {
			 * System.out.println("cantidad de sanguches producida en la hora: 8");
			 * cant_sang = datos.nextInt(); } else if(i == 1) {
			 * System.out.println("cantidad de sanguches producida en la hora: 10");
			 * cant_sang = datos.nextInt(); } else if(i == 2) {
			 * System.out.println("cantidad de sanguches producida en la hora: 12");
			 * cant_sang = datos.nextInt(); } else if(i == 3) {
			 * System.out.println("cantidad de sanguches producida en la hora: 14");
			 * cant_sang = datos.nextInt(); }
			 */
			System.out.println("cantidad de sanguches producida en la hora:" + (i + 8));
			cant_sang = datos.nextInt();

			if (cant_sang < cant_sangmin) {
				cant_sangmin = cant_sang;
				horamin = i;
			}

			if (cant_sang > cant_sangmax) {
				cant_sangmax = cant_sang;
				horamax = i;
			}
			arreglo[i] = cant_sang;
			promedio = promedio + cant_sang;
			
		}

		System.out
				.println("la cantidad de sanguches producidos minima fue: " + cant_sangmin + " a las " + (horamin + 8));
		System.out
				.println("la cantidad de sanguches producidos maxima fue: " + cant_sangmax + " a las " + (horamax + 8));
		for (int i = 0; i < (arreglo.length - 1) /* i < 4 (5-1) */; i++) {  /* ordenar acendentemente*/

			for (int j = 0; j < (arreglo.length - i - 1); j++) {

				if (arreglo[j] > arreglo[j + 1]) {

					int temporal = arreglo[j];

					arreglo[j] = arreglo[j + 1];
					// La primera posición de las dos, toma el valor de la segunda (que es mas
					// chico).
					arreglo[j + 1] = temporal;
					// La segunda posición, toma el valor mas alto.
				}
			}
		}
		/*termina aqui*/
		
		
		System.out.println("\nArreglo ordenado:");  /* para mostrar el ordenado array pt3*/
		for (int num : arreglo ) {
			if (num !=0) {
				System.out.print(num + " ");
			}
		}   /*termina aqui*/
		
		
		System.out.println("\ncantidades menores a 20:");  /*pt 4 descartar numeros menores a 20 y mostrar*/
		for (int num : arreglo) {
			if (num <= 20 && num !=0) {
				System.out.print(num + " ");
			} /* aca termina pt4 */
		}
		System.out.println("\nel promedio es :" + (promedio / 4));//el promedio da mal por que hay 0's que no pude sacar por como estan hechos los arrays

		/*
		 * if (i==0) {
		 * System.out.println("cantidad de sanguches producida en la hora: "+(i+8));
		 * cant_sang = datos.nextInt(); }
		 */
		/*
		 * else if(i > 0) {
		 * System.out.println("cantidad de sanguches producida en la hora: "+(8+2));
		 * cant_sang = datos.nextInt();
		 * 
		 * }
		 */
		/*
		 * if (i==0) {
		 * System.out.println("cantidad de sanguches producida en la hora: "+(i+8));
		 * cant_sang = datos.nextInt(); }
		 */
	}

}
