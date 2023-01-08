package avionDecorador;

public class Duchas extends Decoracion {

	public Duchas(Avion modeloAvion) {
		
		super(modeloAvion);	
	}
	
	public String crearAvion() {
		
		System.out.println(" - Creando zona de duchas.");
		return super.crearAvion() + ", zona duchas";
	}
}