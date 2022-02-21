package sv.edu.udb.ejercicio_4;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
		float weight = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su peso en kilos "));
		float height = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su altura en metros"));

		double imc = weight / (height * height);

		if (imc < 18.50 || imc == 18.50) {
			JOptionPane.showMessageDialog(null, "" + name + "\n" + "\n" + " Infrapeso:  " + imc + "  IMC", "IMC", 3);
		} else if (imc == 18.50 || imc <= 24.90) {
			JOptionPane.showMessageDialog(null, "" + name + "\n" + "\n" + " peso normal:  " + imc + "  IMC", "IMC", 3);
		} else if (imc == 25.00 || imc <= 29.90) {
			JOptionPane.showMessageDialog(null, "" + name + "\n" + "\n" + " Sobrepeso:  " + imc + "  IMC", "IMC", 3);
		} else if (imc == 30.00 || imc <= 40.00) {
			JOptionPane.showMessageDialog(null, "" + name + "\n" + "\n" + " Obesidad:  " + imc + "  IMC", "IMC", 3);
		} else if (imc >= 40.00) {
			JOptionPane.showMessageDialog(null, "" + name + "\n" + "\n" + " Obesidad Morbida:  " + imc + "  IMC", "IMC",
					3);
		}else {
				JOptionPane.showMessageDialog(null, ""+name+ "\n" + "\n" +"Sin Clasificacion");
		}

	}

}
