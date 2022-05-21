/**
 * 
 */
package org.iesalandalus.programacion.torreajedrez;

/**
 * @author Adan
 *
 */
public class Torre {
	
private Posicion posicion;
private Color color;


public Posicion getPosicion() {
	return this.posicion;
}
private void setPosicion(Posicion posicion) {
	if(posicion== null) {
		
		throw new IllegalArgumentException("ERROR: No se puede asignar una posicion nula."); 
	}
	else  {
		this.posicion = posicion;
	}
	
}
public Color getColor() {
	return this.color;
}
private void setColor(Color color) {
	if(color==null) {
		
		throw new IllegalArgumentException("ERROR: No se puede asignar un color nulo.");
	}
	else {
		this.color = color;
	}
	
}

}
