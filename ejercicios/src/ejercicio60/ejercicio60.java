package ejercicio60;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio60 {
	
	public static String[] apellidos ;
	
	public static int[] arraynotas ;
	
	static int cantidadNumeros;
	
	
	public static void elementosArray() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Cuantas notas desea ingresar: ?");
		cantidadNumeros = entrada.nextInt(); 
	}
	
	
	public static int ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	  
	
	    for (int i = 0; i < cantidadNumeros ; i++) {
			

			System.out.println("\nIngresa una nota: ");
			arraynotas[i] = entrada.nextInt();
			
			return cantidadNumeros;
			
		}
	    
	   
	    for (int i = 0; i < cantidadNumeros ; i++) {
			System.out.println("\nIngresa un apellido: ");
			apellidos[i] =  entrada.next();
			
	    }
	    return cantidadNumeros;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
	}
	
	
	
}
