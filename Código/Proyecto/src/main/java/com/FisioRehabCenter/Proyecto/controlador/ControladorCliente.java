package com.FisioRehabCenter.Proyecto.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.FisioRehabCenter.Proyecto.modelo.entity.Cliente;
import com.FisioRehabCenter.Proyecto.modelo.servicio.IClienteServicio;

@Controller
@RequestMapping("/cliente")
public class ControladorCliente {
	@Autowired
	private IClienteServicio clienteServicio;
	
	@RequestMapping("/")
	public String inicio(Model model){
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		model.addAttribute("listClientes", clienteServicio.getAllClientes());
		
		return "cliente/clientes";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(Cliente cliente) {
		clienteServicio.guardar(cliente);
		return "redirect:/cliente/";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value= "id" )Long id) {
		clienteServicio.eliminarCliente(id);
		return "redirect:/cliente/";
	}
}
