package com.FisioRehabCenter.Proyecto.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.FisioRehabCenter.Proyecto.modelo.entity.Detalleboleta;
import com.FisioRehabCenter.Proyecto.modelo.servicio.IDetalleboletaServicio;

@Controller
@RequestMapping("/detalleboleta")
public class ControladorDetalleboleta {
	@Autowired
	private IDetalleboletaServicio detalleboletaServicio;
	
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Detalleboleta detalleboleta = new Detalleboleta();
		model.addAttribute("detalleboleta", detalleboleta);
		model.addAttribute("listDetalleboletas", detalleboletaServicio.getAllDetalleboletas());
		return "detalle_boleta/detalle_boletas";
	}
	
	@RequestMapping(value = "/form" , method = RequestMethod.POST)
	public String guardar(Detalleboleta detalleboleta) {
		detalleboletaServicio.guardar(detalleboleta);
		return "redirect:/detalleboleta/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		detalleboletaServicio.eliminarDetalleboleta(id);
		return "redirect:/detalleboleta/";
	}

}