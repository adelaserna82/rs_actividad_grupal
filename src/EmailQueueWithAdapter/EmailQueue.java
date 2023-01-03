package EmailQueueWithAdapter;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class EmailQueue {
    private BlockingQueue<EmailRequest> _queue;
    private IEmailAdapter _emailAdapter;
    private Boolean _stopThreadWhenFinish = false;

    public EmailQueue() {
        _emailAdapter = new EmailAdapter();
        _queue = new ArrayBlockingQueue<EmailRequest>(20);

        // Crea un hilo consumidor que obtenga mensajes de la cola
        Thread desEnqueueThread = new Thread(() -> {
            while (true) {

                if (!_queue.isEmpty()) {
                    try {
                        // Se desencola el email siguiente
                        EmailRequest email = _queue.take();

                        // Espera medio segundo antes de ejecutar el proceso de nuev
                        Thread.sleep(500);

                        // Se enviá el email a través del adaptador.
                        _emailAdapter.send(email);

                        System.out.println("Se ha obtenido el mensaje " + email.getMessage() + " de la cola");
                    } catch (Exception e) {
                        System.out.println("Error al desencolar y enviar el mensaje el mensaje");
                    }

                }

                // Cuando se ordena finalizar el hilo
                if (_stopThreadWhenFinish && _queue.isEmpty()) {
                    break;
                }

            }
        });

        desEnqueueThread.start();
    }

    // Encola un mensaje a la cola
    public void enqueue(EmailRequest emailRequest) {
        // Como la cola sólo tiene 20 posiciones la cola, hay que esperar a que libere
        // espacio para encolar un nuevo email
        while (true) {
            if (_queue.size() < 20) {
                _queue.add(emailRequest);
                break;
            }
        }
    }

    public void stopThreadWhenFinish() {
        _stopThreadWhenFinish = true;
    }
}
