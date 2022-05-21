package org.iesalandalus.programacion.torreajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	private static Torre torre;
	public static void main(String[] args) {
		System.out.println("kk");
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
			System.out.print(" Elija una opción: ");
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 5);
		return opcion;
	}
	
	private static  Color elegirColor() {
		int elegir;
		System.out.println("Elija un color");
		System.out.println(" 1- Blanco");
		System.out.println(" 2- Negro ");

		do {
			elegir = Entrada.entero();
		} while (elegir != 1 && elegir != 2);

		if (elegir == 1) {
			return Color.BLANCO;
		} else {
			return Color.NEGRO;
		}
	}
	
	private static char elegirColumnaInicial() {
		
	}
	
	private static void mostrarMenuDirecciones() {
		
	}
	
	private static Direccion elegirDireccion() {
		
	}
	
	private static void crearTorreDefecto() {
		
	}
	
	
	private static void crearTorreColor() {
		
	}
	
	
	private static void crearTorreColorColumna() {
		
	}
	
	private static void mover() {
		
	}
	
	
	
}

