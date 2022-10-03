package EjercicioResuelto10;

import javax.swing.JOptionPane;

//solo hay un método que permite determinar el valor a cancelar
public class MetodosR10 {
	public static double pagoMatricula(double plata, double estrato) {
		double pago; // crear variable para almacenar el resultado
		double general = 50000; // cobrado a cualquier estudiante
		pago = 0; // iniciar variable
		if ((plata > 2000000) && (estrato > 3)) { // condicional
			pago = (0.03 * plata) + general; // se aplica la indicación dada
			return pago; // resultado
		} else {
			pago = general; // se paga solo lo general
			return pago; // resultado
		}
	}
}
