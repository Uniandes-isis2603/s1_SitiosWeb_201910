/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.sitios.resources;

import co.edu.uniandes.csw.sitios.dtos.DependenciaDTO;
import co.edu.uniandes.csw.sitios.dtos.DependenciaDetailDTO;
import co.edu.uniandes.csw.sitios.ejb.DependenciaLogic;
import co.edu.uniandes.csw.sitios.entities.DependenciaEntity;
import co.edu.uniandes.csw.sitios.exceptions.BusinessLogicException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;

/**
 *
 * @author estudiante
 */
@Path("dependencies")
@Produces("application/json")
@Consumes("application/json")
@RequestScoped
public class DependenciaResource {
    
    
    
    public final static Logger LOGGER = Logger.getLogger(DependenciaResource.class.getName());
    
    @Inject
    private DependenciaLogic dependenciaLogic; 
    
    
        
    /**
     * Crea una Dependencia mediante una peticion POST
     * @param dependencia != null, Dependencia a crear
     * @return Retorna el DependenciaDTO creado
     */
    @POST
    public DependenciaDTO createDependencia(DependenciaDTO dependencia) throws BusinessLogicException {
        LOGGER.log(Level.INFO, "DependenciaResource createDependencia: input: {0}", dependencia);
        DependenciaDTO dependenciaDTO = new DependenciaDTO(dependenciaLogic.createDependency(dependencia.toEntity()));
        LOGGER.log(Level.INFO, "DependenciaResource createDependencia: output: {0}", dependenciaDTO);
        return dependenciaDTO;
    }
    
     /**
     * Permite dar un Dependencia segun su Id.
     * @param id : Numero entero, id con
     * el cual se identifica una Dependencia
     * @return DependenciaDTO. 
     */
    @GET
    @Path("{id: \\d+}")
    public DependenciaDTO getDependencia( @PathParam("id") Long id ){
        DependenciaEntity entity = dependenciaLogic.getDependency(id);
        if(entity == null) {
            throw new WebApplicationException("Dependencia with id: " + id + " does not exists", 404);
        }
        DependenciaDetailDTO detailDTO = new DependenciaDetailDTO(entity);
        LOGGER.log(Level.INFO, "DependenciaResource getDependencia: output: {0}", detailDTO);
        return detailDTO;
    }
    
    /**
     * Actualiza un Dependencia dado un id,
     * y se cambia por el administrador del parametro.
     * @param id del Dependencia que se actualizara
     * @param dependencia
     * @return Dependencia actualizado.
     */
    @PUT
    @Path("{id: \\d+}")
    public DependenciaDetailDTO updateDependency(@PathParam("id") Long id, DependenciaDetailDTO dependencia) throws BusinessLogicException { 
        LOGGER.log(Level.INFO, "DependenciaResource updateDependency: input: id: {0} , dependencia: {1}", new Object[]{id, dependencia}); 
        dependencia.setId(id); 
        if (dependenciaLogic.getDependency(id) == null) { 
            throw new WebApplicationException("El recurso /dependencies/" + id + " no existe.", 404); 
        } 
        DependenciaDetailDTO detailDTO = new DependenciaDetailDTO(dependenciaLogic.updateDependency(id, dependencia.toEntity())); 
        LOGGER.log(Level.INFO, "DependenciaResource updateDependency: output: {0}", detailDTO); 
        return detailDTO; 
    } 
    
    /**
     * Elimina la dependencia siempre que no se
     * requieran de sus servicios.
     * @param id, identificador del admin
     */
    @DELETE
        @Path("{id: \\d+}")
    public void deleteDependency(@PathParam("id") Long id) throws BusinessLogicException { 
        LOGGER.log(Level.INFO, "DependenciaResource deleteDependency: input: {0}", id); 
        if (dependenciaLogic.getDependency(id) == null) { 
            throw new WebApplicationException("El recurso /dependencies/" + id + " no existe.", 404); 
        } 
        dependenciaLogic.deleteDependency(id); 
        LOGGER.info("DependenciaResource deleteDependency: output: void"); 
    } 
    
}
