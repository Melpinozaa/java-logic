package sv.edu.udb.ejercicio_2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("####.##");
		float value;
		double lp, kl, jb;

		value = Float.parseFloat(JOptionPane.showInputDialog(null, "Cual es el costo total de la empresa",
				"COSTO TOTAL DE LA EMPRESA", 3));

		lp = 37;
		kl = 29.2;
		jb = 33.8;

		double getLpPart = (lp * value) / 100;
		double getKlPart = (kl * value) / 100;
		double getJBPart = (jb * value) / 100;

		JOptionPane.showMessageDialog(null,
				"El valor total de la empresa es: " + value + "$" + "\n" + "\n" + "El Total a pagar de Ludovico P es: "
						+ Double.valueOf(df.format(getLpPart)) + "$" + "\n" + "\n" + "El Total a pagar de Kirian L es: "
						+ Double.valueOf(df.format(getKlPart)) + "$" + "\n" + "\n"
						+ "El Total a pagar de Jordan Belfort es: " + Double.valueOf(df.format(getJBPart)) + "$",
				"TOTAL", 3);

	}

}
