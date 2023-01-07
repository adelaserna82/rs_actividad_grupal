package avionDecorator;

public class A380 implements Avion {

	private String base;
	private String asientos;
	
	public A380() {
		
		base = "A380 de doble piso";
		asientos = " con 40 asientos de clase turista";
		
        System.out.println("** CREANDO AVIÓN A380 **");
	}

	public String crearAvion() {
				
		return base + asientos;
	}
}