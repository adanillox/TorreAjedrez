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
//Declaramos el constructor con parametros
public Posicion(int fila,char columna) {
	setFila(fila);
	setColumna(columna);
}

//Declaramos la copia del constructor para controlar la excepción
public Posicion(Posicion posicion) {
	if(posicion== null) {
		throw new NullPointerException("ERROR: No es posible copiar una posicion nula.");
	}
	else {
		this.fila=posicion.getFila();
		this.columna=posicion.getColumna();
	}
}
//Declaramos los metodos
public int getFila() {
	return this.fila;
}

private void setFila(int fila) {
	if (fila >= 1 && fila <= 8) {
		this.fila = fila;
	} else {
		
		throw new IllegalArgumentException("ERROR: Fila no valida.");

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
		
		throw new IllegalArgumentException("ERROR: Columna no valida.");

	}
}

}
