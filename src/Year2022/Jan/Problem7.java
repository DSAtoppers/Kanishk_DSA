package Year2022.Jan;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;

class Mailer{
    public static void send(String from,String password,String to,String sub,String msg){
        //Get properties object
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        //get Session
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from,password);
                    }
                });
        //compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(sub);
            message.setText(msg);
            //send message
            Transport.send(message);
            System.out.println("message sent successfully");
        } catch (MessagingException e) {throw new RuntimeException(e);}

    }
}

public class Problem7 {

    static String[] emails = {
            "ananyanarang912@gmail.com",
            "samaptibanerjee777@gmail.com",
            "eCustomerCareIndia@gmail.com",
            "kavyashree.rgn@gmail.com",
            "hi@megha.io",
            "iamharshitchauhan@gmail.com",
            "thatdinkygirl23@gmail.com",
            "thedevofficiale@gmail.com",
            "satyam8657@gmail.com",
            "business.aryakijoon@gmail.com",
            "naineeshshahir40@gmail.com",
            "karuna72000@gmail.com",
            "gombuyangzom@gmail.com",
            "komalnegi681@gmail.com",
            "ogtsponsor@gmail.com",
            "milan1886@gmail.com",
            "contacttechbag@gmail.com",
            "contact@techontrend.net.in",
            "indianvloggerjaya@gmail.com",
            "amanwalia72@gmail.com",
            "seafarersera@gmail.com",
            "nayotaba555@gmail.com",
            "trushalidongre@gmail.com",
            "studynpraxis@gmail.com",
            "advikasinghchauhan@gmail.com",
            "aienvlogs.business@gmail.com",
            "shambhaviivlogs@gmail.com",
            "bhavyaakrishnan@gmail.com",
            "upasanak93526@gmail.com",
            "dagakhushi2005@gmail.com",
            "sarthpednekarbusiness11@gmail.com",
            "apannikita26@gmail.com",
            "siddhartha885850123@gmail.com",
            "contactdibu@gmail.com",
            "satyam8657@gmail.com",
            "gayathri.mekala20@gmail.com",
            "anchal0916@gmail.com",
            "dxbvlogsteam@gmail.com",
            "madhudilipjha@gmail.com",
            "info@chatorapoint.com",
            "bulbul25ba@gmail.com ",
            "vshanthishanthi100@gmail.com",
            "anniinavivian@gmail.com",
            "yanapatel2304@gmail.com",
            "pu.singh9395@gmail.com",
            "The.Nerds.anatomy@gmail.com",
            "yellowhammerofficial@gmail.com",
            "care@deodap.com",
            "gaurisrbhasin@gmail.com",
            "kishan.chavda777@gmail.com",
            "theakshayrathee@gmail.com",
            "teamred808@gmail.com",
            "Swatimishra476@gmail.com",
            "mactechtamil@gmail.com",
            "abhishekmulik471@gmail.com",
            "teamdaddycasseyofficial@gmail.com",
            "somu.bhattacharyay@gmail.com",
            "youtube@mysmartprice.com",
            "TeamDivyanshSabnani@gmail.com",
            "dey.ayantika2013@gmail.com",
            "vlawgish@gmail.com ",
            "prepwithkriti@gmail.com",
            "rasratul@gmail.com",
            "shreyashi.sipi@gmail.com",
            "athirartstudio@gmail.com",
            "baldbeautyindia@gmail.com ",
            "businessprashasti22@gmail.com",
            "vrushalikirtikar.work@gmail.com",
            "pravish8009@gmail.com",
            "vaishalimedical1997@gmail.com",
            "sirivlogschannel@gmail.com",
            "sidkazama@gmail.com",
            "riyakishanchandani78@gmail.com",
            "lilmissgurung@gmail.com",
            "bgirlyumaa@gmail.com",
            "kannedari.0906sri@gmail.com",
            "indianreporter001@gmail.com",
            "amitborsework@gmail.com",
            "uhditi@gmail.com",
            "vanshajsaxenaofficial@gmail.com",
            "jellymoonvlogs123@gmail.com",
            "crazynither77@gmail.com",
            "tutorialsthatworks@gmail.com",
            "officialvishakhathakur6@gmail.com",
            "speaktotmt@gmail.com",
            "preitibhamra.prteam@gmail.com",
            "rubina@bangaloremobilespa.com",
            "ajay.beniwal.got@gmail.com",
            "business@samraddhiawasthi.com"};

    static String ananyaMessage = "Hi,\n" +
            "We are looking to work with more influencers in our future Bachat Baazi Campaigns! \n" +
            "\n" +
            "Would request you to please fill this form and also share about your other friends who’d like to collaborate with us.\n" +
            "\n" +
            "Link to the form:\n" +
            "https://forms.gle/2RVmecFwgDLMrszA9\n" +
            "\n" +
            "Looking forward to your reply!\n" +
            "Team@Bachat Baazi";

    static String message ="Hi, \n" +
            "I’m reaching out to you on behalf of an influencer agency. We’re looking forward to hire some influencers for our research!\n" +
            "\n" +
            "I’d be very much obliged if you could take out 2.5 minutes out of your precious time and fill it!\n" +
            "\n" +
            "Here’s the link to the form:\n" +
            "https://forms.gle/x1vyTYdkZW8jZedcA\n" +
            "\n" +
            "Looking forward to working with you!\uD83D\uDE04\uD83D\uDE04";

    public static void main(String[] args) {

        for(int i = 0; i < emails.length; i++){
            Mailer.send("bachatbaazimarketing@gmail.com","bb@marketing",emails[i], "Bachat Baazi Promotion",ananyaMessage);
        }

    }
}
