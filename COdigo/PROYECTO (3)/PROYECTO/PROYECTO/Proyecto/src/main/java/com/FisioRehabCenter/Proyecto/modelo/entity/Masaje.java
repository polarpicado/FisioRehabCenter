package com.FisioRehabCenter.Proyecto.modelo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="masaje")
public class Masaje implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	@Column(name="nom_ter")
	private String nombre;
	@Column(name="duracion_ter")
	private Integer duracion;
	@Column(name="costo_ter")
	private Float costo;
	@ManyToOne
	@JoinColumn(name = "id_terapia")
	Fisioterapia fisioterapia;
	
	public Fisioterapia getFisioterapia() {
		return fisioterapia;
	}
	public void setFisioterapia(Fisioterapia fisioterapia) {
		this.fisioterapia = fisioterapia;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public Float getCosto() {
		return costo;
	}
	public void setCosto(Float costo) {
		this.costo = costo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	
}
