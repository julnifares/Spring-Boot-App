package bank;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;


@Controller
public class controller {
	Konto inst = Konto.getInstance();
	Przelew Pinst = new Przelew();
	@RequestMapping(value = "/")
	public String homePage(Model model) {
		
		model.addAttribute("saldo", ""+inst.getSaldo());
		return "home";
	}
	
	
	@RequestMapping("/zasilenie")
	public String saveZasilenie(@ModelAttribute Przelew przelew, BindingResult errors, Model model) {
		  
		
	        Konto.getInstance().zasil(przelew.getKwota());
	        model.addAttribute("saldo", ""+inst.getSaldo());
	        return "zasilenie";
			}
	
	
	}
	
	

