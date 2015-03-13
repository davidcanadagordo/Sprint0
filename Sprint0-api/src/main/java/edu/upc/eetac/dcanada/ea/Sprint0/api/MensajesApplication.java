package edu.upc.eetac.dcanada.ea.Sprint0.api;

import org.glassfish.jersey.linking.DeclarativeLinkingFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class MensajesApplication extends ResourceConfig{

	public MensajesApplication()  {
		super();
		register(DeclarativeLinkingFeature.class);
	}
}
