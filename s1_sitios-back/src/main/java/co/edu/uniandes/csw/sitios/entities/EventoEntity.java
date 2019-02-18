/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.sitios.entities;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author estudiante
 */
@Entity
public class EventoEntity extends BaseEntity {
    
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
    public EventoEntity() {
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