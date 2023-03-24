
import javax.swing.JOptionPane;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		LinkedList<Movimientos> mov = new LinkedList<Movimientos>();
		int abc;
		int cba;
		int mont;
		Cliente Fatiga = new Cliente("Fatiga", "Perro", 1234, 8000);
		Admin Pepe = new Admin("Pepe", "Argento", 777);
		Cajero cajero = new Cajero(5000);

		String[] opc = { "Retirar dinero (cliente)", "Cambiar Pin (cliente)","Ver movimientos (cliente)", "Agregar dinero al cajero (admin)", "Ver saldo de este cajero (admin)",
				"Salir" };
		String[] dinero = { "100", "200", "500", "1000", "2000", "5000","Otros montos" };
		int pin;
		int contra;
		do {
			pin= Integer.parseInt(JOptionPane.showInputDialog(null, "Hola. ingrese su pin para iniciar sesion (Pista : "+Fatiga.getCuenta()+")"));
			Fatiga.login(pin);
			if (pin!=Fatiga.getCuenta()) {
				JOptionPane.showMessageDialog(null, "Pin incorrecto");
			}
		} while (pin!=Fatiga.getCuenta());
		JOptionPane.showMessageDialog(null, "Bievenido "+ Fatiga.getNombre());
		
		
		do {
			abc = JOptionPane.showOptionDialog(null, "Bienvenido al cajero "+ Fatiga.getNombre()+" "+Fatiga.getApellido() +", elija alguna de las siguientes opciones", null, 0, 0, null, opc, opc);

			switch (abc) {

			case 0:
				// Bug encontrado: los movimientos se agregan incluso si el saldo es insuficiente
				cba = JOptionPane.showOptionDialog(null, "Elegir el monto a retirar \nSaldo actual : "+Fatiga.getSaldo(), null, 0, 0, null, dinero, dinero);
				switch (cba) {
				case 0:
					JOptionPane.showMessageDialog(null, Fatiga.retirarDinero(100, cajero));
					// mostrarSaldo(ignacio);
					Movimientos movi1 = new Movimientos(100);
					mov.add(movi1);
					break;
				case 1:
					JOptionPane.showMessageDialog(null, Fatiga.retirarDinero(200, cajero));
					// mostrarSaldo(ignacio);
					Movimientos movi2 = new Movimientos(200);
					mov.add(movi2);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, Fatiga.retirarDinero(500, cajero));
					// mostrarSaldo(ignacio);
					Movimientos movi3 = new Movimientos(500);
					mov.add(movi3);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, Fatiga.retirarDinero(1000, cajero));
					// mostrarSaldo(ignacio);
					Movimientos movi4 = new Movimientos(1000);
					mov.add(movi4);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, Fatiga.retirarDinero(2000, cajero));
					// mostrarSaldo(ignacio);
					Movimientos movi5 = new Movimientos(2000);
					mov.add(movi5);
					break;
				case 5:
					JOptionPane.showMessageDialog(null, Fatiga.retirarDinero(5000, cajero));
					// mostrarSaldo(ignacio);
				//	if( Fatiga.getSaldo()>=5000){
					//	if(cajero.getSaldo()>=5000) {
					
						Movimientos movi6 = new Movimientos(5000);
						mov.add(movi6);
						//
					//	}
					//}else {
					break;
				case 6:
					do {
					mont= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingreese cant de dinero"));
					if (mont<=0) {
						JOptionPane.showMessageDialog(null, "Ingrese un monto valido");
					}
					} while (mont<=0);
					JOptionPane.showMessageDialog(null, Fatiga.retirarDinero(mont, cajero));
					Movimientos movi = new Movimientos(mont);
					mov.add(movi);
					// mostrarSaldo(ignacio);
					break;
				}
				break;
			case 1:
				Fatiga.cambiarPin(cajero);
				JOptionPane.showMessageDialog(null, Fatiga.toString());
				break;
			case 2:
				JOptionPane.showMessageDialog(null, mov);
				break;
			case 3:
				contra= Integer.parseInt(JOptionPane.showInputDialog(null, "Hola. ingrese su constraseña de administrador (Pista : "+Pepe.getContras()+")"));
				Pepe.loginEmp(contra);
				if (Pepe.loginEmp(contra)) {
					Pepe.agregarDinero(0, cajero);
				} else {
					JOptionPane.showMessageDialog(null, "Incorrecto, intentelo mas tarde");
				}
				break;
			case 4:	
				contra= Integer.parseInt(JOptionPane.showInputDialog(null, "Hola. ingrese su constraseña de administrador (Pista : "+Pepe.getContras()+")"));
				if (contra!=Pepe.getContras()) {
					JOptionPane.showMessageDialog(null, "Incorrecto, intentelo mas tarde");
				} else {
					Pepe.loginEmp(contra);
					JOptionPane.showMessageDialog(null, " El cajero tiene : $" + cajero.getSaldo());
				}
				
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Saliendo... Gracias por elegir nuestro servicio");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Error al elegir \nPara salir del cajero elija la opcion 'Salir'");
				break;
			}

		} while (abc != 5);

		// JOptionPane.showMessageDialog(null, ignacio.retirarDinero(7000, cajero));
		// JOptionPane.showMessageDialog(null, ignacio.retirarDinero(1000, cajero));
		// JOptionPane.showMessageDialog(null, ignacio.toString() );

	}

	//public static void mostrarSaldo(Cliente cliente) {
		//JOptionPane.showMessageDialog(null, "El saldo actual de la cuenta es de $" + cliente.getSaldo());
	//}

}
