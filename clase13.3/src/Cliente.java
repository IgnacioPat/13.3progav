import javax.swing.JOptionPane;

public class Cliente extends Persona{
	
	private int cuenta;
	private double saldo;
	
	public Cliente(String nombre, String apellido, int cuenta, double saldo) {
		super(nombre, apellido);
		this.cuenta = cuenta;
		this.saldo = saldo;
	}
	public int getCuenta() {
		return cuenta;
	}
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cliente N° de cuenta :" + cuenta + ", Saldo : " + saldo + ", Nombre : " + getNombre() + ", Apellido : "
				+ getApellido();
	} 
	
	public String retirarDinero( int monto, Cajero cajero ) {
		
		
		if( this.getSaldo()>=monto){
			if(cajero.getSaldo()>=monto) {
			this.setSaldo(this.getSaldo()-monto);
			cajero.setSaldo(cajero.getSaldo()-monto);
			return "Se retiro³: "+monto+ " de la cuenta: "+this.getCuenta() 
			+  " y el saldo restante es: " + this.getSaldo();
			}else {
				return "El cajero no tiene suficiente dinero";
			}
		}else {
			return "No tiene saldo suficiente en la cuenta";
		}
	
	}
	

	public int cambiarPin ( Cajero cajero) {
		
	cuenta= Integer.parseInt(JOptionPane.showInputDialog(null,"introduzca nuevo pin"));
		return cuenta;
	}
	
}
