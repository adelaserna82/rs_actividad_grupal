package adaptadorEmail;

public interface AdaptadorEmail {
	
    public Boolean send(String para, String asunto, String mensaje);
}