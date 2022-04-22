package com.FisioRehabCenter.Proyecto.modelo.servicio;

import java.util.List;

import com.FisioRehabCenter.Proyecto.modelo.entity.Masaje;

public interface IMasajeServicio {
	public void guardar(Masaje terapia);
	public List<Masaje> getAllTerapias();
	public void eliminarTerapia(Long id);
}
