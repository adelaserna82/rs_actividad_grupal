package avionDecorator;

import EmailQueueWithAdapter.EmailQueue;
import EmailQueueWithAdapter.EmailRequest;

public class Hangar {
	
    public void montarAviones() {
    	
        String emailCliente1 = "cliente1@reutilizacion.com";
        String emailCliente2 = "cliente2@reutilizacion.com";
        String emailCliente3 = "cliente3@reutilizacion.com";
        
        // Como vamos a enviar un email al cliente cada vez que se termine con un avión, en este momento instanciamos la cola para poder realizar el envío de los emails
        EmailQueue queue = new EmailQueue();

        // SE CREA UN AVION A380
        Avion a380 = new A380();
        
        // Se decora el avion A380
        a380 = new Ducha(a380);
        a380 = new Bar(a380);
        a380 = new AsientosPrimera(a380);
        
        // Se muestra el resultado final del avion A380
        System.out.println("Avión creado:" + a380.crearAvion());
        
        // Se encola un email, para su envío en segundo plano, avisando de que ha finalizado
        queue.enqueue(new EmailRequest(emailCliente1, "Avion A380 finalizado",
                "Hola, se acaba de finalizar la adecuación del avión según lo solicitado. Estas son las características de su avion: "
                        + a380.crearAvion());     
        
        // SE CREA UN AVION A350
        Avion a350 = new A350();
        
        // Se decora el avion A350
        a350 = new Ducha(a350);
        a350 = new Bar(a350);
        a350 = new AsientosBusiness(a350);
                
        // Se muestra el resultado final del avion A380
        System.out.println("Avión creado:" + a350.crearAvion());
        
        // Se encola un email, para su envío en segundo plano, avisando de que ha finalizado
        queue.enqueue(new EmailRequest(emailCliente1, "Avion A350 finalizado",
                "Hola, se acaba de finalizar la adecuacion del avion segun lo solicitado. Estas son las características de su avion: "
                        + a350.crearAvion());
        
        // SE CREA UN AVION A330
        Avion a330 = new A330();
        
        // Se decora el avion A330
        a330 = new Ducha(a330);
        a330 = new Bar(a330);
        a330 = new AsientosBusiness(a330);
                
        // Se muestra el resultado final del avion A380
        System.out.println("Avión creado:" + a330.crearAvion());
        
        // Se encola un email, para su envío en segundo plano, avisando de que ha finalizado
        queue.enqueue(new EmailRequest(emailCliente1, "Avion A330 finalizado",
                "Hola, se acaba de finalizar la adecuacion del avion segun lo solicitado. Estas son las características de su avion: "
                        + a330.crearAvion());

/*        
         // Se decora un a380
		Avion a380 = new Ducha(new Bar(new AsientosPrimera(new Ducha(new AsientosBusiness(new Bar(new A380()))))));
       	String resultado_a380 = a380.crearAvion();
        System.out.println("Avión creado:" + resultado_a380);
                // Se encola un email, para su envío en segundo plano, avisando de que ha finalizado
        queue.enqueue(new EmailRequest(emailCliente2, "Avion a380 finalizado",
                "Hola, se acaba de finalizar la adecuación del avión según lo solicitado. Estas son las características de su avion: "
                        + resultado_a380));
                        
 		  // Se decora un a350
        Avion a350 = new Ducha(new Bar(new AsientosPrimera(new AsientosBusiness(new AsientosPrimera(new AsientosBusiness(new A350()))))));
        String resultado_a350 = a350.crearAvion();
        System.out.println("Avión creado:" + resultado_a350);
                // Se encola un email, para su envío en segundo plano, avisando de que ha finalizado
        queue.enqueue(new EmailRequest(emailCliente2, "Avion a350 finalizado",
                "Hola, se acaba de finalizar la adecuación del avión según lo solicitado. Estas son las características de su avion: "
                        + resultado_a350));

        // Se decora un a330
        Avion a330 = new Ducha(new Bar(new AsientosBusiness(new AsientosPrimera(new AsientosBusiness(new A350())))));
        String resultado_a330 = a330.crearAvion();
        System.out.println("Avión creado:" + resultado_a330);
        // Se encola un email, para su envío en segundo plano, avisando de que ha finalizado
        queue.enqueue(new EmailRequest(emailCliente3, "Avion a330 finalizado",
                "Hola, se acaba de finalizar la adecuación del avión según lo solicitado. Estas son las características de su avion: "
                        + resultado_a330));
*/
        // Dado que tenemos un subproceso, un thread, que está enviando los correos en segundo plano. Le indicamos que deje de escanear si tiene
        // emails pendientes de enviar.
        queue.stopThreadWhenFinish();
    }
}