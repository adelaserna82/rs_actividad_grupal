package avionDecorador;

public class A330 implements Avion {

	private String base;
	private String asientos;
	
	public A330() {
		
		base = "A330 de un piso";
		asientos = " con 20 asientos de clase turista";
		
        System.out.println("============================================== CREANDO AVIÓN A330 =================================================");
	}

	public String crearAvion() {
		
		return base + asientos;
	}
}