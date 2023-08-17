package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		float num1,num2;
		double raiz;
		
		
			System.out.println("Ingrese un numero:");
			num1 = entrada.nextFloat();
			
			double raiz1 = Math.sqrt(num1);
		
			num1 =(int) Math.round(raiz1);
			
		
		System.out.println("el resultado en entero es: "+raiz1);
		
		
		
		
		System.out.println("Ingrese un numero: ");
		num2 = entrada.nextFloat();
		
		
		num2 = (float) Math.random()*10;
		
		System.out.println("el numero es:"+num2);
		
			
		
		
			
		
		
		

		
	}

}
