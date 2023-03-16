
public class Cajero {
	
	private double saldo;

	public Cajero(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cajero saldo :" + saldo + "]";
	} 
	
	

}
