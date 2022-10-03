package EjercicioPropuesto18;

public class MetodosP18 {
	// return devuelve los resultados
	// este primer metodo determina el salario bruto, es decir, sin descontar la
	// retencion, es lo trabajo
	public static double metodoSalarioBruto(double horas, double valorHora) {
		double salarioBruto;
		salarioBruto = horas * valorHora;
		return salarioBruto;
	}

	// el segundo método lo que hace es deteerminar cuánto salario se queda retenido
	// según el porcentaje definido
	public static double metodoSalarioRetenido(double porcentajeRetenido, double horas, double valorHora) {
		double salarioRetenido;
		salarioRetenido = (horas * valorHora) * (porcentajeRetenido) / 100;
		return salarioRetenido;
	}

	// finalmente, el tercer método se encarga de hallar el salario neto que se le
	// da al empleado, descontando el retenido
	public static double metodoSalarioNeto(double salarioRetenido, double salarioBruto) {
		double salarioNeto;
		salarioNeto = salarioBruto - salarioRetenido;
		return salarioNeto;
	}

}
