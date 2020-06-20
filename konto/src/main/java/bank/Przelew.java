package bank;
import org.springframework.web.bind.annotation.RequestMapping;




@RequestMapping("/przelew")
public class Przelew {

private double kwota;

public double getKwota() {
	return kwota;
}
public void setKwota(double kwota) {
	this.kwota = kwota;
}

}
