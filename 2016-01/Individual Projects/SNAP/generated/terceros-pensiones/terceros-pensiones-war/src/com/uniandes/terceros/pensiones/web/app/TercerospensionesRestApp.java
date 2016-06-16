package com.uniandes.terceros.pensiones.web.app;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import com.uniandes.terceros.pensiones.web.rest.ConsultarTerceroRestService;

@ApplicationPath("rest")
public class TercerospensionesRestApp extends Application {

	private Set<Class<?>> resources = new HashSet<Class<?>>();
	
	@Override
	public Set<Class<?>> getClasses(){
		return resources;
	}
	
	public  TercerospensionesRestApp(){
		resources.add(ConsultarTerceroRestService.class);
	}
	
	
	
}
