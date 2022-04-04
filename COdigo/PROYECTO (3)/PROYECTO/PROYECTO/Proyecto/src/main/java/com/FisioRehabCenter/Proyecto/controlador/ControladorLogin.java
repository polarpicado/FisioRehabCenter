package com.FisioRehabCenter.Proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorLogin {
	
	@RequestMapping("/")
	public String inicio() {
		return "principal/index";
	}
}
