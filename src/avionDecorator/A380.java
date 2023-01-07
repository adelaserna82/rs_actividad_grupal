package avionDecorator;

public class A380 implements Avion {

	private String base;
	
	public A380() {
		
		base = "Doble piso";
	}

	public String crearAvion() {
				
		return base;
	}
}