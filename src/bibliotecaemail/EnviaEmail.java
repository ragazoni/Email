package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnviaEmail {
	
	static void enviar(String param, String assunto, String mensagem) throws EmailException {
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("vawefe2532@nic58.com", "senha"));
		email.setSSLOnConnect(true);
		email.setFrom("vawefe2532@nic58.com");
		email.setSubject(assunto);
		email.setMsg(mensagem);
		email.addTo(param);
		email.send();		
	}

}
