package com.FisioRehabCenter.Proyecto.modelo.servicio;

import java.util.List;

import com.FisioRehabCenter.Proyecto.modelo.entity.Boleta;

public interface IBoletaServicio {
	List<Boleta> getAllBoletas();
	public void guardar(Boleta boleta);
	public void eliminarBoleta(Long id);
}
