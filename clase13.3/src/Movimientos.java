
public class Movimientos {

	private int id;
	private static int autoi = 1;
	private int montoPlata;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMontoPlata() {
		return montoPlata;
	}

	public void setMontoPlata(int montoPlata) {
		this.montoPlata = montoPlata;
	}

	public Movimientos(int montoPlata) {
		super();
		this.id = Movimientos.autoi;
		Movimientos.autoi++;
		this.montoPlata = montoPlata;
	}

	@Override
	public String toString() {
		return "\nMovimiento n° " + id + ", monto extraido " + montoPlata + "\n";
	}

//	@Override
//	public String toString() {
	// return "\nMovimiento n° " + id + ", " + cliente.getNombre() +" Saldo : "+
	// cliente.getSaldo()+ "\n";
	// }

}
