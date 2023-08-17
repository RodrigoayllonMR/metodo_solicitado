package ejercicio57;

import java.util.Scanner;

public class ejercicio57 {
	
	
	
	
	static float num1;
	
	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa un numero: ");
	    num1 = entrada.nextFloat();
	    
	}
	
	
	public static int entero() { 
	    
	    int variable_entera = (int) num1;
	    
	    
	    
	    				
	    
	    
	    
	    return variable_entera;
	}
	
	
	public static void main(String[] args) {
		
		ingresarNumeros();
		entero();
		System.out.println(""+entero());
		
	}

}
