package pruebas;
import logica.NucleoFamiliar;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NucleoFamiliar_Test {
	NucleoFamiliar nucleo;


	@Before
	public void setUp() throws Exception {
		this.nucleo = new NucleoFamiliar(null, 0, 0, 0, 0);
	}

	@After
	public void tearDown() throws Exception {
		this.nucleo = null;
	}

	@Test
	public void getTotal_Test() {
		this.nucleo = new NucleoFamiliar(null, 20,4,2,13);
		assertEquals(20,this.nucleo.getTotalPersonas());
	}
	@Test
	public void getAncianos_Test(){
		this.nucleo = new NucleoFamiliar(null, 20,4,2,13);
		assertTrue(this.nucleo.getCantAncianos() == 4);
	}

}
