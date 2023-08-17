package ejercicio48;

import java.util.Arrays;

import java.util.Scanner;

public class ejercicio48 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String[] apellido = new String[4];
		

		for (int i = 0; i < apellido.length; i++) {
			

			System.out.println("Ingresa un apellido: ");
			apellido[i] = datos.next();
		
	}
	
		Arrays.sort(apellido);
		
		System.out.println("Apellidos ordenados alfabeticamente: ");
		for (String apellido1: apellido) {
			System.out.println(apellido1);
		}
		
		
		
		
		
		
	}
}
