package mail_types;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("src/main/java/mail_types/happy_birthday.txt"), GREETINGS("src/main/java/mail_types/greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() throws FileNotFoundException {
        File file = new File(this.filename);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        String text = sc.next();
        return text;
    }
}
