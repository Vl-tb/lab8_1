package mail_types;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class MailInfo {
    Client client;
    MailCode code;

    public MailInfo(Client client, MailCode code){
        this.client = client;
        this.code = code;
    }

    public String getMail(){
        return client.getMail();
    }

    public String getMailText() throws FileNotFoundException {
        String text = code.generateText();
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        for (String key: templates.keySet()){
            text = text.replace(key, templates.get(key));
        }
        return text;
    }
}
