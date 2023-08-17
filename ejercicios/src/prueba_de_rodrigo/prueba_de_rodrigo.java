package prueba_de_rodrigo;

import java.util.Scanner;

public class prueba_de_rodrigo {
	
	static float n1;
	
	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingresa un primer numero: ");
	    n1 = entrada.nextFloat();
	   
	}
	
	public static float AlCuadrado(float a) {
	    float Potencia = a*a;
	    return Potencia;
	}
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    ingresarNumeros();
	    AlCuadrado(n1);
	    System.out.println("El resultado elevado al cuadrado es: " + AlCuadrado(n1));
	    
	}

}
