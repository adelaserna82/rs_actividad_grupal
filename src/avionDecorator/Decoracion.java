package avionDecorator;

public class Decoracion implements Avion {

	private Avion modeloAvion;

	
	public Decoracion(Avion modeloAvion) {
		
		this.modeloAvion = modeloAvion;
	}

	public String crearAvion() {
				
		return modeloAvion.crearAvion();
	}
}