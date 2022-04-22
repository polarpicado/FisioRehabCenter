package com.FisioRehabCenter.Proyecto.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.FisioRehabCenter.Proyecto.modelo.entity.Fisioterapia;
import com.FisioRehabCenter.Proyecto.modelo.servicio.IFisioterapiaServicio;

@Controller
@RequestMapping("/fisioterapia")
public class ControladorFisioterapias {
	@Autowired
	private IFisioterapiaServicio fisioterapiaServicio;
	
	@RequestMapping("/")
	public String inicio(Model model){
		Fisioterapia fisioterapia = new Fisioterapia();
		model.addAttribute("fisioterapia", fisioterapia);
		model.addAttribute("listFisioterapias", fisioterapiaServicio.getAllFisioterapias());
		return "fisioterapia/fisioterapias";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(Fisioterapia fisioterapiaDAO) {
		fisioterapiaServicio.guardar(fisioterapiaDAO);
		return "redirect:/fisioterapia/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value= "id" )Long id) {
		fisioterapiaServicio.eliminarFisioterapia(id);
		return "redirect:/fisioterapia/";
	}
}
