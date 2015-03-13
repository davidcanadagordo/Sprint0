package edu.upc.eetac.dcanada.ea.Sprint0.api;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.core.Response;

import edu.upc.eetac.dcanada.ea.Sprint0.api.model.Sprint0Error;

public class WebApplicationExceptionMapper implements ExceptionMapper<WebApplicationException> {
	
	@Override
	public Response toResponse(WebApplicationException exception) {
		Sprint0Error error = new Sprint0Error(exception.getResponse().getStatus(), exception.getMessage());
	return Response.status(error.getStatus()).entity(error)
			.type(MediaType.SPRINT0_API_ERROR).build();
	}

	}