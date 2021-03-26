
public abstract class MaquinaDeCafe {
	protected static final int GRAMOS_POR_CAFE = 10;
	
	protected int gramosDeCafe = 1000;
	// TODO: recargamos los gramos de cafe?
	
	public VasoDeCafe servir() {		
		if (this.puedeServir()) {
			restarCafe();
			return new VasoDeCafe(true);
		}
		return new VasoDeCafe(false);
	}
	
	protected void restarCafe() {
		this.gramosDeCafe -= GRAMOS_POR_CAFE;
	}
	
	protected boolean puedeServir() {
		return this.gramosDeCafe >= GRAMOS_POR_CAFE;
	}
}
