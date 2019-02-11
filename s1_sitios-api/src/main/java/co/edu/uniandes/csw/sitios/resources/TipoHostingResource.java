/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.sitios.resources;

import co.edu.uniandes.csw.sitios.dtos.TipoHostingDTO;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


/**
 *
 * @author s.ballesteros
 */

@Path("hostings")
@Produces("application/json")
@Consumes("application/json")
@RequestScoped
public class TipoHostingResource {
    
    private static final Logger LOGGER = Logger.getLogger(TipoHostingResource.class.getName());

    @POST
    public TipoHostingDTO createTipoHosting(TipoHostingDTO hostings){
        return hostings;
    }
}