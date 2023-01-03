package avionDecorator;

public class Decoracion implements Avion{

	Avion modeloAvion;
	private String asientosBase;
	
	public Decoracion(Avion modeloAvion) {
		
		this.modeloAvion = modeloAvion;
		asientosBase = " 20 asientos turista";
	}

	@Override
	public String crearAvion() {
				
		return modeloAvion.crearAvion();
	}
	
}
