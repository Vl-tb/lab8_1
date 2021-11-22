package mail_types;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    Client client1;
    Client client2;
    Client client3;

    @Before
    public void setUp() throws Exception {
        Client client1 = new Client("Vlad", Gender.MALE, 19);
        Client client2 = new Client("Valera", Gender.MALE, 29);
        Client client3 = new Client("Stepan", Gender.MALE, 43);
    }

    @Test
    public void getId() {
        assertEquals(client1.getId(), 3);
        assertEquals(client2.getId(), 3);
        assertEquals(client3.getId(), 3);
    }
}