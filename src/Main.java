import avionDecorador.Hangar;

public class Main {

    // La idea es que desde la clase Hangar.montarAviones se decoren los Aviones (utilizando el
    // patrón Decorator),
    // una vez que se decore un avion se enviará un email al cliente que ha
    // solicitado un avión con estas mejoras (utilizará el patrón Adapter para el
    // envío del email).
    // Dado que el envío de emails normalmente tine latencia, crearemos una cola de
    // emials con el objetivo de ir encolando los emails y que poco a poco un
    // subproceso
    // en segundo plano (Un thread) envíe los emails (Para simular la latencia del
    // email le daremos 500ms de espera entre email y email).
	public static void main(String[] args) {
		
       Hangar hangar = new Hangar();
       hangar.crearAviones();
    }
}