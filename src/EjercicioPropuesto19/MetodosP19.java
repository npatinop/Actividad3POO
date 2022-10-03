package EjercicioPropuesto19;

public class MetodosP19 {
	// return devuelve los resultados
	// primer método para calcular el perimetro del triángulo
	public static double calcularPerimetro(double lado) {
		double perimetro; // para guardar el resultado
		perimetro = lado * 3; // fórmula
		return perimetro;
	}

	// segundo método para calcular la altura del triángulo
	public static double calcularAltura(double lado) {
		double altura; // para guardar el resultado
		altura = (lado * Math.sqrt(3)) / 2; // fórmula
		return altura;
	}

	// tercer método para calcular el área del triángulo
	public static double calcularArea(double lado) {
		double area; // para guardar el resultado
		area = (Math.pow(lado, 2) * Math.sqrt(3)) / 4; // fórmula
		return area;
	}
}
