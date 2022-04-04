package com.FisioRehabCenter.Proyecto.modelo.servicio;

import java.util.List;

import com.FisioRehabCenter.Proyecto.modelo.entity.Empleado;


public interface IEmpleadoServicio {
	public void guardar(Empleado empleado);
	public List<Empleado> getAllEmpleados();
	public void eliminarEmpleado(Long id);
}
