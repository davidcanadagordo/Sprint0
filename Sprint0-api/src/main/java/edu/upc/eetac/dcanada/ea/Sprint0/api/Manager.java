package edu.upc.eetac.dcanada.ea.Sprint0.api;


import edu.upc.eetac.dcanada.ea.Sprint0.api.model.Mensaje; 
import edu.upc.eetac.dcanada.ea.Sprint0.api.model.MensajeCollection;
import edu.upc.eetac.dcanada.ea.Sprint0.api.model.Usuario;
import edu.upc.eetac.dcanada.ea.Sprint0.api.model.UsuarioCollection;

public interface Manager {

	public UsuarioCollection usuarios = new UsuarioCollection();
	
	//metodos CRUD Usuario
	
	public Usuario CrearUsuario (Usuario usuario);
	public UsuarioCollection getUsuario();
	public Usuario UpdateUsuario (String nombre, Usuario usuario);
	public void BorrarUser(String nombre);

	
	//metodos CRUD mensajes
	
	public Mensaje CrearMensaje(String nombre, Mensaje mensaje );
	public MensajeCollection getMessagesByUser(String nombre);
	public Mensaje UpdateMensaje(String nombre, int idmensaje, Mensaje mensaje);
	public void BorrarMensaje(String nombre, int idmensaje);
}
