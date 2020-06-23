package bank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class przelewController {
	
	@RequestMapping("/przelewOK")
	public String savePrzelew(@ModelAttribute Przelew przelew, BindingResult errors, Model model) {
		
		
			return "przelewOK";
		}
	}
	    
	



