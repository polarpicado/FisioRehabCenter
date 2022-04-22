package com.FisioRehabCenter.Proyecto.modelo.servicio;

import java.util.List;
import com.FisioRehabCenter.Proyecto.modelo.entity.Cliente;


public interface IClienteServicio {
	public void guardar(Cliente cliente);
	public List<Cliente> getAllClientes();
	public void eliminarCliente(Long id);
}
