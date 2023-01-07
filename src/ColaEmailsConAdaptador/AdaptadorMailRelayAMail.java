package ColaEmailsConAdaptador;

public class AdaptadorMailRelayAMail implements AdaptadorEmail {
    private APIMailRelay _mailRelay;
 
    public AdaptadorMailRelayAMail() {
        _mailRelay = new APIMailRelay();
    }

    public Boolean send(DatosEmail datosEmail) {
        _mailRelay.sendEmail(datosEmail.getTo(), datosEmail.getSubject(), datosEmail.getMessage());
        return true;
    }  
}