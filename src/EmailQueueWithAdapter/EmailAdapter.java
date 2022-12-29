package EmailQueueWithAdapter;

public class EmailAdapter implements IEmailAdapter {
    MailRelay mailRelay;

    
    public EmailAdapter() {
        mailRelay = new MailRelay();
    }


    @Override
    public Boolean send(EmailRequest emmailRequest) {
        mailRelay.SendEmail(emmailRequest.get_to(), emmailRequest.get_subject(), emmailRequest.get_message());
        return true;
    }
    
}
