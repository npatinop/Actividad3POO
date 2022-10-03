package EjercicioPropuesto22;

import javax.swing.JOptionPane;

//solo hay un metodo en este ejercicio, donde se calcula el pago que se le da al trabajador dependiendo de las horas y el valor de cada una, con esto se determina lo que se imprime
public class MetodosP22 {
	public static double determinarPago(double salario, double horas) {
		double pagoMensual; // donde se va a almacenar el calculo
		pagoMensual = salario * horas; // multiplicación
		if (pagoMensual > 450000) { // condicional
			return pagoMensual; // retorna el valor
		} else {
			pagoMensual = 0; // el pago toma el valor de cero (de manera simbólica para el ejercicio)
			return pagoMensual;
		}
	}
}
