package com.FisioRehabCenter.Proyecto.modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FisioRehabCenter.Proyecto.modelo.dao.IFisiteorapiaDAO;
import com.FisioRehabCenter.Proyecto.modelo.entity.Fisioterapia;
@Service
public class FisioterapiaServicioImplement implements IFisioterapiaServicio{
	@Autowired
	private IFisiteorapiaDAO fisioterapiaDAO;

	@Override
	public List<Fisioterapia> getAllFisioterapias() {
		return (List<Fisioterapia>)fisioterapiaDAO.findAll();
	}

	@Override
	public void guardar(Fisioterapia fisioterapia) {
		fisioterapiaDAO.save(fisioterapia);
	}

	@Override
	public void eliminarFisioterapia(Long id) {
		fisioterapiaDAO.deleteById(id);
	}

}
