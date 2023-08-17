package metodos_arrays;

import java.util.Scanner;

public class longitud_array {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		String[] nombre = new String[4];

		for (int i = 0; i < nombre.length; i++) {
			/* 'nombre' es el array, y 'length' nos da la cantidad
				de elementos del array (en este caso, 4). 
				Nos da un número entero. 
			*/
			System.out.println("Ingresa un nombre: ");
			nombre[i] = datos.next();

		}

		for (int i = 0; i <= 3; i++) {

			System.out.println("Mostrar todos los nombres: " + nombre[i]);

		}

	}
}



	
