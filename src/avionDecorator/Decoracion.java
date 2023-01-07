package avionDecorator;

public class Decoracion implements Avion {

	private Avion modeloAvion;
	private String asientosBase;
	
	public Decoracion(Avion modeloAvion) {
		
		this.modeloAvion = modeloAvion;
		asientosBase = " 20 asientos turista";
	}

	public String crearAvion() {
				
		return modeloAvion.crearAvion();
	}
}