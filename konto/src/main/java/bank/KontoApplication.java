package bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class KontoApplication {
	   
	public static void main(String[] args) {
		SpringApplication.run(KontoApplication.class, args);
		
		
	}

}
