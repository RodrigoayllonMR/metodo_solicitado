package ingresardatosjoptionpane;

import javax.swing.JOptionPane;

public class ingresardatosjoptionpane {
	
	public static void main(String[] args) {
		
		String nombre,apellido;
		
		nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		
		apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
		
		JOptionPane.showMessageDialog(null, "Su nombre es: "+nombre);
		
		JOptionPane.showMessageDialog(null, "Su apellido es: "+apellido);
		
	}

}
