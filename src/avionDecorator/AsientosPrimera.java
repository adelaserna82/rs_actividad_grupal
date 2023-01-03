package avionDecorator;

public class AsientosPrimera extends Decoracion{

	public AsientosPrimera(Avion modeloAvion) {
		super(modeloAvion);
	}
	public String crearAvion() {
		
		System.out.println("Creando zona asientos Primera");
		
		return super.crearAvion() + ", zona primera";
		
	}
}
