package EjercicioPropuesto41;

public class MetodosP41 {
	// método para determinar el número mayor en la cadena de datos
	public static double mayorN(String numeros) {
		double datoArray, cont = 0;
		// para separar los números entre sí, ingresados con ,
		String split[] = numeros.split(",");
		// para recorrer el vector. comienza en cer hasta el tamaño del vector
		// se va comparando con el contador
		for (int i = 0; i < split.length; i++) {
			datoArray = Double.parseDouble(split[i]);
			if (datoArray > cont) {
				cont = datoArray;
			}
		}
		return cont;

	}

}
