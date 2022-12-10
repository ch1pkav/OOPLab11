package strategy;

import lombok.SneakyThrows;

import java.util.ArrayList;

public class MailBox {
    public ArrayList<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }

    @SneakyThrows
    public void sendAllMail() {
        for (MailInfo info : infos) {
            MailSender.sendMail(info);
        }
    }
}
