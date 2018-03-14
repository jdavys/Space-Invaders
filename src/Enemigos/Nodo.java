package Enemigos;

public class Nodo {
	private Object dato;
	private Nodo nodo;
	
	public Nodo(){
		dato = null;
		Nodo nodo = null;
	}
	public Nodo(Object dato) {
		this();
		this.dato = dato;
	}
	public void setDato(Object dato) {
		this.dato = dato;
	}
	public Object getDato() {
		return dato;
	}
	public void setNodo(Nodo nodo) {
		this.nodo = nodo;
	}
	public Nodo getNodo() {
		return nodo;
	}
	}

