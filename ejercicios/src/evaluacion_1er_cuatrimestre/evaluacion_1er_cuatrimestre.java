package evaluacion_1er_cuatrimestre;

import java.util.Scanner;

public class evaluacion_1er_cuatrimestre {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int max = -100000, min = 100000;  /* variable maxima y minima pt 1 */

		int[] legajo = new int[5]; /* array para guardar varios datos del mismo tipo */

		String[] apellidos = new String[5];

		int[] nota = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("\nIngrese el numero de legajo: ");
			legajo[i] = datos.nextInt();

		}

		System.out.println("\n");

		for (int i = 0; i < (legajo.length - 1); i++) {

			for (int j = 0; j < (legajo.length - i - 1); j++) {

				if (legajo[j] > legajo[j + 1]) {

					int temporal = legajo[j];

					legajo[j] = legajo[j + 1];

					legajo[j + 1] = temporal;

				}
			}
		}

		System.out.println("\nArreglo ordenado:");
		for (int num : legajo) {
			System.out.print(num + " ");
		}

		System.out.println("\n");

		for (int i = 0; i < 5; i++) {

			System.out.println("\nIngrese el apellido de los estudiantes: ");
			apellidos[i] = datos.next();
		}

		System.out.println("\n");

		for (int i = 0; i < 5; i++) {

			System.out.println("\nIngrese la nota con la que aprobo el examen de ingreso: ");
			nota[i] = datos.nextInt();

			if (nota[i] > max) {
				max = nota[i];
			}

			if (nota[i] < min) {
				min = nota[i];
			}

		}

		System.out.println("\n");

		int suma = nota[0] + nota[1] + nota[2] + nota[3] + nota[4];

		int div = suma / 5;

		for (int i = 0; i < 5; i++) {

			System.out.println("\nEl apellido del estudiante es:" + apellidos[i] + ", su numero de legajo es "
					+ legajo[i] + " y su examen de ingreso es : " + nota[i]);

		}

		System.out.println("\n");

		for (int i = 0; i < 1; i++) {

			System.out.println("\nLa nota mas alta es: " + max + " y pertenece a " + apellidos[i]);
			System.out.println("\nLa nota mas baja es: " + min + " y pertenece a " + apellidos[i]);

		}

		System.out.println("\n");

		System.out.println("\nEl promedio de los examenes es:" + div);

	}
}
