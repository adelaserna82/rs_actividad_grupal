package avionDecorator;

public class Ducha extends Decoracion {

	public Ducha(Avion modeloAvion) {
		
		super(modeloAvion);	
	}
	
	public String crearAvion() {
		
		System.out.println("Creando zona de duchas");
		return super.crearAvion() + ", zona duchas";
	}
}