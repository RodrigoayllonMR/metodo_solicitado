package calculadora;

import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int num1,num2,suma,resta,multip,div;
		char operacion;
		
		System.out.println("\nIngrese un primer numero: ");
		num1 = datos.nextInt();
		
		System.out.println("\nIngrese un segundo numero: ");
		num2 = datos.nextInt();
		
		System.out.println("\nDigite que operacion desea realizar: ");
		operacion = datos.next().charAt(0);
		
		
		switch (operacion) {
		
		case 'S':
			
			suma = num1+num2;
			System.out.println("\nLa suma es: "+suma);
			
			break;
			
			
		case 'R':
			
			resta = num1-num2;
			System.out.println("\nLa resta es: "+resta);
			
			break;
		
		
		case 'M':
			
			multip = num1*num2;
			System.out.println("\nLa multiplicacion es: "+multip);
			
			break;
			
			
		case 'D':
			
			div = num1/num2;
			System.out.println("\nLa division es: "+div);
			
			break;
		}
		
	}

}
