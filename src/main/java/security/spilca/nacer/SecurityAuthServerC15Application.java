package security.spilca.nacer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityAuthServerC15Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SecurityAuthServerC15Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("the authServer storing tokens in DB had started....");
	}

}
