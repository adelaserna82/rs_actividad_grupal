package avionDecorator;

public class AsientosBusiness extends Decoracion {

	public AsientosBusiness(Avion modeloAvion) {
		
		super(modeloAvion);
	}
	
	public String crearAvion() {
		
		System.out.println("Creando zona asientos Business");
		return super.crearAvion() + ", zona business";	
	}	
}