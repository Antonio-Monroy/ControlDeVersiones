package Ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PruebasEj2 {

	@Test
	public void ValidarEnvio() {
		
		String pedido="Pedido 123";
		Ej2_ServicioEnvio s=new Ej2_ServicioEnvio();
		Ej2_ServicioPedido p=new Ej2_ServicioPedido(s);
		
		assertTrue(p.crearYEnviarPedido(pedido));
	}
	
}