import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaquinaPremiumTests {

	MaquinaDeCafe maquina;
	
	@Before
	public void setup() {
		maquina = new MaquinaPremium();
	}
	
	@Test
	public void queDevuelveUnVasoAlServir() {
		VasoDeCafe vaso = maquina.servir();
		Assert.assertNotNull(vaso);
	}
	
	@Test
	public void quePuedeServirUnCafe() {
		maquina.servir();
		Assert.assertTrue(maquina.puedeServir());
	}
		
	@Test
	public void queSeAgotaElCafe() {
		for (int i = 0; i < 100; i++) {
			maquina.servir();
		}
		Assert.assertFalse(maquina.puedeServir());
	}
	
	@Test
	public void queLuegoDeAgotarElCafeSirveVasoVacio() {
		for (int i = 0; i < 100; i++) {
			maquina.servir();
		}
		VasoDeCafe vaso = maquina.servir();
		Assert.assertFalse(vaso.estaLleno());
	}

}
