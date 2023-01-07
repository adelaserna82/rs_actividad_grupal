package adaptadorEmail;

//Clase que simula el envio de emails a traves de una libreria de terceros.
public class MailTerceros {	

    // Método para enviar el email
    public boolean sendEmail(String to, String from, String subject, String message) {

            String mensajeAEnviar = " { \n   to: " + to + "\n" + "   from: " + from + "\n" +"   subject: " + subject + "\n" + "   message: " + message + "\n } \n";
            System.out.println("Email enviado desde mail terceros: \n" + mensajeAEnviar);      
        return true;
    }
}