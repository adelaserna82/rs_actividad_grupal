package avionDecorator;

public class Bar extends Decoracion {

	public Bar(Avion modeloAvion) {
		
		super(modeloAvion);
	}
	
	public String crearAvion() {
		
		System.out.println(" - Creando zona de Bar.");
		return super.crearAvion() + ", zona Bar";
	}
}