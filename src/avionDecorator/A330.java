package avionDecorator;

public class A330 implements Avion{

	private String base;
	
	public A330() {
		
		base = "único piso";
	}
	@Override
	public String crearAvion() {
		
		return base;
	}
}
