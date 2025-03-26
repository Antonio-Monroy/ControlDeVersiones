package Ejercicio1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class PruebasEj1 {
		
		@Test
		public void CrearUsuario() {
			
			Ej1_BaseDeDatos baseDeDatos = new Ej1_BaseDeDatos();
			Ej1_ServicioUsuarios u = new Ej1_ServicioUsuarios(baseDeDatos);
			String usuario="Juan";
			
			baseDeDatos.conectar();
			
			u.registrarUsuario(usuario);
			
		}
		
		@Test
		public void ValidarUsuario() {
			
			Ej1_BaseDeDatos baseDeDatos = new Ej1_BaseDeDatos();
			Ej1_ServicioUsuarios u = new Ej1_ServicioUsuarios(baseDeDatos);
			String usuario="Juan";
			
			baseDeDatos.conectar();
			
			assertFalse(u.usuarioRegistrado(usuario));
			
			
		}
		
		
	}


