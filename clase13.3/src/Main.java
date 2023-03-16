
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int abc;
		int cba;
		Cliente ignacio = new Cliente("ignacio", "sagnella", 1234, 1000);
		Admin Pepe = new Admin("Pepe", "Argento", 777);
		Cajero cajero = new Cajero(5000);

		String[] opc = { "Sacar dinero (cliente)", "Cambiar Pin (cliente)", "Agregar dinero al cajero (admin)", "Ver dinero que tiene el cajero",
				"Salir" };
		String[] dinero = { "100", "200", "500", "1000", "2000", "5000" };
		do {
			abc = JOptionPane.showOptionDialog(null, "Bienvenido al cajero, elija alguna de las siguientes opciones", null, 0, 0, null, opc, opc);

			switch (abc) {

			case 0:
				cba = JOptionPane.showOptionDialog(null, "Elegir el monto a retirar", null, 0, 0, null, dinero, dinero);
				switch (cba) {
				case 0:
					JOptionPane.showMessageDialog(null, ignacio.retirarDinero(100, cajero));
					// mostrarSaldo(ignacio);
					break;
				case 1:
					JOptionPane.showMessageDialog(null, ignacio.retirarDinero(200, cajero));
					// mostrarSaldo(ignacio);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, ignacio.retirarDinero(500, cajero));
					// mostrarSaldo(ignacio);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, ignacio.retirarDinero(1000, cajero));
					// mostrarSaldo(ignacio);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, ignacio.retirarDinero(2000, cajero));
					// mostrarSaldo(ignacio);
					break;
				case 5:
					JOptionPane.showMessageDialog(null, ignacio.retirarDinero(5000, cajero));
					// mostrarSaldo(ignacio);
					break;
				}
				break;
			case 1:
				ignacio.cambiarPin(cajero);
				JOptionPane.showMessageDialog(null, ignacio.toString());
				break;
			case 2:
				Pepe.agregarDinero(0, cajero);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, " El cajero tiene : $" + cajero.getSaldo());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Saliendo... Gracias por elegir nuestro servicio");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Error al elegir");
				break;
			}

		} while (abc != 4);

		// JOptionPane.showMessageDialog(null, ignacio.retirarDinero(7000, cajero));
		// JOptionPane.showMessageDialog(null, ignacio.retirarDinero(1000, cajero));
		// JOptionPane.showMessageDialog(null, ignacio.toString() );

	}

	public static void mostrarSaldo(Cliente cliente) {
		JOptionPane.showMessageDialog(null, "El saldo actual de la cuenta es de $" + cliente.getSaldo());
	}

}
