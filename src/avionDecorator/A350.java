package avionDecorator;

public class A350 implements Avion {

	private String base;
	
	public A350() {
		
		base = "A350 de un piso";
	}

	public String crearAvion() {
		
		return base;
	}
}