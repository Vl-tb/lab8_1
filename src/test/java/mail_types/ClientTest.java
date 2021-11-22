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

    }

    @Test
    public void getId() {
        client1 = new Client("Vlad", Gender.MALE, 19);
        assertEquals(client1.getId(), 0);
        client2 = new Client("Valera", Gender.MALE, 29);
        assertEquals(client2.getId(), 1);
        client3 = new Client("Stepan", Gender.MALE, 43);
        assertEquals(client3.getId(), 2);
    }
}