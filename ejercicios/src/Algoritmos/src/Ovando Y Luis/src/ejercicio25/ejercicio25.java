package ejercicio25;

import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int numero,num_bingo,num_ganador,contador=0;
		boolean intentos = false;
		
		num_bingo = (int) (Math.random()*99); 
		num_ganador = (int) num_bingo;

		do {
			System.out.println("\nIngresa un numero entre 0 y 99: ");
			numero = datos.nextInt();
			
			System.out.println("\nNo, le erraste.");
			contador++;
			System.out.println("intento numero: " +contador);
			
		}while (numero != num_ganador && intentos == false );
		
		
		if (contador >= 5 && intentos == true ) {
			System.out.println("\nPerdiste.");
			
			System.out.println("Cantidad de intentos: " +contador);
			
		}
			
		
			
		}
	}

