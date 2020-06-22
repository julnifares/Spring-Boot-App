package bank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class przelewController {
	Konto inst = Konto.getInstance();
	@RequestMapping("/przelewOK")
	    public String savePrzelew(@ModelAttribute Przelew przelew, BindingResult errors, Model model) {
		
			
			if(przelew.getKwota()>inst.getSaldo())
			return"tooMuch";
			else {
	        inst.przelej(przelew.getKwota());
	        model.addAttribute("saldo", ""+inst.getSaldo());
	        return "przelewOK";}
	    }
	@RequestMapping("/tooMuch")
	public String too(Model model) {
		 
		model.addAttribute("napis", inst.getaccountNumber());
		return "tooMuch";
	}
	}


