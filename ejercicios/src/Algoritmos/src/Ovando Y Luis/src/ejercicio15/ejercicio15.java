package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int costo,multip;
		
		System.out.println("\nIngresar el costo total: ");
		costo = entrada.nextInt();
		
		
		
		
		
		if (costo>15000){
			int costo*0.10F;
			System.out.println("\nEl costo total menos el descuento es"+costo);
		}
	 	
		else  {
			System.out.println("\nEl costo total es: "+costo);
		}
		
	
		
		
	}

}
