package intento_de_rodrigo;

import java.util.Scanner;

public class intento_de_rodrigo {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int num1, num2, suma, ing0, contador=1;
		
		do {
			
		System.out.println("Ingresar el primer numero");
		num1 = datos.nextInt();
	
		System.out.println("Ingresar el segundo numero");
		num2 = datos.nextInt();
		
		suma = num1+num2;
		
		System.out.println("El resultado de la suma es: "+suma);
		
		System.out.println("Si desea salir del programa debe ingresar 0: ");
		ing0 = datos.nextInt();
	    
		contador++;
		}while(ing0 != 0);
		
		if (ing0 == 0) {
			System.out.println("\nSaliste del programa.");
		}
	}
}
