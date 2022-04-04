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
@Table(name="detalle_boleta")
public class Detalleboleta implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_boleta")
	Boleta boleta;
	@ManyToOne
	@JoinColumn(name = "id_masaje")
	Masaje masaje;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Masaje getMasaje() {
		return masaje;
	}
	public void setMasaje(Masaje masaje) {
		this.masaje = masaje;
	}
	public Boleta getBoleta() {
		return boleta;
	}
	public void setBoleta(Boleta boleta) {
		this.boleta = boleta;
	}
	
	
	
	
}
