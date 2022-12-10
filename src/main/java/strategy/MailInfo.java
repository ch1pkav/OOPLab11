package strategy;

public class MailInfo {
    enum MailType {
        GREETING, ADVERTISEMENT, NOTIFICATION
    }
    public MailType mailCode;
    public Client client;

    public MailInfo(MailType mailCode, Client client) {
        this.mailCode = mailCode;
        this.client = client;
    }

    public String getMailText() {
        switch (mailCode) {
            case GREETING:
                return "Hello, " + client.getName() + "!";
            case ADVERTISEMENT:
                return "Buy our new product!";
            case NOTIFICATION:
                return "You have a new message!";
            default:
                return "Unknown mail type";
        }
    }

    public String getMailSubject() {
        switch (mailCode) {
            case GREETING:
                return "Greetings!";
            case ADVERTISEMENT:
                return "Advertisement!";
            case NOTIFICATION:
                return "Notification!";
            default:
                return "Unknown mail type";
        }
    }
}