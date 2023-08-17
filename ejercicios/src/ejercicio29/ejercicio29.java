package ejercicio29;

import java.util.Scanner;

public class ejercicio29 {

	public static void main(String[] args) throws InterruptedException {

		Scanner datos = new Scanner(System.in);
		
		int i;
		
		for (i=100;  i>=0; i--) {
			System.out.println("\nla bateria:"+i);
		Thread.sleep(20);
		
		}
		
		for (i=20; i>=0; i--) {
			System.out.println("\nBateria baja. "+i);
		Thread.sleep(1000);
		}
		
		
	}
}
