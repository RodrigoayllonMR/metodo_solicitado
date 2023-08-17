package repaso_de_evaluacion;

import java.util.Scanner;

public class repaso_de_evaluacion {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int num;

		System.out.println("\nIngrese la cantidad de numeros DNI a ingresar: ");
		num = datos.nextInt();

		int[] DNI = new int[num];

		for (int i = 0; i < num; i++) {

			System.out.println("\nIngrese un DNI: ");
			DNI[i] = datos.nextInt();

		}

		for (int i = 0; i < (DNI.length - 1); i++) {

			for (int j = 0; j < (DNI.length - i - 1); j++) {

				if (DNI[j] > DNI[j + 1]) {

					int temporal = DNI[j];

					DNI[j] = DNI[j + 1];

					DNI[j + 1] = temporal;

				}
			}
		}

		System.out.println("\nArreglo ordenado:");
		for (int num1 : DNI) {
			System.out.println();
			System.out.print(num1 + " ");
		}

		int nombres;

		System.out.println("\nIngrese la cantidad de apellidos a ingresar: ");
		nombres = datos.nextInt();

		String[] apellido = new String[nombres];

		for (int i = 0; i < nombres; i++) {

			System.out.println("\nIngrese un apellido: ");
			apellido[i] = datos.next();

		}

		boolean busqueda = false;

		System.out.println("\nIngrese el DNI que desea buscar: ");
		int dni_busqueda = datos.nextInt();

		for (int i = 0; i < num; i++) {

			if (dni_busqueda == DNI[i]) {
				System.out.println("\nEl DNI es: " + DNI[i] + "\nY el apellido es: " + apellido[i]);

				busqueda = true;

			}

		}

		if (busqueda == false) {

			System.out.println("\nEl DNI no existe en este programa.");

		}

	}

}
