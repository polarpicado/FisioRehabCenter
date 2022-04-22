package com.FisioRehabCenter.Proyecto.modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FisioRehabCenter.Proyecto.modelo.dao.IClienteDAO;
import com.FisioRehabCenter.Proyecto.modelo.entity.Cliente;
@Service
public class ClienteServicioImplement implements IClienteServicio {

	@Autowired
	private IClienteDAO clienteDAO;
	
	@Override
	public void guardar(Cliente cliente) {
		clienteDAO.save(cliente);
	}

	@Override
	public List<Cliente> getAllClientes() {
		
		return (List<Cliente>)clienteDAO.findAll();
	}

	@Override
	public void eliminarCliente(Long id) {
		clienteDAO.deleteById(id);
	}

}
