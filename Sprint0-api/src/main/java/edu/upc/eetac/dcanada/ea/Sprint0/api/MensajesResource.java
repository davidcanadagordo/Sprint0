package edu.upc.eetac.dcanada.ea.Sprint0.api;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.upc.eetac.dcanada.ea.Sprint0.api.model.Mensaje;
import edu.upc.eetac.dcanada.ea.Sprint0.api.model.MensajeCollection;
import edu.upc.eetac.dcanada.ea.Sprint0.api.model.Usuario;

@Path("/mensajes")
public class MensajesResource {
	
	Manager mimanager = new ManagerImpl();
 
/*
	@POST
	@Path("/{nombre}")
	@Consumes(MediaType.SPRINT0_API_NOTAS)
	@Produces(MediaType.SPRINT0_API_NOTAS)
	public Mensaje CrearMensaje(@PathParam("nombre") String nombre, Mensaje mensaje) {
		mimanager.CrearMensaje(nombre, mensaje);

		return mensaje;
	}

	@PUT
	@Path("/{nombre}/{idmensaje}")
	@Consumes(MediaType.SPRINT0_API_NOTAS)
	@Produces(MediaType.SPRINT0_API_NOTAS)
	public Mensaje UpdateMensaje(@PathParam("nombre") String nombre, @PathParam("idmensaje") int idmensaje, Mensaje mensaje) {
		Mensaje mensaje1 = mimanager.UpdateMensaje(nombre, idmensaje, mensaje);

		return mensaje1;
	}
*/
	@GET
	@Path("/{nombre}")
	@Produces(MediaType.SPRINT0_API_NOTAS_COLLECTION)
	public MensajeCollection getMessagesByUser(@PathParam("nombre") String nombre) {
		MensajeCollection messages = mimanager.getMessagesByUser(nombre);

		return messages;
	}
/*
	@DELETE
	@Path("/{nombre}/{idmensaje}")
	public void BorrarMensaje(@PathParam("nombre") String nombre, @PathParam("idmensaje") int idmensaje) {
		mimanager.BorrarMensaje(nombre, idmensaje);
	}

	*/
}
