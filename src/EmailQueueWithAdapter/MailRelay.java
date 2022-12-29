package EmailQueueWithAdapter;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/* Clase que implementa el envío de email a traves de la API del servicio online MailRelay */
public class MailRelay {
    private String _tokenMailRelay="ec575826-523b-4296-8146-e52120cd2c35"; // Token del servicio online MailRelay, este lo tenemos que generar desde la web.
    private String _from="grupal@reutilizacionsoftware.com"; // Remitente del email, por defecto ponemos uno imaginario.
    private String _urlApi="https://simuladorenvioemail.emailrelay.com/api/"; // URL de la API del servicio online MailRelay


    // Método para enviar el email a través del API
    public boolean SendEmail(String to, String subject, String message) {
        String urlSendEmail = _urlApi + "sendemail";

        try {
            // Crea la conexión con la API
            URL url = new URL(urlSendEmail);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
      
            // Establece el método de la petición como POST
            con.setRequestMethod("POST");
      
            // Establece los encabezados de la petición
            con.setRequestProperty("Authorization", _tokenMailRelay);
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");
      
            // Establece que se permitirá enviar información en el cuerpo de la petición
            con.setDoOutput(true);
      
            // Crea el cuerpo de la petición en formato JSON
            String jsonInputString = "{\"to\":\"" + to + "\",\"from\":\"" + _from + "\",\"subject\":\"" + subject + "\",\"message\":\"" + message + "\"}";
      
            System.out.println("Objeto JSON que se envía al API:\n" + jsonInputString);
      
            int responseCode = 200; // Ok
            String responseMessage = "El email se ha enviado correctamente";


            // // Envía la petición al servidor
            // try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
            // wr.write(jsonInputString.getBytes());
            // }
            //  Esto lo comentamos por que lo vamos a simular, el API no existe ;-)
            // // Obtiene la respuesta del servidor
            // int responseCode = con.getResponseCode();
            // System.out.println("Response code: " + responseCode);
      
            // StringBuilder response = new StringBuilder();
            // try (BufferedReader in = new BufferedReader(
            //     new InputStreamReader(con.getInputStream()))) {
            //   String line;
            //   while ((line = in.readLine()) != null) {
            //     response.append(line);
            //   }
            // }
      
            // Muestra la respuesta del servidor
            System.out.println("Código de respuesta del servidor:" + responseCode);
            System.out.println("Mensaje de respuesta del servidor" + responseMessage);
          } catch (Exception e) {
            e.printStackTrace();
          }


        return true;
    }

    



}
