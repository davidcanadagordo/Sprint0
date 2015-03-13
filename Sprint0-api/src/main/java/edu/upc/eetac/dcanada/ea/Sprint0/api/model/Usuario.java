package edu.upc.eetac.dcanada.ea.Sprint0.api.model;

public class Usuario {

	private String nombre;
	private String pass;
	private int idusuario;
	private MensajeCollection mensajes;
	
	public MensajeCollection getMensajes() {
		return mensajes;
	}

	public void setMensajes(MensajeCollection mensajes) {
		this.mensajes = mensajes;
	}

	public Usuario(){
		super();
		mensajes = new MensajeCollection();
	}
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
