import EmailQueueWithAdapter.EmailQueue;
import EmailQueueWithAdapter.EmailRequest;

public class Main {
    public static void main(String[] args) throws Exception {

        EmailQueue queue = new EmailQueue();
        
        // Simulación de 50 envíos de email.
        for (var i=0;i<50;i++){
            queue.enqueue(new EmailRequest("aa@gmail.com","Mensaje de alerta","Ojo!!! alerta número " + i));
        }
        

    }
}
