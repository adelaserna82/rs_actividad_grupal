package EmailQueueWithAdapter;

public class EmailAdapter implements IEmailAdapter {
    private MailRelay _mailRelay;

    
    public EmailAdapter() {
        _mailRelay = new MailRelay();
    }


    @Override
    public Boolean send(EmailRequest emmailRequest) {
        _mailRelay.sendEmail(emmailRequest.get_to(), emmailRequest.get_subject(), emmailRequest.get_message());
        return true;
    }
    
}
