package ejercicio5;

import java.util.Scanner;
public class ejercicio5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int numero;
		
		
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();
		
		double  raiz = Math.sqrt(numero);
		
			System.out.println("La raiz cuadrada con decimales es: "+raiz);
			
			 int numero1 = (int) Math.round(raiz);
			 
			System.out.println("La raiz cuadrada redondeada es: "+numero);
		 
	
		
	}

}
