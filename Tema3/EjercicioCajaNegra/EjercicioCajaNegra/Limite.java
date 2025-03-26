package EjercicioCajaNegra;

public class Limite {


	void desbordamientoPositivo() {
		
		Edad edad =new Edad();
		int valor=101;
		
		if (!edad.esMayorDeEdad(valor)) {
			System.out.println("Desbordamiento por superar la edad máxima");
		}
		
	}
	
	void desbordamientoNegativo() {
		
		Edad edad =new Edad();
		int valor=-2;
		
		if (!edad.esMayorDeEdad(valor)) {
			System.out.println("Desbordamiento por superar la edad mínima");
		}
		
	}
	
}
