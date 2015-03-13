package edu.upc.eetac.dcanada.ea.Sprint0.api.model;

import java.util.HashMap;

public class MensajeCollection {

	private HashMap<Integer, Mensaje> mensajes;
	
	public MensajeCollection() {
		super();
		mensajes = new HashMap<Integer, Mensaje>();
	}

	public HashMap<Integer, Mensaje> getMensaje() {
		return mensajes;
	}

	public void setMensaje(HashMap<Integer, Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	
}
