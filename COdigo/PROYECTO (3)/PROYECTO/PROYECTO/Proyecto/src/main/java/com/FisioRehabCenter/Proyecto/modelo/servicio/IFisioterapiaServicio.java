package com.FisioRehabCenter.Proyecto.modelo.servicio;

import java.util.List;

import com.FisioRehabCenter.Proyecto.modelo.entity.Fisioterapia;

public interface IFisioterapiaServicio {
	List<Fisioterapia> getAllFisioterapias();
	public void guardar(Fisioterapia fisioterapia);
	public void eliminarFisioterapia(Long id);
}
