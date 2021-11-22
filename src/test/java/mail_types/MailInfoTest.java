package mail_types;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MailInfoTest {
    Client client;
    MailInfo data;

    @Before
    public void setUp() throws Exception {
        client = new Client("Vladyslav", Gender.MALE, 19);
        data = new MailInfo(client, MailCode.GREETINGS);
    }

    @Test
    public void getMailText() throws Exception{
        assertEquals(data.getMailText(), "Greetings, Vladyslav!");
    }
}