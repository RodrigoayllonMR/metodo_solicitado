package metodos_arrays;

// Necesitamos la biblioteca java.util.Arrays.
import java.util.Arrays;

public class clonar_array {

	public static void main(String[] args) {
		// Defino el array
		int[] arrayOriginal = { 1, 2, 3, 4, 5 };
		// Copio el array anterior, en otro array.
		int[] arrayCopia = arrayOriginal.clone();

		// Modificar un elemento en el array copiado
		arrayCopia[0] = 10;

		for (int i = 0; i < arrayOriginal.length; i++) {
			System.out.println("Array original: " + arrayOriginal[i]);
		}
		
		System.out.println(""); // dejo un espacio de una linea
		
		for (int i = 0; i < arrayOriginal.length; i++) {

			System.out.println("Array copia: " + arrayCopia[i]);
		}

	}
}
