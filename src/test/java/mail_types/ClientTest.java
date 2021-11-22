package mail_types;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getId() {
        Client client1 = new Client("Vlad", Gender.MALE, 19);
        assertEquals(client1.getId(), 0);

        Client client2 = new Client("Valera", Gender.MALE, 29);
        assertEquals(client2.getId(), 1);

        Client client3 = new Client("Stepan", Gender.MALE, 43);
        assertEquals(client3.getId(), 2);
    }
}