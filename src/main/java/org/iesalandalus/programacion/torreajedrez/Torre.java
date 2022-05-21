/**
 * 
 */
package org.iesalandalus.programacion.torreajedrez;

/**
 * @author Adan
 *
 */
public class Torre {
// Atributos de clases	
private Posicion posicion;
private Color color;

//Constructores

public Torre() {
	this.color=color.NEGRO;
	this.posicion=new Posicion(8,'h');
}

public Torre(Color color) {
	if (color==Color.BLANCO) {
		this.posicion= new Posicion(1,'h');
	}
	else if(color==Color.NEGRO) {
		
		this.posicion= new Posicion(8,'h');
	}
	else {
		throw new IllegalArgumentException("ERROR: Color no valido.");
	}
}


//Metodos
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
