package mail_types;

import org.junit.Before;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class MailCodeTest {
    MailCode code1;
    MailCode code2;

    @Before
    public void setUp() throws Exception {
        code1 = MailCode.HAPPY_BIRTHDAY;
        code2 = MailCode.GREETINGS;
    }

    @Test
    public void generateText() throws Exception{
        assertEquals(code1.generateText(), "Happy birthday, %NAME%!!!");
        assertEquals(code2.generateText(), "Greetings, %NAME%!");
    }
}