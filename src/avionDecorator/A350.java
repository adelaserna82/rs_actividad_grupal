package avionDecorator;

public class A350 implements Avion{

	private String base;
	
	public A350() {
		base = "�nico piso";
	}
	@Override
	public String crearAvion() {
		
		return base;
	}

}
