package EjercicioPropuesto23;

public class MetodosP23 {
	// cada método es un caso según el valor del determinante
	// si el determinante es 0
	public static double raizCuadrada1(double A, double B, double D) {
		return ((-B) / (2 * A));
	}

	// si el determiannte es positivo
	public static double raizCuadrada2(double A, double B, double D) {
		return ((-B) + Math.sqrt(D)) / (2 * A);
	}

	// si el determinante es negativo
	public static double raizCuadrada3(double A, double B, double D) {
		return ((-B) - Math.sqrt(D)) / (2 * A);
	}
}