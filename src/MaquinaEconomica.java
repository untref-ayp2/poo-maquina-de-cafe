
public class MaquinaEconomica extends MaquinaDeCafe {
	
	private int servidos = 0;

	@Override
	protected void restarCafe() {
		this.servidos++;
		if (this.servidos % 3 == 2) {
			super.restarCafe();
			this.servidos = 0;
		}
	}
	

}
