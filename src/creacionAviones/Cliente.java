package creacionAviones;

import avionDecorador.Hangar;

public class Cliente {

	public static void main(String[] args) {
		
       Hangar hangar = new Hangar();
       hangar.crearAviones();
    }
}