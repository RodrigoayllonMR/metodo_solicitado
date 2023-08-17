package ingresardatos;

import java.util.Scanner;

public class IngresarDatos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String Nombre1,Nombre2;
		
		System.out.println("Ingresar nombre del 1er alumno:");
		
		Nombre1 = entrada.next();
		
		System.out.println("Tu nombre es "+ Nombre1);
		
		System.out.println("Ingresar 2do nombre del alumno:");
		
		Nombre2 = entrada.next();
		
		System.out.println("Otro nombre es "+ Nombre2);
		
		byte Edad1, Edad2;
		
		System.out.println("Ingresar edad del 1er alumno: ");
		
		Edad1 = entrada.nextByte();
		
		System.out.println("la edad del 1er alumno es: "+ Edad1);
		
		System.out.println("Ingresar edad del 2do alumno: ");
		
		Edad2 = entrada.nextByte();
		
	    System.out.println("La edad del 2do alumno es "+ Edad2);
	}
	
	

}
