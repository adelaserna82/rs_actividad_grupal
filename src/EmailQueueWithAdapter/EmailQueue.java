package EmailQueueWithAdapter;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class EmailQueue {
    private BlockingQueue<EmailRequest> _queue;
    private IEmailAdapter _emailAdapter;

    public EmailQueue() {
        _emailAdapter = new EmailAdapter();
        _queue = new ArrayBlockingQueue<EmailRequest>(20);

        // Crea un hilo consumidor que obtenga mensajes de la cola
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    // Obtiene un mensaje de la cola
                    EmailRequest email = _queue.take();
                    // Espera medio segundo antes de ejecutar el proceso de nuevo
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // Se enviá el email a través del adaptador.
                    _emailAdapter.send(email);

                    System.out.println("Se ha obtenido el mensaje " + email.get_message() + " de la cola");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        consumer.start();
    }

    // Encola un mensaje a la cola
    public void enqueue(EmailRequest emailRequest) {
        // Como la cola sólo tiene 20 posiciones la cola, hay que esperar a que libere espacio para encolar un nuevo email
        while (true) {
            if (_queue.size() < 20) {
                _queue.add(emailRequest);
                break;
            }
        }
    }
}
