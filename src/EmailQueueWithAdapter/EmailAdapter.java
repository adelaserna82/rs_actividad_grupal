package EmailQueueWithAdapter;

public class EmailAdapter implements IEmailAdapter {
    private MailRelay _mailRelay;

    
    public EmailAdapter() {
        _mailRelay = new MailRelay();
    }


    @Override
    public Boolean send(EmailRequest emmailRequest) {
        _mailRelay.sendEmail(emmailRequest.getTo(), emmailRequest.getSubject(), emmailRequest.getMessage());
        return true;
    }
    
}
