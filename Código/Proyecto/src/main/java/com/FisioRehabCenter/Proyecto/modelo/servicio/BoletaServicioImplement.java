package com.FisioRehabCenter.Proyecto.modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FisioRehabCenter.Proyecto.modelo.dao.IBoletaDAO;
import com.FisioRehabCenter.Proyecto.modelo.entity.Boleta;
@Service
public class BoletaServicioImplement implements IBoletaServicio{
	@Autowired
	private IBoletaDAO boletaDAO;
	
	@Override
	public List<Boleta> getAllBoletas() {
		
		return (List<Boleta>)boletaDAO.findAll();
	}

	@Override
	public void guardar(Boleta boleta) {
		boletaDAO.save(boleta);
		
	}

	@Override
	public void eliminarBoleta(Long id) {
		boletaDAO.deleteById(id);
		
	}

}
