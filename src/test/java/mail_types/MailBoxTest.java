package mail_types;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MailBoxTest {
    Client client;
    MailInfo data;
    MailBox box;

    @Before
    public void setUp() throws Exception {
        client = new Client("Vladyslav", Gender.MALE, 19);
        data = new MailInfo(client, MailCode.GREETINGS);
        box = new MailBox();
        box.addMailInfo(data);
    }

    @Test
    public void sendAll() {
        box.sendAll();
    }
}