package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		

		int intentos=0,contraseņa;
		
		
		do {
		System.out.println("\nIngrese una contraseņa: ");
		contraseņa = datos.nextInt();
		
		System.out.println("\nLa contraseņa es incorrecta.");
		intentos ++;																
		System.out.println("\nLa cantidad de intentos es:"+intentos);
		}while (contraseņa != 392006 && intentos < 3);
		
		if (contraseņa == 392006 && intentos <= 3 ) {
			System.out.println("\nLa contraseņa es correcta.");
		}
		
		else if (intentos == 3) {
			System.out.println("\nUsuario bloqueado.");
		}		
			
		
	}

}
