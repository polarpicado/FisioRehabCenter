package com.FisioRehabCenter.Proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/principal")
public class ControladorPrincipal {
	@RequestMapping("/")
	public String inicio() {
		return "principal/index";
	}

}
