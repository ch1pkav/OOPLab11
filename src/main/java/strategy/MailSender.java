package strategy;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    public static void sendMail(MailInfo mailInfo) throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("30872a34557b7282a75694cd334e8b38", "21e8057e4141355fbeba5b1df8208334", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "teodor.muzychuk@ucu.edu.ua")
                                        .put("Name", "Teodor"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", mailInfo.client.getEmail())
                                                .put("Name", mailInfo.client.getName())))
                                .put(Emailv31.Message.SUBJECT, mailInfo.getMailSubject())
                                .put(Emailv31.Message.TEXTPART, mailInfo.getMailText())
                                .put(Emailv31.Message.HTMLPART, "")
                                .put(Emailv31.Message.CUSTOMID, mailInfo.mailCode)));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
