/**
 * 
 */
package org.iesalandalus.programacion.torreajedrez;

/**
 * @author Adan
 *
 */
//Declaramos los atributos
public class Posicion {
	
private int fila;
private char columna;
//Declaramos los metodos
public int getFila() {
	return this.fila;
}

private void setFila(int fila) {
	if (fila >= 1 && fila <= 8) {
		this.fila = fila;
	} else {
		
		throw new IllegalArgumentException("ERROR: Fila no válida, tiene que ser entre .");

	}
}

public char getColumna() {
	return this.columna;
}

private void setColumna(char columna) {
	if (columna == 'a' ||columna == 'b' || columna == 'c' ||columna == 'd' ||
		columna == 'e' ||columna == 'f' ||columna == 'g' ||columna == 'h') {
		this.columna = columna;
	} else {
		
		throw new IllegalArgumentException("ERROR: Columna no válida,tiene que ser entre a y h");

	}
}

}
