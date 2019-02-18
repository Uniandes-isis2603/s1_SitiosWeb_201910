/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.sitios.entities;

import javax.persistence.Entity;

/**
 *
 * @author estudiante
 */
@Entity //Le damos el superpoder de que pueda persistir
public class DependenciaEntity extends BaseEntity {
    
    /**
     * nombre de la dependencia.
     */
    private String nombreDependencia;
    
    /**
     * email de la dependencia
     */
    private String email;
    
    /**
     * telefono de la dependencia
     */
    private int telefono;

    /**
     * @return the nombreDependencia
     */
    public String getNombreDependencia() {
        return nombreDependencia;
    }

    /**
     * @param nombreDependencia the nombreDependencia to set
     */
    public void setNombreDependencia(String nombreDependencia) {
        this.nombreDependencia = nombreDependencia;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
