package sv.edu.udb.ejercicio_1;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class EJercicio1 {
	public static void main(String[] args) {

		DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
		simbolo.setDecimalSeparator('.');
		DecimalFormat formateador = new DecimalFormat("#####.####", simbolo);

		double radio;

		radio = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de su esfera en mm", "ESFERA", 3));

		double radiotocm = radio / 10;

		double getarea = (4 * Math.PI) * Math.pow(radiotocm, 2);
		double area = getarea;

		double getdiam = 2 * radiotocm;
		double diam = getdiam;

		double getvol = (4.0 / 3.0) * Math.PI * (Math.pow(radiotocm, 3));
		double vol = getvol;

		JOptionPane.showMessageDialog(null,
				"El Radio de su esfera es: " + Double.valueOf(formateador.format(radio)) + "\n" + "\n"
						+ "El area de su Esfera es: " + Double.valueOf(formateador.format(area)) + "cm²" + "\n" + "\n"
						+ "El diametro de su esfera es: " + Double.valueOf(formateador.format(diam)) + "cm" + "\n"
						+ "\n" + "El volumen de su esfera es: " + Double.valueOf(formateador.format(vol)) + "cm³",
				"Resultado", 3);

	}

}
