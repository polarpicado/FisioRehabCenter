package com.FisioRehabCenter.Proyecto.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import com.FisioRehabCenter.Proyecto.modelo.entity.Masaje;
import com.FisioRehabCenter.Proyecto.modelo.servicio.IFisioterapiaServicio;
import com.FisioRehabCenter.Proyecto.modelo.servicio.IMasajeServicio;

@Controller
@RequestMapping("/Masaje")
public class ControladorMasaje {
	@Autowired
	private IMasajeServicio Masajeservicio;
	@Autowired
	private IFisioterapiaServicio fisioservis;
	@RequestMapping("/")
	public String inicio(Model model) {
		Masaje terapia = new Masaje();
		model.addAttribute("terapia", terapia);
		model.addAttribute("listTerapias", Masajeservicio.getAllTerapias());
		model.addAttribute("listFisioterapias", fisioservis.getAllFisioterapias());
		return "Masaje/Masajes";
	}
	
	@RequestMapping(value = "/form" , method = RequestMethod.POST)
	public String guardar(Masaje terapia) {
		Masajeservicio.guardar(terapia);
		return "redirect:/Masaje/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		Masajeservicio.eliminarTerapia(id);
		return "redirect:/Masaje/";
	}

}