package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		Float numero;
		int numRedondeado;
		
		System.out.println("ingrese la nota del examen con decimales: ");
		numero = entrada.nextFloat();
		
		
	 numRedondeado =(int) Math.round(numero);
		
		
		
		System.out.println("La nota del examen redondeado es: "+numRedondeado);
		
		
		
	}
	
	
	
	
	
	
}

	