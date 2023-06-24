package pruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;

import logica.AfectTecho;
import logica.Afectacion;
import logica.ConsejoAdmin;
import logica.ElementoAfectado;
import logica.Ficha;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Ficha_Test {
	Ficha ficha;

	@Before
	public void setUp() throws Exception {
		this.ficha = new Ficha();
	}

	@After
	public void tearDown() throws Exception {
		this.ficha = null;
	}

	@Test
	public void AgregarElemento_Test() {
		this.ficha.setListaElementos(new ArrayList<ElementoAfectado>());
		ElementoAfectado elemento = new ElementoAfectado("televisor", 2);
		this.ficha.getListaElementos().add(elemento);
		assertEquals(1,this.ficha.getListaElementos().size());
	}
	@Test
	public void AgregarAfectacion_Test(){
		this.ficha.setListaAfectaciones(new ArrayList<Afectacion>());
		AfectTecho afectacion = new AfectTecho(false, 12, 21, ConsejoAdmin.getInstance().definirMaterialNec("Madera"));
		this.ficha.agregarAfectacionVivienda(afectacion);
		assertEquals(1,this.ficha.getAfectacionesVivienda().size());
	}
}
