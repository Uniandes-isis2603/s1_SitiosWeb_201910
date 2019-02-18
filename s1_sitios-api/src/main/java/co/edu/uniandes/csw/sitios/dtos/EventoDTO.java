/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.sitios.dtos;

import co.edu.uniandes.csw.sitios.entities.EventoEntity;
import java.io.Serializable;
import java.util.Date;

/**
 * EventoDTO implementa Serializable
 * @author estudiante
 */
public class EventoDTO implements Serializable{
    
    //-------------------------------------
    // Atributos---------------------------
    //-------------------------------------
    
    /**
     * fecha en la que sucede el evento.
     * fecha != null.
     */
    private Date fecha;
    
    /**
     * Descripcion de lo que paso en la bitacora
     */
    private String descripcion;

    /**
     * Constructor EventoDTO vacio
     */
    public EventoDTO() {
    }

    /**
     * Constructor que se usa para checkear la entidad
     * del DTO
     * @param entity != null
     */
    public EventoDTO( EventoEntity entity ){
        if(entity != null) {
            this.descripcion = entity.getDescripcion();
        }
    }
    
    /**
     * Chequeo de la implementacion toEntity del DTO
     * @return EventoEntity
     */
    public EventoEntity toEntity() {
        EventoEntity entity = new EventoEntity();
        entity.setDescripcion(this.descripcion);
        entity.setFecha(this.fecha);
        return entity;
    }
    
    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
