/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.sitios.resources;

import co.edu.uniandes.csw.sitios.dtos.PlataformaDeDespliegueDTO;
import co.edu.uniandes.csw.sitios.dtos.PlataformaDeDespliegueDetailDTO;
import co.edu.uniandes.csw.sitios.ejb.PlataformaDeDespliegueLogic;
import co.edu.uniandes.csw.sitios.entities.PlataformaDeDespliegueEntity;
import co.edu.uniandes.csw.sitios.exceptions.BusinessLogicException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;

/**
 *
 * @author s.ballesteros
 */

@Path("platforms")
@Produces("application/json")
@Consumes("application/json")
@RequestScoped
public class PlataformaDeDespliegueResource {
    
    private static final Logger LOGGER = Logger.getLogger(PlataformaDeDespliegueResource.class.getName());
    
    @Inject
    private PlataformaDeDespliegueLogic plataformaLogic;
    
    @POST
    public PlataformaDeDespliegueDTO createPlataformaDeDespliegue(PlataformaDeDespliegueDTO plataformaDto)throws BusinessLogicException{
        
       PlataformaDeDespliegueEntity plataformaEntity = plataformaDto.toEntity();
       plataformaEntity = plataformaLogic.createPlataformaDeDespliegue(plataformaEntity);
        
        return plataformaDto;
    }
    
    
    @GET
    @Path("{plataformasId: \\d+}")
    public PlataformaDeDespliegueDTO getPlataforma(@PathParam("plataformasId") Long plataformaId) throws  BusinessLogicException
    {
        LOGGER.log(Level.INFO, "PlataformaDeDespliegueResource getPlataforma: input: {0}", plataformaId);
        PlataformaDeDespliegueEntity entity = plataformaLogic.getPlataformaDeDespliegue(plataformaId);
        PlataformaDeDespliegueDTO platDTO= new PlataformaDeDespliegueDTO(entity);
        return  platDTO;
    }

    
    @GET
    public List<PlataformaDeDespliegueDetailDTO> getPlataformas() {
        LOGGER.info("EditorialResource getEditorials: input: void");
        List<PlataformaDeDespliegueDetailDTO> listaEditoriales = listEntity2DetailDTO(plataformaLogic.getPlataformas());
        LOGGER.log(Level.INFO, "EditorialResource getEditorials: output: {0}", listaEditoriales);
        return listaEditoriales;
    }
    

    @Path("{plataformasId: \\d+}/websites")
    public Class<SitioWebTecnologiaResourse> getPlataformaSitioWebResourse(@PathParam("plataformasId") Long sitesId) throws  BusinessLogicException {
        if (plataformaLogic.getPlataformaDeDespliegue(sitesId) == null) {
            throw new WebApplicationException("El recurso /websites/" + sitesId + " no existe.", 404);
        }
        return SitioWebTecnologiaResourse.class;
    }
    
    
    
    @DELETE
    @Path("{organizationsId: \\d+}")
    public void deleteOrganization(@PathParam("organizationsId") Long organizationsId) throws BusinessLogicException {
        LOGGER.log(Level.INFO, "OrganizationResource deleteOrganization: input: {0}", organizationsId);
        if (plataformaLogic.getPlataformaDeDespliegue(organizationsId) == null) {
            throw new WebApplicationException("El recurso /organizations/" + organizationsId + " no existe.", 404);
        }
        plataformaLogic.deleteOrganization(organizationsId);
        LOGGER.info("OrganizationResource deleteOrganization: output: void");
    }

    private List<PlataformaDeDespliegueDetailDTO> listEntity2DetailDTO(List<PlataformaDeDespliegueEntity> entityList) {
        List<PlataformaDeDespliegueDetailDTO> list = new ArrayList<>();
        for (PlataformaDeDespliegueEntity entity : entityList) {
            list.add(new PlataformaDeDespliegueDetailDTO(entity));
        }
        return list;
    }
    
}
