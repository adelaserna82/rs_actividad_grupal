package EmailQueueWithAdapter;

public interface IEmailAdapter {
    public Boolean send(EmailRequest emmailRequest);
}
