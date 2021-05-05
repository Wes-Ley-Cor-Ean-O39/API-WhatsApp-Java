package Projeto.Teste.API.WhatsApp;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class SendWhatsAppMessage {

	public static final String ACCOUNT_SID = "AC68a8f1c7911866f469ea5db19c181026";
	   public static final String AUTH_TOKEN = "29ec2830aad549549311b05b9e0207be";

	   public static void main(String[] args) {
	       Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	       Message message = Message.creator(
	               new com.twilio.type.PhoneNumber("whatsapp:+5511948943700"),
	               new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
				"Hello Kin from your friendly neighborhood Java application!").create();

		System.out.println(message);
	}

}
