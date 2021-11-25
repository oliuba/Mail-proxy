package mail_sender;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("src/main/java/happy_birthday.txt"), GREETINGS("src/main/java/greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() {
        Path currentRelativePath = Paths.get(filename);
        String absPath = currentRelativePath.toAbsolutePath().toString();
        String result = "";
        try {
            File file = new File(absPath);
            Scanner text = new Scanner(file);
            while (text.hasNextLine()) {
                String line = text.nextLine();
                result += line;
                if (text.hasNextLine()) {
                    result += '\n';
                }
            }
            text.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
