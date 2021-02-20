package com.jugadores.afa.spring.afa.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Transactional
@Table(name="equipo")
@JsonIgnoreProperties("historias")
public class Equipo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Integer id;

    @Column(name = "cuit", unique = true)
    private Integer cuit;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_fundacion")
    private LocalDate fechaFundacion;

    @Column(name = "nombre_presidente")
    private String nombrePresidente;

    @Column(name = "apellido_presidente")
    private String apellidoPresidente;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "calle")
    private String calle;

    @Column(name = "localidad")
    private String localidad;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "telefono")
    private Integer telefono;

    @Column(name = "fecha_inicio_primera_division")
    private LocalDate fechaInicioPrimeraDivision;

    @Column(name = "fecha_fin_primera_division")
    private LocalDate fechaFinPrimeraDivision;

    @Column(name = "categoria_actual")
    private String categoriaActual;

    @OneToMany(mappedBy="equipo", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Historia> historias;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    public String getApellidoPresidente() {
        return apellidoPresidente;
    }

    public void setApellidoPresidente(String apellidoPresidente) {
        this.apellidoPresidente = apellidoPresidente;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaInicioPrimeraDivision() {
        return fechaInicioPrimeraDivision;
    }

    public void setFechaInicioPrimeraDivision(LocalDate fechaInicioPrimeraDivision) {
        this.fechaInicioPrimeraDivision = fechaInicioPrimeraDivision;
    }

    public LocalDate getFechaFinPrimeraDivision() {
        return fechaFinPrimeraDivision;
    }

    public void setFechaFinPrimeraDivision(LocalDate fechaFinPrimeraDivision) {
        this.fechaFinPrimeraDivision = fechaFinPrimeraDivision;
    }

    public String getCategoriaActual() {
        return categoriaActual;
    }

    public void setCategoriaActual(String categoriaActual) {
        this.categoriaActual = categoriaActual;
    }

    public List<Historia> getHistorias() {
        return historias;
    }

    public void setHistorias(List<Historia> historias) {
        this.historias = historias;
    }

    private static final long serialVersionUID = 1L;
}
