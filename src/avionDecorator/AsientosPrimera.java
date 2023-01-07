package avionDecorator;

public class AsientosPrimera extends Decoracion {

	public AsientosPrimera(Avion modeloAvion) {
		
		super(modeloAvion);
	}
	
	public String crearAvion() {
		
		System.out.println(" - Creando zona de asientos de primera clase.");
		return super.crearAvion() + ", asientos primera";
	}
}