package adaptadorEmail;

public class AdaptadorMailAMailTerceros implements AdaptadorEmail {
    
	private String REMITENTE = "grupal@reutilizacionsoftware.com"; // Remitente del email, por defecto ponemos uno imaginario.
	private MailTerceros mailTerceros;
 
    public AdaptadorMailAMailTerceros() {
        
    	mailTerceros = new MailTerceros();
    }

    public Boolean send(String para, String asunto, String mensaje) {
        
    	mailTerceros.sendEmail(para, REMITENTE, asunto, mensaje);
        return true;
    }
}