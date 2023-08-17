package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		

		int intentos=0,contraseña;
		
		
		do {
		System.out.println("\nIngrese una contraseña: ");
		contraseña = datos.nextInt();
		
		System.out.println("\nLa contraseña es incorrecta.");
		intentos ++;																
		System.out.println("\nLa cantidad de intentos es:"+intentos);
		}while (contraseña != 392006 && intentos < 3);
		
		if (contraseña == 392006 && intentos <= 3 ) {
			System.out.println("\nLa contraseña es correcta.");
		}
		
		else if (intentos == 3) {
			System.out.println("\nUsuario bloqueado.");
		}		
			
		
	}

}
