
public class MaquinaEstafadora extends MaquinaDeCafe {
	
	private boolean yaEstafe = true;
	
	@Override
	public VasoDeCafe servir() {
		if (yaEstafe) {			
			this.yaEstafe = false;
			return super.servir();
		} else {
			this.yaEstafe = true;
			return new VasoDeCafe(false);
		}
	}
	
}
