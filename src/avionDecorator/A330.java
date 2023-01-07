package avionDecorator;

public class A330 implements Avion {

	private String base;
	
	public A330() {
		
		base = "A330 de un piso";
	}

	public String crearAvion() {
		
		return base;
	}
}