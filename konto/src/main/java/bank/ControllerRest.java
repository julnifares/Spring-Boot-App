package bank;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class ControllerRest {
	
		Konto inst = Konto.getInstance();
		Przelew Pinst = new Przelew();
		
		@PutMapping("/przelew")
		    public Przelew PutPrzelew(@ModelAttribute Przelew przelew, BindingResult errors, Model model) {
			
			if(przelew.getKwota()>inst.getSaldo())
				throw new RuntimeException("Kwota większa niż saldo");
				else {
				Konto.getInstance().przelej(przelew.getKwota());
				model.addAttribute("saldo", ""+inst.getSaldo());
				return przelew;
			}
		}
		@GetMapping("/przelew")
	    public Przelew getPrzelew(@ModelAttribute Przelew przelew, BindingResult errors, Model model) {
		
		return przelew;
		}
	
		@PostMapping("/przelew")
	    public Przelew PostPrzelew(@ModelAttribute Przelew przelew, BindingResult errors, Model model) {
		
		if(przelew.getKwota()>inst.getSaldo())
			throw new RuntimeException();
			else {
			Konto.getInstance().przelej(przelew.getKwota());
			model.addAttribute("saldo", ""+inst.getSaldo());
			return przelew;
		}
	}
		
		@PutMapping("/zasilenie")
		public Przelew putZasilenie(@ModelAttribute Przelew przelew, BindingResult errors, Model model) {
			  
			
		        Konto.getInstance().zasil(przelew.getKwota());
		        model.addAttribute("saldo", ""+inst.getSaldo());
		        return przelew;
				}
		
		@PostMapping("/zasilenie")
		public Przelew postZasilenie(@ModelAttribute Przelew przelew, BindingResult errors, Model model) {
			  
			
		        Konto.getInstance().zasil(przelew.getKwota());
		        model.addAttribute("saldo", ""+inst.getSaldo());
		        return przelew;
				}
		
		@GetMapping("/zasilenie")
	    public Przelew getZasilenie(@ModelAttribute Przelew przelew, BindingResult errors, Model model) {
		
		return przelew;
		}
		
		
		}		

		    
		
		
	


