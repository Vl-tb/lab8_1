package mail_types;

public class MailSender {
    public String sendMail(MailInfo info){
    String email = info.getMail();
    return "Success";
    }
}
