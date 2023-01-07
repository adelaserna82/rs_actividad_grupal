package avionDecorador;

public class AsientosBusiness extends Decoracion {

	public AsientosBusiness(Avion modeloAvion) {
		
		super(modeloAvion);
	}
	
	public String crearAvion() {
		
		System.out.println(" - Creando zona de asientos Business.");
		return super.crearAvion() + ", asientos business";	
	}	
}