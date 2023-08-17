package tp1_parte3;

import java.util.Scanner;

public class parte3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		char opciones;
		int descuento,resto;
		int talle_s,talle_m,talle_l,multip,resta;
		
		System.out.println("Ingrese un talle entre S,M y L:");
		
		
		opciones = entrada.next().charAt(0);
		
		
		
		switch(opciones) {
		
		case 'S':  
			
			System.out.println("\nQue cantidad de remeras desea comprar en S:");
			talle_s = entrada.nextInt();
			
			
			if (talle_s > 30 ) {
			System.out.println("\nNo hay stock ");
			}
			
			if (talle_s >= 15 && talle_s < 30 ) {
				multip = talle_s*5000;
				descuento = (int) (multip*0.15F);
				resto = (int) descuento;
				 System.out.println("\nLa cantidad de remeras que compro es:"+talle_s);
				System.out.println("\nEl descuento del 15% es: "+resto);
				resta =  multip-resto;
				System.out.println("\nEl gasto total es: "+resta);
			}
			
			else if (talle_s > 0 && talle_s < 15) {
				System.out.println("\nLa cantidad de remeras que compro es:"+talle_s);
				multip = talle_s*5000;
				System.out.println("\nEl gasto total es:"+multip);
			}
		break;
		
		
		case 'M': 
			System.out.println("\nQue cantidad de remeras desea comprar en M:");
			talle_m = entrada.nextInt();
			
			if (talle_m > 40 ) {
				System.out.println("\nNo hay stock ");
				}
			
			
			if (talle_m >= 22 && talle_m < 40 ) {
				multip = talle_m*5500;
				descuento = (int) (multip*0.15F);
				resto = (int) descuento;
				 System.out.println("\nLa cantidad de remeras que compro es:"+talle_m);
				System.out.println("\nEl descuento del 15% es: "+resto);
				resta =  multip-resto;
				System.out.println("\nEl gasto total es: "+resta);
			}
			
			else if (talle_m > 0 && talle_m < 15) {
				System.out.println("\nLa cantidad de remeras que compro es:"+talle_m);
				multip = talle_m*5500;
				System.out.println("\nEl gasto total es:"+multip);
			}
			
		break;
		
		
		case 'L': 
			
			System.out.println("\nQue cantidad de remeras desea comprar en L:");
			talle_l = entrada.nextInt();
			
			if (talle_l > 50 ) {
				System.out.println("\nNo hay stock ");
				}
			
			if (talle_l >= 35 && talle_l < 50 ) {
				multip = talle_l*5500;
				descuento = (int) (multip*0.15F);
				resto = (int) descuento;
				 System.out.println("\nLa cantidad de remeras que compro es:"+talle_l);
				System.out.println("\nEl descuento del 15% es: "+resto);
				resta =  multip-resto;
				System.out.println("\nEl gasto total es: "+resta);
			}
			
			
			else if (talle_l > 0 && talle_l < 35) {
				System.out.println("\nLa cantidad de remeras que compro es:"+talle_l);
				multip = talle_l*5500;
				System.out.println("\nEl gasto total es:"+multip);
			}
		
		break;
		
		
	
		default:
			System.out.println("\nOpcion incorrecta");
		break;
		
		
		
		}
		
	}

}
