package EmailQueueWithAdapter;

/* Clase que contiene la información de un email */
public class EmailRequest {
    private String _to;
    private String _subject;
    private String _message;
    
    public EmailRequest(String _to, String _subject, String _message) {
        this._to = _to;
        this._subject = _subject;
        this._message = _message;
    }

    public String get_to() {
        return _to;
    }

    public String get_subject() {
        return _subject;
    }

    public String get_message() {
        return _message;
    }
}
