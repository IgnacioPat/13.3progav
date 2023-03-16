import javax.swing.JOptionPane;

public class Admin extends Persona{

	private int contras;

	public int getContras() {
		return contras;
	}

	public void setContras(int contras) {
		this.contras = contras;
	}

	public Admin(String nombre, String apellido, int contras) {
		super(nombre, apellido);
		this.contras = contras;
	}

	@Override
	public String toString() {
		return "Admin contraseña " + contras + ", Nombre :" + getNombre() + ", Apellido :" + getApellido();
	}
	
	public int agregarDinero(int cant,Cajero cajero) {
		
	do {
		cant=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar cant de dinero a agregar"));
	} while (cant<=0);
		
	cajero.setSaldo(cajero.getSaldo()+cant);
		return cant;
		
	}
}
