package Ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PruebasEj3 {
	
	@Test
	public void VerificarGestor() {
		
		Ej3_BaseDeDatosProductos b=new Ej3_BaseDeDatosProductos();
		Ej3_GestorProductos g=new Ej3_GestorProductos(b);
		String producto="Leche";
		
		b.conectar();
		g.registrarProducto(producto);
		assertTrue(g.productoRegistrado(producto));
	}
	
}