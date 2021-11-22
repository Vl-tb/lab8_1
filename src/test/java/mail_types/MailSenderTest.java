package mail_types;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MailSenderTest {
    Client client;
    MailInfo data;
    MailSender sender;

    @Before
    public void setUp() throws Exception {
        client = new Client("Vladyslav", Gender.MALE, 19);
        data = new MailInfo(client, MailCode.GREETINGS);
        sender = new MailSender();
    }

    @Test
    public void sendMail() {
        assertEquals(sender.sendMail(data), "Success");
    }
}