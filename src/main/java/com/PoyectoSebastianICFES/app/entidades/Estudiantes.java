package com.PoyectoSebastianICFES.app.entidades;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "estudiantes")
public class Estudiantes {

    @Id
    private String id;
    private String tipoDocumento;
    private String numeroDocumento;
    private String primerApellido;
    private String segundoApellido;
    private String primerNombre;
    private String segundoNombre;
    private String correoElectronico;
    private String numeroTelefonico;
    private String numeroRegistro;
    private Double puntaje;
    private Double saberProPuntajeNivel;
    private String aprobadoReprobadoUTS;
    private Double comunicacionEscrita;
    private Double razonamientoCuantitativo;
    private Double lecturaCritica;
    private Double lecturaCriticaNivel;
    private Double competenciasCiudadanas;
    private Double ingles;
    private Double formulacionProyectosIngenieria;
    private Double pensamientoCientificoMatematicasEstadistica;
    private Double disenoSoftware;
    private Double nivelIngles;

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public Double getSaberProPuntajeNivel() {
        return saberProPuntajeNivel;
    }

    public void setSaberProPuntajeNivel(Double saberProPuntajeNivel) {
        this.saberProPuntajeNivel = saberProPuntajeNivel;
    }

    public String getAprobadoReprobadoUTS() {
        return aprobadoReprobadoUTS;
    }

    public void setAprobadoReprobadoUTS(String aprobadoReprobadoUTS) {
        this.aprobadoReprobadoUTS = aprobadoReprobadoUTS;
    }

    public Double getComunicacionEscrita() {
        return comunicacionEscrita;
    }

    public void setComunicacionEscrita(Double comunicacionEscrita) {
        this.comunicacionEscrita = comunicacionEscrita;
    }

    public Double getRazonamientoCuantitativo() {
        return razonamientoCuantitativo;
    }

    public void setRazonamientoCuantitativo(Double razonamientoCuantitativo) {
        this.razonamientoCuantitativo = razonamientoCuantitativo;
    }

    public Double getLecturaCritica() {
        return lecturaCritica;
    }

    public void setLecturaCritica(Double lecturaCritica) {
        this.lecturaCritica = lecturaCritica;
    }

    public Double getLecturaCriticaNivel() {
        return lecturaCriticaNivel;
    }

    public void setLecturaCriticaNivel(Double lecturaCriticaNivel) {
        this.lecturaCriticaNivel = lecturaCriticaNivel;
    }

    public Double getCompetenciasCiudadanas() {
        return competenciasCiudadanas;
    }

    public void setCompetenciasCiudadanas(Double competenciasCiudadanas) {
        this.competenciasCiudadanas = competenciasCiudadanas;
    }

    public Double getIngles() {
        return ingles;
    }

    public void setIngles(Double ingles) {
        this.ingles = ingles;
    }

    public Double getFormulacionProyectosIngenieria() {
        return formulacionProyectosIngenieria;
    }

    public void setFormulacionProyectosIngenieria(Double formulacionProyectosIngenieria) {
        this.formulacionProyectosIngenieria = formulacionProyectosIngenieria;
    }

    public Double getPensamientoCientificoMatematicasEstadistica() {
        return pensamientoCientificoMatematicasEstadistica;
    }

    public void setPensamientoCientificoMatematicasEstadistica(Double pensamientoCientificoMatematicasEstadistica) {
        this.pensamientoCientificoMatematicasEstadistica = pensamientoCientificoMatematicasEstadistica;
    }

    public Double getDisenoSoftware() {
        return disenoSoftware;
    }

    public void setDisenoSoftware(Double disenoSoftware) {
        this.disenoSoftware = disenoSoftware;
    }

    public Double getNivelIngles() {
        return nivelIngles;
    }

    public void setNivelIngles(Double nivelIngles) {
        this.nivelIngles = nivelIngles;
    }
}
