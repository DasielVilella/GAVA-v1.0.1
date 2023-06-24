package pruebas;

import static org.junit.Assert.*;
import logica.Material;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Material_Test {
	Material material;

	@Before
	public void setUp() throws Exception {
		this.material = new Material(null, null, 0, null,0);
	}

	@After
	public void tearDown() throws Exception {
		this.material = null;
	}

	@Test
	public void GetUnidadMedida_Test() {
		this.material = new Material("12345678", "Tornillo", 3, "U",30);
		assertTrue(this.material.getUnidadMedida().equals("U"));	
	}
	@Test
	public void GetPrecioU_Test(){
		this.material = new Material("12345678", "Tornillo", 3, "U",30);
		assertEquals(3,(int)this.material.getPrecioU());		
	}
}
