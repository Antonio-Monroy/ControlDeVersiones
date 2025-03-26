package Ejercicio4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class PruebasEj4 {

	@Test
	public void VerificarServicioPositivo() {
		
		Ej4_ServicioPagos p=new Ej4_ServicioPagos();
		Ej4_ServicioOrdenes o=new Ej4_ServicioOrdenes(p);
		int monto=200;
		
		assertTrue(o.procesarOrden(monto));
	}
	
	@Test
	public void VerificarServicioNegativo() {
		
		Ej4_ServicioPagos p=new Ej4_ServicioPagos();
		Ej4_ServicioOrdenes o=new Ej4_ServicioOrdenes(p);
		int monto=5000;
		
		assertFalse(o.procesarOrden(monto));
		
	}
	
}
