package avionDecorator;

public class A380 implements Avion {

	private String base;
	
	public A380() {
		
		base = "A380 de doble piso";
	}

	public String crearAvion() {
				
		return base;
	}
}