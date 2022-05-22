package org.iesalandalus.programacion.torreajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	private static Torre torre;
	public static void main(String[] args) throws OperationNotSupportedException {
		int opcion;
		do {
			mostrarMenu();
			opcion = elegirOpcion();
			ejecutarOpcion(opcion);
			if (opcion != 5) {
				mostrarTorre();
			}
		} while (opcion != 5);

		System.out.println("Bye");
	}

	
	
	
	
	
	
	private static void mostrarTorre() {
		if (torre != null) {
			System.out.println("Torre: " + torre.toString());
		} else {
			System.out.println("No se ha creado ninguna torre.");
		}
	}
	
	
	private static  void mostrarMenu() {
		System.out.println("1- Crear torre por defecto");
		System.out.println("2- Crear torre de un color");
		System.out.println("3- Crear torre de un color en una columna inicial dada");
		System.out.println("4- Mover torre");
		System.out.println("5- Salir");
	}
	
	private static int elegirOpcion() {
		int opcion;
		do {
			System.out.print(" Elija una opcion: ");
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 5);
		return opcion;
	}
	
	private static  Color elegirColor() {
		int elegir;
		do {
		System.out.println("Elija un color");
		System.out.println(" 1- Blanco");
		System.out.println(" 2- Negro ");
			elegir = Entrada.entero();
		} while (elegir != 1 && elegir != 2);

		if (elegir == 1) {
			return Color.BLANCO;
		} else {
			return Color.NEGRO;
		}
	}
	
	private static char elegirColumnaInicial() {
		char ColumnaIni;
		do {
			System.out.print("Elige  la columna inicial (a o h): ");
			ColumnaIni = Entrada.caracter();
		} while (ColumnaIni != 'a' && ColumnaIni != 'h');
		return ColumnaIni;
	}
	
	private static void mostrarMenuDirecciones() {
		System.out.println("Menu de direcciones");
		System.out.println("1. Arriba");
		System.out.println("2. Abajo");
		System.out.println("3. Izquierda");
		System.out.println("4. Derecha");
		System.out.println("5. Enroque Corto");
		System.out.println("6. Enroque Largo");
	
	}
	
	private static Direccion elegirDireccion() {
		
		int opcion;
		do {
			mostrarMenuDirecciones();
			System.out.print(" Elija una opcion: ");;
			opcion = Entrada.entero();

		} while (opcion < 1 || opcion > 6);

		Direccion direccion=null ;
		switch (opcion) {
		case 1:
			direccion = Direccion.ARRIBA;
			break;
		case 2:
			direccion = Direccion.ABAJO;
			break;
		case 3:
			direccion = Direccion.IZQUIERDA;
			break;
		case 4:
			direccion = Direccion.DERECHA;
			break;
		case 5:
			direccion = Direccion.ENROQUE_CORTO;
			break;
		case 6:
			direccion = Direccion.ENROQUE_LARGO;
			break;
		default:

		}
		return direccion;
	}
	
	private static void crearTorreDefecto() {
		torre = new Torre();
		System.out.println("Se creo la torre por defecto.");
	}
	
	
	private static void crearTorreColor() {
		Color color = elegirColor();
		torre = new Torre(color);
		System.out.println("Se creo la torre por defecto a partir del color.");
	
	}
	
	
	private static void crearTorreColorColumna() {
		char columna = elegirColumnaInicial();
		Color color = elegirColor();
		torre = new Torre(color, columna);
		System.out.println("Se creo una torre a partir del color y columna seleccionados.");
		
	}
	
	private static void mover() throws OperationNotSupportedException {
		Direccion direccion = elegirDireccion();

		if (direccion != Direccion.ENROQUE_CORTO && direccion != Direccion.ENROQUE_LARGO) {
			System.out.print("¿Cuántos pasos quieres que de la torre?: ");
			int pasos = Entrada.entero();

			try {
				torre.mover(direccion, pasos);
			} catch (OperationNotSupportedException | NullPointerException e) {
				System.out.println(e.getMessage());
			}
		
		} else {
			try {
				torre.enrocar(direccion);
				if (direccion == Direccion.ENROQUE_CORTO ) {
				System.out.print("El enroque corto ha sido correcto;)\n");
				} else {
					System.out.print("El enroque largo ha sido correcto ;)\n");
				}
				
			} catch (OperationNotSupportedException | NullPointerException e) {
				System.out.println(e.getMessage());
			}
		}
	
		

		System.out.print("Indique el número de pasos a dar");
		int pasos = Entrada.entero();
		torre.mover(direccion, pasos);
		System.out.println("Movimiento realizado correctamente");
	}
	
	private static void ejecutarOpcion(int opcion) throws OperationNotSupportedException {
		switch (opcion) {
			case 1:
				crearTorreDefecto();
				break;
			case 2:
				crearTorreColor();
				break;
			case 3:
				crearTorreColorColumna();
				break;
			case 4:
				if (torre != null) {
					mover();
				} else {
					System.out.println("No hay ninguna torre creada.");
				}
				break;
			default:
				break;
		}
	}
	
	
}

