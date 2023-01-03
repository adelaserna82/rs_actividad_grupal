package EmailQueueWithAdapter;

/* Clase que contiene la información de un email */
public class EmailRequest {
    private String _to;
    private String _subject;
    private String _message;
    
    public EmailRequest(String to, String subject, String message) {
        this._to = to;
        this._subject = subject;
        this._message = message;
    }

    public String getTo() {
        return _to;
    }

    public String getSubject() {
        return _subject;
    }

    public String getMessage() {
        return _message;
    }
}
