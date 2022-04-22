package com.FisioRehabCenter.Proyecto.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.FisioRehabCenter.Proyecto.modelo.entity.Empleado;
import com.FisioRehabCenter.Proyecto.modelo.servicio.IEmpleadoServicio;

@Controller
@RequestMapping("/empleado")
public class ControladorEmpleado {
	@Autowired
	private IEmpleadoServicio empleadoservicio;
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Empleado empleado = new Empleado();
		model.addAttribute("empleado", empleado);
		model.addAttribute("listEmpleados", empleadoservicio.getAllEmpleados());
		return "empleado/empleados";
	}
	
	@RequestMapping(value = "/form" , method = RequestMethod.POST)
	public String guardar(Empleado empleado) {
		empleadoservicio.guardar(empleado);
		return "redirect:/empleado/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		empleadoservicio.eliminarEmpleado(id);
		return "redirect:/empleado/";
	}

}