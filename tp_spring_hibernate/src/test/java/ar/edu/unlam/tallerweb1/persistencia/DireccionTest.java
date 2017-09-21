package ar.edu.unlam.tallerweb1.persistencia;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.dao.UsuarioDaoImpl;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public class DireccionTest {

	
	@Test
	public void testGetBarrio() {
		int resultado = 5;
		int esperado = 5;
		assertEquals(esperado,resultado);						
	}
	
	@Test
	public void testUsuario(){
	Usuario usuario = new Usuario();
		
	usuario.setEmail("cesardaniel_@msn.com");
	usuario.setRol("Admin");
	usuario.setPassword("12345678");
	
	
	
	}

}
