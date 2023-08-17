package ejercicio25;

import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int numero = 0, num_bingo, num_ganador, contador = 0;
		boolean intentos = false;

		num_bingo = (int) (Math.random() * 99);
		num_ganador = (int) num_bingo;
		System.out.println(":"+num_ganador);

		while (intentos == false && contador < 5) {
			System.out.println("\nIngresa un numero entre 0 y 99: ");
			numero = datos.nextInt();

			if (numero != num_ganador && intentos == false) {
				System.out.println("\nNo, le erraste.");
				contador++;
				System.out.println("intento numero: " + contador);
			}
			
		}
			if ( contador > 4 ) {
			intentos = true;
		}
			if (intentos == true && contador == 5) {
				System.out.println("\nPerdiste.");
				System.out.println("\nLa cantidad de intentos es:" + contador);
			}
			
			
		
	}
}
