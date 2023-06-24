package pruebas;
import logica.AfectTecho;
import logica.ConsejoAdmin;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AfectTecho_Test {
	private AfectTecho afectacion;
	private ConsejoAdmin consejo = ConsejoAdmin.getInstance();

	@Before
	public void setUp() throws Exception {
		this.afectacion = new AfectTecho(false,0,0,null);
	}

	@After
	public void tearDown() throws Exception {
		this.afectacion = null;
	}

	@Test
	public void getDim2_Test() {
		this.consejo.inicializarMateriales();
		this.afectacion = new AfectTecho(false,12,21,ConsejoAdmin.getInstance().definirMaterialNec("madera"));
	    assertEquals(21, (int)this.afectacion.getDim2());
	}
	@Test
	public void getAfectTotal_Test(){
		this.consejo.inicializarMateriales();
		this.afectacion = new AfectTecho(false,12,2,ConsejoAdmin.getInstance().definirMaterialNec("madera"));
	    assertFalse(this.afectacion.getAfectTotal());
	}

}

