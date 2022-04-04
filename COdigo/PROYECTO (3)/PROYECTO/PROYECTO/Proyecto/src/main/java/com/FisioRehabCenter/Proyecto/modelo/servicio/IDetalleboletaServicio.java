package com.FisioRehabCenter.Proyecto.modelo.servicio;

import java.util.List;

import com.FisioRehabCenter.Proyecto.modelo.entity.Detalleboleta;

public interface IDetalleboletaServicio {
	List<Detalleboleta> getAllDetalleboletas();
	public void guardar(Detalleboleta detalle_boleta);
	public void eliminarDetalleboleta(Long id);
}
