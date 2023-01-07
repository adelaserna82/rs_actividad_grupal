package avionDecorator;

public class A350 implements Avion {

	private String base;
	private String asientos;
	
	public A350() {
		
		base = "A350 de un piso";
		asientos = " con 30 asientos de clase turista";
		
        System.out.println("** CREANDO AVIÓN A350 **");
	}

	public String crearAvion() {
		
		return base + asientos;
	}
}