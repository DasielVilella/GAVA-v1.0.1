package pruebas;
import logica.ConsejoAdmin;
import static org.junit.Assert.*;
import logica.AfectPared;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AfectPared_Test {
	private AfectPared afectacion;
	private ConsejoAdmin consejo = ConsejoAdmin.getInstance();

	@Before
	public void setUp() throws Exception {
		this.afectacion = new AfectPared(false,0,0,null,false);
	}

	@After
	public void tearDown() throws Exception {
		this.afectacion = null;
	}

	@Test
	public void getDim1_Test() {
		this.consejo.inicializarMateriales();
		this.afectacion = new AfectPared(true,12,2,ConsejoAdmin.getInstance().definirMaterialNec("madera"),true);
		assertEquals(12,(int)this.afectacion.getDim1());
	}
	@Test
	public void getAfectTotal_Test(){
		this.consejo.inicializarMateriales();
		this.afectacion = new AfectPared(true,12,2,ConsejoAdmin.getInstance().definirMaterialNec("madera"),true);
	    assertTrue(this.afectacion.getAfectTotal());
	}

}
