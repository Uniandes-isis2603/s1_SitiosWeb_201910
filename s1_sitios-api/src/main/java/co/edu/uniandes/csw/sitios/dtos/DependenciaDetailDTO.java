/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.sitios.dtos;
import co.edu.uniandes.csw.sitios.entities.AdministradorEntity;
import co.edu.uniandes.csw.sitios.entities.DependenciaEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author estudiante
 */

public class DependenciaDetailDTO extends DependenciaDTO implements Serializable {

    private List<AdministradorDTO> admins;

    public DependenciaDetailDTO() {
        super();
        

    }

    /**
     * Crea un objeto DependenciaDetailDTO a partir de un objeto
     * DependenciaEntity incluyendo los atributos de DependenciaDTO.
     *
     * @param dependenciaEntity Entidad DependenciaEntity desde la cual se va
     * a crear el nuevo objeto.
     *
     */
    public DependenciaDetailDTO(DependenciaEntity dependenciaEntity) {
        super(dependenciaEntity);
        if (dependenciaEntity.getEncargadosDependencia()!= null) 
        {
            admins = new ArrayList<>();
            for (AdministradorEntity adminEntity : dependenciaEntity.getEncargadosDependencia()) 
            {
                admins.add(new AdministradorDTO(adminEntity));
            }
        }
    }

    /**
     * Convierte un objeto DependenciaDetailDTO a DependenciaEntity incluyendo
     * los atributos de DependenciaDTO.
     *
     * @return Nuevo objeto DependenciaEntity.
     *
     */
    @Override
    public DependenciaEntity toEntity() {
        DependenciaEntity entity = super.toEntity();
         if (admins != null) 
        {
            List<AdministradorEntity> adminEntity = new ArrayList<>();
            for (AdministradorDTO dtoAdmin : getAdmins())
            {
                adminEntity.add(dtoAdmin.toEntity());
            }
            entity.setEncargadosDependencia(adminEntity);
        }
        return entity;
    }

    /**
     * Devuelve el Administrador asociado a la dependencia
     *
     * @return DTO del adminsistrador
     */
    public List<AdministradorDTO> getAdmins () {
        return admins;
    }

    /**
     * Modifica el adminsistrador asociado a esta dependencia.
     *
     * @param admins los adminsistradores por asociar.
     */
    public void setAdmins(List<AdministradorDTO> admins) {
        this.admins = admins;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}

