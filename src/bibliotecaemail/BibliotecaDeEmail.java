package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class BibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		
		EnviaEmail.enviar("vawefe2532@nic58.com", // email que vai receber
							"Exemplo sobre uso de bibliotes de terceiros",
							"Se você recebeu esse e-mail é porque funcionou!"
							);
		
		System.out.println("Deu certo");


	}

}
