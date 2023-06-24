package pruebas;
import logica.ElementoAfectado;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElementoAfectado_Test {
	private ElementoAfectado elemento;

	@Before
	public void setUp() throws Exception {
		this.elemento = new ElementoAfectado(null, 0);
	}

	@After
	public void tearDown() throws Exception {
		this.elemento = null;
	}

	@Test
	public void getElemento_Test() {
		this.elemento = new ElementoAfectado("televisor", 2);
		assertTrue(this.elemento.getNombre().equals("televisor"));
	}
	
	@Test
	public void getCantidad_Test() {
		this.elemento = new ElementoAfectado("lavamanos", 4);
		assertEquals(4,this.elemento.getCantidad());
	}


}
