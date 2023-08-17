package metodos_arrays;

import java.util.Arrays;

public class metodo_sort {

	public static void main(String[] args) {
		// Array de palabras
		String[] arrayPalabras = { "manzana", "banana", "pera", "naranja", "kiwi" };
		String[] arrayCopiaPalabras = arrayPalabras.clone(); // esto NO es obligatorio
		
		// Array de numeros
		int[] arrayNumeros = { 5, 2, 8, 1, 9 };
		int[] arrayCopiaNumeros = arrayNumeros.clone();

		// Ordenar el array en orden ascendente
		Arrays.sort(arrayPalabras);
		Arrays.sort(arrayNumeros);

		// Mostrar elementos del array de palabras desordenado
		System.out.println("Array de palabras desordenado: ");
		for (String palabra : arrayCopiaPalabras) {
			System.out.println(palabra);
		}
		
		System.out.println("");
		
		// Mostrar los elementos del array de palabras ordenado
		System.out.println("Array de palabras ordenado:");
		for (String palabra : arrayPalabras) {
			System.out.println(palabra);
		}
		
		System.out.println("");
		
		// Mostrar los elementos del array de numeros desordenado
		System.out.println("Array de numeros desordenado:");
		for (int numero : arrayCopiaNumeros) {
			System.out.println(numero);
		}
		
		System.out.println("");
		
		// Mostrar los elementos del array de numeros ordenado
		System.out.println("Array de números ordenado:");
		for (int numero : arrayNumeros) {
			System.out.println(numero);
		}
		

	}
}

/*
 * Array ordenado de palabras ordenado: banana kiwi manzana naranja pera
 * 
 * Array ordenado de numeros: 1 2 5 8 9
 */
