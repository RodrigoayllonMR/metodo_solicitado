package TP1_primer_bimestre; /* es el nombre del paquete*/

import java.util.Scanner; /* es la libreria del scanner */

public class TP1 {
	
	public static void main(String[] args) { /* esto linea de codigo es la funcion principal*/
		Scanner datos = new Scanner(System.in); /* esta linea es para ingresar datos*/
		
		int opc,num_raiz,raiz_cuadrada,num_signo,num_bingo,num_ganador,numero; /* esta linea de codigo son las variables enteras */
		double num_ganador_double; /* la variable double es para los numeros con decimales es como un float pero te deja ingresar mas decimales */
		
		System.out.println("\tEste programa te permite resolver algunos problemas"); /* esta linea sirve para mostrar en pantalla, y \t es para centrar lo que sale en pantalla*/
		System.out.println("\tElija una opcion: ");
		System.out.println("1. Calcular raiz cuadrada");
		System.out.println("2. Analizar si un numero es positivo, negativo o cero.");
		System.out.println("3. Jugar al bingo.");

		opc = datos.nextInt(); /* esta linea sirve para guardar los datos que se ingresen en la variable opc */

		switch (opc) { /* Lo que hace switch es ejecutar cada caso que tienen que ser entero o caracter y tambien analiza la variabble opc*/

		case 1: /* case son las opciones a ingresar, estas pueden ser enteras o caracteres pero para que sean caracteres tiene que estar con apostrofes*/ 
			System.out.println("Ingresa un numero para calcular su raiz cuadrada: ");
			num_raiz = datos.nextInt(); /* esta linea de codigo guarda los datos ingresados en la variable num_raiz  */
			
			if (num_raiz >= 0) { /* esta linea dice que si el numeo ingresado es mayor o igual a 0 se le saca la raiz cuadrada osea se cumple la condicion y se muestra en pantalla y si es negativo no se hace la raiz*/
				 raiz_cuadrada = (int) Math.sqrt(num_raiz);
				System.out.println("El resultado es: " + raiz_cuadrada);
			}
			 else {
				System.out.println("No se puede calcular la raiz de un negativo.");
			}
			 break; /* lo que hace el break es indicar que aca termina el switch si no lo ponemos se seguira ejecutando el siguiente caso*/
			
		case 2:
			System.out.println("Ingresa un numero: ");
			num_signo = datos.nextInt();

			if (num_signo == 0) { /* lo que dice aca es que si el numero ingresado es igual a 0 se muestra en pantalla, si es mayor a 0 te sale que es positivo y si es menor que 0 te sale que es negativo*/
				System.out.println("El numero es cero");
			} else if (num_signo > 0) { /* el else if es un si no se cumple la condicion del if pasa a esa condicion */
				System.out.println("El numero es positivo");
			} else { /* la condicion del else lo analiza el if*/
				System.out.println("El numero es negativo");
			}

			break;

		case 3:
			System.out.println("Ingresa un numero entre 0 y 9: ");
			numero = datos.nextInt();

			num_bingo = (int) (Math.random()*9); 
			num_ganador_double = (int) num_bingo;

			if (numero == num_ganador_double) {  /* Lo que dice aca es si el numero ingresado es igual al numero random te sale por pantalla que ganaste si no te sale que perdiste*/
				System.out.println("Ganaste!");
			} else {
				System.out.println("Perdiste");
				System.out.println("El numero ganador es: " + num_ganador_double);
			}
			 break;
			

		default: /*  default es para cuando se ingresa un valor incorrecto osea cuando no estan indicadas en el switch*/
			System.out.println("Opcion incorrecta.");
			break;

		}
	}


}
