package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		int año, meses, semanas, dia;

		System.out.println("\ndigite la cantidad de dias:");
		año = entrada.nextInt();

		dia = año * 365;

		System.out.println("\nla cantidad en dias es: " + dia);

		System.out.println("\ndigite la cantidad de meses:");
		meses = entrada.nextInt();

		dia = meses * 31;

		System.out.println("\nla cantidad en dias es: " + dia);

		System.out.println("\ndigite la cantidad de semanas:");
		semanas = entrada.nextInt();

		dia = semanas * 7;

		System.out.println("\nla cantidad en dias es: " + dia);

	}
}
