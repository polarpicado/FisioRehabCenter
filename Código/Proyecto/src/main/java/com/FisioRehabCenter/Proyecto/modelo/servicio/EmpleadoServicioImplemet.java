package com.FisioRehabCenter.Proyecto.modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FisioRehabCenter.Proyecto.modelo.dao.IEmpleadoDAO;
import com.FisioRehabCenter.Proyecto.modelo.entity.Empleado;
@Service
public class EmpleadoServicioImplemet implements IEmpleadoServicio {

	@Autowired
	private IEmpleadoDAO empleadoDAO;

	@Override
	public void guardar(Empleado empleado) {
		empleadoDAO.save(empleado);
	}

	@Override
	public List<Empleado> getAllEmpleados() {
		return (List<Empleado>)empleadoDAO.findAll();
	}

	@Override
	public void eliminarEmpleado(Long id) {
		empleadoDAO.deleteById(id);
	}
		


}
