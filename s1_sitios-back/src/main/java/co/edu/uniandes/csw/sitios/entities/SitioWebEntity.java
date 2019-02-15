/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.sitios.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class SitioWebEntity extends BaseEntity implements Serializable{
    
    
    /**
	 * nombre del sitio web
         * nomre != "" && nombre !=null
	 */
	private String nombre;

	/**
	 * descripcion del sitio
         */
	private String descripcion;

	/**
	 * proposito del sitio
	 */
	
	private String proposito;

	/**
	 * audiencia esperada del sitio web
	 */
	private long audienciaEsperada;

	/**
	 * fecha de publicacion del sitio web
	 */
	private Date fechaLanzamiento;

	/**
	 * Categoria a la cual pertenece el sitio
	 */
	private Categoria categoriaSitio;

	/**
	 * ruta a la imagen representativa del sitio
	 */
	
	private String imagen;

	/**
	 * estado actual del sitio web
	 */
	
	private EstadoWebEntity EstadoActual;

	/**
	 * historial completo de estados que ha tenido este sitio
	 */
	private List<EstadoWebEntity> historialDeEstados;

	/**
	 * Lugar donde se encuentra desplegado el sitio web
	 */
	private PlataformaDeDespliegueEntity plataformaDeDespliegue;

	/**
	 * Tecnologias usadas en el desarrollo del sitio
	 */
	private List<TecnologiaEntity> tecnologiasDeDesarrollo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public long getAudienciaEsperada() {
        return audienciaEsperada;
    }

    public void setAudienciaEsperada(long audienciaEsperada) {
        this.audienciaEsperada = audienciaEsperada;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Categoria getCategoriaSitio() {
        return categoriaSitio;
    }

    public void setCategoriaSitio(Categoria categoriaSitio) {
        this.categoriaSitio = categoriaSitio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public EstadoWebEntity getEstadoActual() {
        return EstadoActual;
    }

    public void setEstadoActual(EstadoWebEntity EstadoActual) {
        this.EstadoActual = EstadoActual;
    }

    public List<EstadoWebEntity> getHistorialDeEstados() {
        return historialDeEstados;
    }

    public void setHistorialDeEstados(List<EstadoWebEntity> historialDeEstados) {
        this.historialDeEstados = historialDeEstados;
    }

    public PlataformaDeDespliegueEntity getPlataformaDeDespliegue() {
        return plataformaDeDespliegue;
    }

    public void setPlataformaDeDespliegue(PlataformaDeDespliegueEntity plataformaDeDespliegue) {
        this.plataformaDeDespliegue = plataformaDeDespliegue;
    }

    public List<TecnologiaEntity> getTecnologiasDeDesarrollo() {
        return tecnologiasDeDesarrollo;
    }

    public void setTecnologiasDeDesarrollo(List<TecnologiaEntity> tecnologiasDeDesarrollo) {
        this.tecnologiasDeDesarrollo = tecnologiasDeDesarrollo;
    }

    public List<AdministradorEntity> getSolicitantes() {
        return solicitantes;
    }

    public void setSolicitantes(List<AdministradorEntity> solicitantes) {
        this.solicitantes = solicitantes;
    }

    public List<SitioWebEntity> getSitiosRelacionados() {
        return sitiosRelacionados;
    }

    public void setSitiosRelacionados(List<SitioWebEntity> sitiosRelacionados) {
        this.sitiosRelacionados = sitiosRelacionados;
    }

    public List<AdministradorEntity> getSoportes() {
        return soportes;
    }

    public void setSoportes(List<AdministradorEntity> soportes) {
        this.soportes = soportes;
    }

    public AdministradorEntity getResponsable() {
        return responsable;
    }

    public void setResponsable(AdministradorEntity responsable) {
        this.responsable = responsable;
    }

	/**
	 * Personas que solicitaron el sitio web
	 */
	private List<AdministradorEntity> solicitantes;

	/**
	 * Sitios web que estan asociados a este
	 */
	private List<SitioWebEntity> sitiosRelacionados;

	/**
	 * Personas encargadas del soporte del sitio
	 */
	private List<AdministradorEntity> soportes;

	/**
	 * Responsable del sitio web
	 */
	private AdministradorEntity responsable;
    
        /**
         * Categoria que puede tener un sitio web
         */
        public enum Categoria
        {
            Administrativo,
            Informativo,
            Academico,
            Otros
        }
        
    
    
}