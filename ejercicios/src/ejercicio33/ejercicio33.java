package ejercicio33;

import java.util.Scanner;

public class ejercicio33 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		String nombre;
		int edad;
		int i;

		for (i = 1; i <= 11; i++) {
			System.out.println("\nCual es el nombre del jugador?: ");
			nombre = datos.next();

			System.out.println("\nIngrese su edad:");
			edad = datos.nextInt();

			

		}
		
		for() {
			
			System.out.println("\nEl nombre del jugador es: " + nombre);
			System.out.println("\nLa edad del jugador es: " + edad);
		}

	}
}
