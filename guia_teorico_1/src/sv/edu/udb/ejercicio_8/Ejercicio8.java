package sv.edu.udb.ejercicio_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
		int average = 0;
		int zeros = 0;

		int num = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de numeros que desea operar"));

		int numbers[] = new int[num];
		int sum = 0;
		String outputdata = "";
		String outputhighest= "";
		String outputlower= "";
		String outputzero = "";
		
		int highest = 0;
		int lowest = 0;
		
		
		for (int i = 0; i < numbers.length; i++) {
			//get array "numbers"
			numbers[i] = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero " + (i + 1) + " ", "Numero"));
			//var to print the array "numbers"
			outputdata += "Num " + (i + 1) + " -      " + numbers[i] + "\n";
			sum = sum + numbers[i];
			
			if (i > highest) {
				highest = i;
				
			}
			if ( i <= lowest ) {
				lowest = Math.max(i, i);
				System.out.println(lowest);
			}
			
			
		}

		
		//Get average
		average = sum / numbers.length;

		
		for(int index : numbers) { 
		}
		
		
		JOptionPane.showMessageDialog(null, "Datos del arreglo" + "\n" + "\n" + outputdata + "\n" + "\n"
				+ "El Promedio de los numeros ingresados es: " + "\n" + average+"\n"+"El Mayor de los valores positivos ingresados: "+ "\n" + highest
				+"\n"+"El Mayor de los valores negativos ingresados: "+ "\n" + lowest+ "\n" + "\n"
				, "Result", 3);
		
		/*for (int i : numbers) {
			
			if (num==0) {
				zeros++;
				outputzero += "El numero cero esta en la posicion: "+ (i+1) ;
			}else {
				outputzero += "No hay ceros en el listado ingresado"  ;
			}*/
			
		}


	}


