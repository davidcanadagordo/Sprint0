package edu.upc.eetac.dcanada.ea.Sprint0.api.model;

import java.util.HashMap;

public class UsuarioCollection {

	private HashMap <String, Usuario> usuarios;
	
	public UsuarioCollection() {
		super();
		usuarios = new HashMap<String, Usuario>(); //vamos añadiendo
		
	}
	
	public HashMap<String, Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(HashMap<String, Usuario> usuarios) {
		this.usuarios = usuarios;
	}


	

}
