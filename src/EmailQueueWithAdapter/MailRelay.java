package EmailQueueWithAdapter;


/* Clase que implementa el envío de email a traves de la API del servicio online MailRelay 
 * Esta clase simula a la libreria o jar que nos proporcionaría MailRelay para su utilización.
*/
public class MailRelay {
    private String _from="grupal@reutilizacionsoftware.com"; // Remitente del email, por defecto ponemos uno imaginario.


    // Método para enviar el email a través del API
    public boolean sendEmail(String to, String subject, String message) {
        try {
    
      
            // Crea el cuerpo de la petición en formato JSON
            String jsonInputString = "{\"to\":\"" + to + "\",\"from\":\"" + _from + "\",\"subject\":\"" + subject + "\",\"message\":\"" + message + "\"}";
      
            System.out.println("Email enivado: Objeto JSON que se envía a través dee MailRelay:\n" + jsonInputString);
      


          } catch (Exception e) {
            e.printStackTrace();
          }


        return true;
    }

    



}
