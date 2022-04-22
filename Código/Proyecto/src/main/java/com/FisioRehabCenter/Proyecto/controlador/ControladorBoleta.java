package com.FisioRehabCenter.Proyecto.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.FisioRehabCenter.Proyecto.modelo.entity.Boleta;
import com.FisioRehabCenter.Proyecto.modelo.servicio.IBoletaServicio;


@Controller
@RequestMapping("/boleta")
public class ControladorBoleta {
	@Autowired
	private IBoletaServicio boletaServicio;
	
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Boleta boleta = new Boleta();
		model.addAttribute("boleta", boleta);
		model.addAttribute("listBoletas", boletaServicio.getAllBoletas());
		return "boleta/boletas";
	}
	
	@RequestMapping(value = "/form" , method = RequestMethod.POST)
	public String guardar(Boleta boleta) {
		boletaServicio.guardar(boleta);
		return "redirect:/boleta/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		boletaServicio.eliminarBoleta(id);
		return "redirect:/boleta/";
	}

}