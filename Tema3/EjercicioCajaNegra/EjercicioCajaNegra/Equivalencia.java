package EjercicioCajaNegra;

public class Equivalencia {

	void menor18() {
		
		Edad edad =new Edad();
		int valor=15;
		
		if (!edad.esMayorDeEdad(valor)) {
			System.out.println("Eres menor de edad");
		}
		
	}
	
	void mayor18() {
		
		Edad edad =new Edad();
		int valor=22;
		
		if (edad.esMayorDeEdad(valor)) {
			System.out.println("Eres mayor de edad");
		}
		
		
	}
	
	void igual18() {
		
		Edad edad =new Edad();
		int valor=18;
		
		if (edad.esMayorDeEdad(valor)) {
			System.out.println("Eres mayor de edad");
		}
		
	}
	
	void igualLimite() {
			
		Edad edad =new Edad();
		int valor=100;
		
		if (edad.esMayorDeEdad(valor)) {
			System.out.println("Eres mayor de edad");
		}
			
	}
	
}
