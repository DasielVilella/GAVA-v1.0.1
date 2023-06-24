package pruebas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utiles.Validaciones;

public class Validaciones_Test {
	Validaciones validaciones;

	@Before
	public void setUp() throws Exception {
		validaciones = new Validaciones();
	}

	@After
	public void tearDown() throws Exception {
		validaciones = null;
	}

	@Test
	public void prueba_ValidarCIJefe() {
		assertTrue(Validaciones.validarCIJefe("02090767527"));	
	}

}
