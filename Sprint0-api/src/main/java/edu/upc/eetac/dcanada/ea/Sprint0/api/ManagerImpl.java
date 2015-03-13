package edu.upc.eetac.dcanada.ea.Sprint0.api;


import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

import edu.upc.eetac.dcanada.ea.Sprint0.api.model.Mensaje;
import edu.upc.eetac.dcanada.ea.Sprint0.api.model.MensajeCollection;
import edu.upc.eetac.dcanada.ea.Sprint0.api.model.Usuario;
import edu.upc.eetac.dcanada.ea.Sprint0.api.model.UsuarioCollection;

public class ManagerImpl implements Manager {
	
	private static ManagerImpl instance = null;

	public static ManagerImpl getInstance() {
		return instance;
	}

	public static void setInstance(ManagerImpl instance) {
		ManagerImpl.instance = instance;
	}
	
	public ManagerImpl(){
		super(); 
		
	}

	@Override
	public Usuario CrearUsuario(Usuario usuario) {
		
		if (usuarios.getUsuarios().containsKey(usuario.getNombre())) {
			throw new WebApplicationException("Usuario hecho",Status.CONFLICT);
		} else {
			usuarios.getUsuarios().put(usuario.getNombre(), usuario);
		}

		return usuario;
	}
	

	@Override
	public UsuarioCollection getUsuario() {
		
		return usuarios;
	}

	
	@Override
	public Usuario UpdateUsuario(String nombre, Usuario usuario) {
		if (!usuarios.getUsuarios().containsKey(nombre)) {
			throw new WebApplicationException("Este usuario es desconocido",
					Status.CONFLICT);
		}

		usuarios.getUsuarios().remove(nombre); 		 //eliminamos
		usuarios.getUsuarios().put(nombre, usuario); //actualizamos
		return usuarios.getUsuarios().get(nombre);   //devolvemos actualizado
	}



	@Override
	public void BorrarUser(String nombre) {
		if (!usuarios.getUsuarios().containsKey(nombre)) {
			throw new WebApplicationException("Usuario hecho",Status.CONFLICT);
		} else {
			usuarios.getUsuarios().remove(nombre);
		}
	}

		
	@Override
	public Mensaje CrearMensaje(String nombre, Mensaje mensaje) {
		if (!usuarios.getUsuarios().containsKey(nombre)) {
			throw new WebApplicationException("Este usuario es desconocido", Status.CONFLICT);
		} else {
			usuarios.getUsuarios().get(nombre).getMensajes().getMensaje()
			.put(mensaje.getIdmensaje(), mensaje); //put
		}

		return mensaje;
	}
	

	@Override
	public MensajeCollection getMessagesByUser(String nombre) {
		
		return usuarios.getUsuarios().get(nombre).getMensajes();
	}

	@Override
	public Mensaje UpdateMensaje(String nombre, int idmensaje, Mensaje mensaje) {
		
		if (!usuarios.getUsuarios().get(nombre).getMensajes().getMensaje().containsKey(mensaje.getIdmensaje())) {
			throw new WebApplicationException("Este comentario es desconocido",
					Status.CONFLICT);
		}

		usuarios.getUsuarios().get(nombre).getMensajes().getMensaje().remove(nombre);
		usuarios.getUsuarios().get(nombre).getMensajes().getMensaje().put(mensaje.getIdmensaje(), mensaje);

		return usuarios.getUsuarios().get(nombre).getMensajes().getMensaje().get(mensaje.getIdmensaje());
	}

	@Override
	public void BorrarMensaje(String nombre, int idmensaje) {
		
		if (!usuarios.getUsuarios().containsKey(nombre)) {
			throw new WebApplicationException("Este usuario es desconocido",
					Status.CONFLICT);
		} else if (!usuarios.getUsuarios().get(nombre).getMensajes().getMensaje()
				.containsKey(idmensaje)) {
			throw new WebApplicationException(
					"Este usuario no tiene este comentario", Status.CONFLICT);
		} else {
			usuarios.getUsuarios().get(nombre).getMensajes().getMensaje().remove(idmensaje);
		}
	}
	

}
