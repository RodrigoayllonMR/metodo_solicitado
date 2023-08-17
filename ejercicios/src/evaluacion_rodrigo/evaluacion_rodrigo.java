package evaluacion_rodrigo;

import java.util.Arrays;
import java.util.Scanner;

public class evaluacion_rodrigo {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		int suma, max = -100000, min = 100000;
		
		
		int[] sanguches = new int[15];

		
		
		for (int i = 8; i < 15; i+=2) {

			System.out.println("\nIngrese la cantidad de sanguches de milanesa a las  " + i + " hs");
			sanguches[i] = datos.nextInt();

			if (sanguches[i] > max) {
				max = sanguches[i];
			}

			if (sanguches[i] < min) {
				min = sanguches[i];
			}

		}
		
		
	
		
		System.out.println("");
		System.out.println("La hora con menor sanguches es: " + min);
		System.out.println("La hora con mayor sanguches es: " + max);
		
		
		
		

		for (int i = 0; i < (15 - 1) ; i++) {
			 
			for (int j = 0; j < (15 - i - 1) ; j++) {
			
				
				if (sanguches[j] > sanguches[j + 1]) {
				
					int temporal = sanguches[j];
					
					sanguches[j] = sanguches[j + 1];
					
					sanguches[j + 1] = temporal;
					
				}
			}
		}

		// Mostrar el arreglo ordenado
		System.out.println("\nArreglo ordenado:");
		for (int num : sanguches) {
			System.out.print(num + " ");
		}
		
		
		
		
		
	
		
	}

}
