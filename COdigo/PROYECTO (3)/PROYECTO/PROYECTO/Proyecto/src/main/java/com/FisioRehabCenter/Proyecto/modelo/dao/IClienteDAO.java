package com.FisioRehabCenter.Proyecto.modelo.dao;

import org.springframework.data.repository.CrudRepository;

import com.FisioRehabCenter.Proyecto.modelo.entity.Cliente;

public interface IClienteDAO extends CrudRepository<Cliente, Long>{

}
