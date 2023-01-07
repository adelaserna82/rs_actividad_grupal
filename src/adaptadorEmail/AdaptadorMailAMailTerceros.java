package adaptadorEmail;

public class AdaptadorMailAMailTerceros implements AdaptadorEmail {
    
	private String de = "grupal@reutilizacionsoftware.com"; // Remitente del email, por defecto ponemos uno imaginario.
	private MailTerceros mailTerceros;
 
    public AdaptadorMailAMailTerceros() {
        
    	mailTerceros = new MailTerceros();
    }

    public Boolean send(String para, String asunto, String mensaje) {
        
    	mailTerceros.sendEmail(para, de, asunto, mensaje);
        return true;
    }
}