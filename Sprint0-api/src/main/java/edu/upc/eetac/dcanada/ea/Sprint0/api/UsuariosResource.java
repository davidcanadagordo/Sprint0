package edu.upc.eetac.dcanada.ea.Sprint0.api;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.upc.eetac.dcanada.ea.Sprint0.api.model.Usuario;
import edu.upc.eetac.dcanada.ea.Sprint0.api.model.UsuarioCollection;

@Path("/usuarios")
public class UsuariosResource {
	
	Manager mimanager = new ManagerImpl();
	
	@POST
	@Consumes(MediaType.SPRINT0_API_USER)
	@Produces(MediaType.SPRINT0_API_USER)
	public Usuario CrearUsuario(Usuario usuario) {
		mimanager.CrearUsuario(usuario);

		return usuario;
	}
	
	@GET
	@Produces(MediaType.SPRINT0_API_USER_COLLECTION)
	public UsuarioCollection getUsuario() {
		UsuarioCollection users = mimanager.getUsuario();

		return users;
	}
	
}
