package pruebas;

import static org.junit.Assert.*;
import logica.ConsejoAdmin;
import logica.Cubicacion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Cubicacion_Test {
	Cubicacion cubicacion;

	@Before
	public void setUp() throws Exception {
		this.cubicacion = new Cubicacion(null, 0);
	}

	@After
	public void tearDown() throws Exception {
		this.cubicacion = null;
	}

	@Test
	public void CalcularCantMaterial_Test() {
		ConsejoAdmin.getInstance().inicializarMateriales();
		this.cubicacion.setMaterial(ConsejoAdmin.getInstance().definirMaterialNec("Madera"));
		float area = 12;
		this.cubicacion.calcularCantMaterialP(area);
		assertEquals(13,(int)this.cubicacion.getCantMaterialP());
		
	}
	@Test
	public void CalcularPrecio_Test(){
		ConsejoAdmin.getInstance().inicializarMateriales();
		this.cubicacion = new Cubicacion(ConsejoAdmin.getInstance().definirMaterialNec("Madera"),13);
		this.cubicacion.calcularPrecioMatP();
		assertEquals(195,(int)this.cubicacion.getPrecioMatP());
		
	}

}
