package ejercicio36;

import java.util.Scanner;

public class ejercicio36 {
	
	public static void main(String[] args) {
		

		Scanner datos = new Scanner(System.in);

		int suma, max = -100000, min = 100000; /* declaras un valor muy bajo para la variable max y un valor muy alto para a variable min */
		int[] ganancias = new int[18];  

		for (int i = 8; i < 18; i++) {

			System.out.println("\nIngrese las ganancias a las " + i + " hs");
			ganancias[i] = datos.nextInt();

			if (ganancias[i] > max) { /* es para sacar la ganacia maxima*/
				max = ganancias[i];
			}

			if (ganancias[i] < min) { /* es para ganar la ganancia minima*/
				min = ganancias[i];
			}

		}
		System.out.println("La hora con menor ingresos es: " + min);
		System.out.println("La hora con mayor ingresos es: " + max);

		suma = ganancias[1] + ganancias[2] + ganancias[3] + ganancias[4] + ganancias[5] + ganancias[6] + ganancias[7]
				+ ganancias[8] + ganancias[9] + ganancias[10];
		
	

		System.out.println("\nEl ingreso total del dia es: " + suma);

		
	}

}
