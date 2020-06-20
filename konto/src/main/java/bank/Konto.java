package bank;

public class Konto {
	static long leftLimit = 1000000000000L;
    static long rightLimit =9999999999999L;
    static long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
private static String num=""+generatedLong+generatedLong;
private static double sal=1000.00;
private String accountNumber;
private double saldo;
private Konto(double saldo, String number) {
	this.saldo=saldo;
	this.accountNumber=number;
}

private static final Konto instance = new Konto(sal, num);




public String getaccountNumber() {
	return accountNumber;
}

public double getSaldo() {
	return saldo;
}
public void przelej(double kwota) {
	saldo-=kwota;
}
public void zasil(double kwota) {
	saldo+=kwota;
}

public static Konto getInstance() {
		return instance;
}


}
