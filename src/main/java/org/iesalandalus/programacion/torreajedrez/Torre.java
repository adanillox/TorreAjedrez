/**
 * 
 */
package org.iesalandalus.programacion.torreajedrez;

import javax.naming.OperationNotSupportedException;

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

public Torre(Color color, char columna) {
	if (color == null) {
		throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
	}
	else {
		setColor(color);
	}

	if (columna == 'a' || columna == 'h') {
		if (color == Color.BLANCO) {
			posicion = new Posicion(1, columna);
			
			
		} else if (color == Color.NEGRO) {
			posicion = new Posicion(8, columna);
		}
	}
		else {
				throw new IllegalArgumentException("ERROR: Columna no válida.");
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

public void mover(Direccion direccion,int pasos) throws OperationNotSupportedException {
	if(direccion== null) {
		
		throw new	NullPointerException("ERROR: La dirección no puede ser nula.");
			
		}
	if(pasos>=1) {
		
		try {
			
			switch(direccion) {
			
			
			case IZQUIERDA:
				if (color == Color.NEGRO) {
					setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() + pasos)));
				} else {
					setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() - pasos)));
					
				}
				break;
			case DERECHA:
				if (color == Color.NEGRO) {
					setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() - pasos)));
				} else {
					setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() + pasos)));
					
				}
				break;
			case ARRIBA:
				if (color == Color.BLANCO) {
					setPosicion(new Posicion(posicion.getFila() + pasos, posicion.getColumna()));
				} else {
					setPosicion(new Posicion(posicion.getFila() - pasos, posicion.getColumna()));
				}
				break;
			case ABAJO:
				if (color == Color.BLANCO) {
					setPosicion(new Posicion(posicion.getFila() - pasos, posicion.getColumna()));
				} else {
					setPosicion(new Posicion(posicion.getFila() + pasos, posicion.getColumna()));
				}
				break;
			}
			
		}
		catch(IllegalArgumentException  e){
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		}
		
	}
	else {
		throw new IllegalArgumentException("ERROR: El número de pasos debe ser positivo.");
	}
	

	
	
}

}
