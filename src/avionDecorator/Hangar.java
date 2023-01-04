package avionDecorator;

import EmailQueueWithAdapter.EmailQueue;
import EmailQueueWithAdapter.EmailRequest;

public class Hangar {
    public void montarAviones(){
        String emailCliente1 = "cliente1@reutilizacion.com";
        String emailCliente2 = "cliente2@reutilizacion.com";
        String emailCliente3 = "cliente3@reutilizacion.com";
        
        // Como vamos a enviar un email al cliente cada vez que se termine con un avión, en este momento instanciamos la cola para poder realizar el envío de los emails
        EmailQueue queue = new EmailQueue();


        // Se decora un a380
        Avion a380 = new Ducha(new Bar(new AsientosPrimera(new Ducha(new AsientosBusiness(new Bar(new A380()))))));
        // Se encola un email, para su envío en segundo plano, avisando de que ha finalizado
        queue.enqueue(new EmailRequest(emailCliente1, "Avion a380 finalizado",
                "Hola, se acaba de finalizar la adecuación del avión según lo solicitado. Estas son las características de su avion: "
                        + a380.crearAvion()));

        // Se decora un a350
        Avion a350 = new Ducha(new Bar(
                new AsientosPrimera(new AsientosBusiness(new AsientosPrimera(new AsientosBusiness(new A350()))))));
        // Se encola un email, para su envío en segundo plano, avisando de que ha finalizado
        queue.enqueue(new EmailRequest(emailCliente2, "Avion a350 finalizado",
                "Hola, se acaba de finalizar la adecuación del avión según lo solicitado. Estas son las características de su avion: "
                        + a350.crearAvion()));

        // Se decora un a330
        Avion a330 = new Ducha(new Bar(new AsientosBusiness(new AsientosPrimera(new AsientosBusiness(new A350())))));
        // Se encola un email, para su envío en segundo plano, avisando de que ha finalizado
        queue.enqueue(new EmailRequest(emailCliente3, "Avion a330 finalizado",
                "Hola, se acaba de finalizar la adecuación del avión según lo solicitado. Estas son las características de su avion: "
                        + a330.crearAvion()));

        // Dado que tenemos un subproceso, un thread, que está enviando los correos en segundo plano. Le indicamos que deje de escanear si tiene
        // emails pendientes de enviar.
        queue.stopThreadWhenFinish();
    }


}
