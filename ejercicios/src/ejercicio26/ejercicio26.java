package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		

		int intentos=0,contrase�a;
		
		
		do {
		System.out.println("\nIngrese una contrase�a: ");
		contrase�a = datos.nextInt();
		
		System.out.println("\nLa contrase�a es incorrecta.");
		intentos ++;																
		System.out.println("\nLa cantidad de intentos es:"+intentos);
		}while (contrase�a != 392006 && intentos < 3);
		
		if (contrase�a == 392006 && intentos <= 3 ) {
			System.out.println("\nLa contrase�a es correcta.");
		}
		
		else if (intentos == 3) {
			System.out.println("\nUsuario bloqueado.");
		}		
			
		
	}

}
