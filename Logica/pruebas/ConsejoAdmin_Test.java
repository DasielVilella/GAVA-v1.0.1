package pruebas;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;
import logica.ConsejoAdmin;
import logica.Material;

import org.junit.Test;

public class ConsejoAdmin_Test {
	private ConsejoAdmin consejo;

	@Before
	public void setUp() throws Exception{
		this.consejo = ConsejoAdmin.getInstance();
	}
	
	@After
	public void tearDown() throws Exception{
		this.consejo = null;
	}
	
	@Test
	public void defMaterialNecesario_Test(){
		this.consejo.inicializarMateriales();
		String nombreMat = "Madera";
		Material material = this.consejo.definirMaterialNec(nombreMat);
		assertEquals(nombreMat, material.getNombre());
	}
	@Test
	public void getListaMateriales_Test() {
	    Material clavo = new Material("123", "Clavo", 1, "U",50);
	    this.consejo.getListaMateriales().add(clavo);
		assertEquals(clavo, this.consejo.getListaMateriales().get(0));
	}

}
