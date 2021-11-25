package mail_sender;

import client.Client;
import client.Sex;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    private Client client;
    private MailCode code;
    private MailInfo info;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        client = new Client("Arman", 18, Sex.MALE, "arman@gmail.com");
        code = MailCode.HAPPY_BIRTHDAY;
        info = new MailInfo(client, code);
    }

    @org.junit.jupiter.api.Test
    void getText() {
        assertEquals("HI Arman!\nHappy Birthday!", info.getText());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(client.getEmail(), info.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getClient() {
        assertEquals(client, info.getClient());
    }

    @org.junit.jupiter.api.Test
    void getMailCode() {
        assertEquals(code, info.getMailCode());
    }
}