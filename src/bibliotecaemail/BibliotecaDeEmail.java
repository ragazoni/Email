package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class BibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		
		EnviaEmail.enviar("vawefe2532@nic58.com", // email que vai receber
							"Exemplo sobre uso de bibliotes de terceiros",
							"Se voc� recebeu esse e-mail � porque funcionou!"
							);
		
		System.out.println("Deu certo");


	}

}
