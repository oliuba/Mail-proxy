package mail_sender;

import java.io.IOException;
import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> infos;
    public MailBox() {
        infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }

    public void sendAll() throws IOException {
        for (MailInfo info: infos) {
            MailSender sender = new MailSender(info);
            try {
                sender.sendMail();
            } catch (IOException ex) {
                throw ex;
            }
        }
    }
}
