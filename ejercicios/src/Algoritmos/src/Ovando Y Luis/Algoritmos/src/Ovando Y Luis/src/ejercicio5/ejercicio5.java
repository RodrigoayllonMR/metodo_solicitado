package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
	    int a�o,meses,semanas,dia;
	    
	    System.out.println("digite la cantidad de a�os:");
	     a�o = entrada.nextInt();
	     
		dia = a�o*365;
		
		 System.out.println("la cantidad de dia: "+dia );
		 
		 
		 System.out.println("digite la cantidad de meses:");
	     meses = entrada.nextInt();
	     
		dia = meses*12;
		
		 System.out.println("la cantidad de dias: "+dia );
		 
		 
		 System.out.println("digite la cantidad de semanas:");
	     semanas = entrada.nextInt();
	     
		dia = semanas*7;
		
		 System.out.println("la cantidad de dias: "+dia );
		 
		 
	}
	
}