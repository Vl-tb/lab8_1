package mail_types;

import java.util.ArrayList;

public class MailBox {
    ArrayList<MailInfo> info = new ArrayList<>();
    MailSender sender = new MailSender();

    public void addMailInfo(MailInfo data){
        info.add(data);
    }
    public void sendAll(){
        for (int i=0; i<info.size(); i++){
            sender.sendMail(info.get(i));
        }
    }
}
