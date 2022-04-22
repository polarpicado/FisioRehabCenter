package com.FisioRehabCenter.Proyecto.modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FisioRehabCenter.Proyecto.modelo.dao.IMasajeDAO;
import com.FisioRehabCenter.Proyecto.modelo.entity.Masaje;

@Service
public class MasajeServicioImplement implements IMasajeServicio {
	
	@Autowired
	private IMasajeDAO terapiaDAO;

	@Override
	public void guardar(Masaje terapia) {
		terapiaDAO.save(terapia);
	}

	@Override
	public List<Masaje> getAllTerapias() {
		
		return (List<Masaje>)terapiaDAO.findAll();
	}
	
	@Override
	public void eliminarTerapia(Long id) {
		terapiaDAO.deleteById(id);
	}
	

	

}
