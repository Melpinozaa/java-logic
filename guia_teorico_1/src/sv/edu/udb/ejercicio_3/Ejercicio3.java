package sv.edu.udb.ejercicio_3;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String[] args) {
		double q1, q2, r;
		double k = (9)*Math.pow(10, 9);

		q1 = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Ingrese el valor de la carga 1 en COULOMBS (deben ser positivos)", "VALOR DE LAS CARGAS", 3));
		q2 = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Ingrese el valor de la carga 1 en COULOMBS (deben ser positivos)", "VALOR DE LAS CARGAS", 3));
		r = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Ingrese el valor de la distancia que seapara las cargas", "VALOR DE LAS CARGAS", 3));
		
		double F = (k*q1*q2)/Math.pow(r, 2);
		
		JOptionPane.showMessageDialog(null, "El valor de la fuerza de atracci�n entre las dos cargas es: "+F+" N");

	}

}
