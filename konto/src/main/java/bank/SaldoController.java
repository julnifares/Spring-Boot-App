package bank;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SaldoController {

	

	@GetMapping("/saldo")
	public Konto konto(@RequestParam(value = "name", defaultValue = "brak") String name) {
		
		return Konto.getInstance();
	}
}