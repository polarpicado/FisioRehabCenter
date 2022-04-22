package com.FisioRehabCenter.Proyecto.modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FisioRehabCenter.Proyecto.modelo.dao.IDetalleboletaDAO;
import com.FisioRehabCenter.Proyecto.modelo.entity.Detalleboleta;
@Service
public class DetalleboletaServicioImplement implements IDetalleboletaServicio{
	@Autowired
	private IDetalleboletaDAO detalleboletaDAO;
	
	@Override
	public List<Detalleboleta> getAllDetalleboletas() {
		// TODO Auto-generated method stub
		return (List<Detalleboleta>)detalleboletaDAO.findAll();
	}

	@Override
	public void guardar(Detalleboleta detalle_boleta) {
		detalleboletaDAO.save(detalle_boleta);
		
	}

	@Override
	public void eliminarDetalleboleta(Long id) {
		detalleboletaDAO.deleteById(id);
		
	}

}
