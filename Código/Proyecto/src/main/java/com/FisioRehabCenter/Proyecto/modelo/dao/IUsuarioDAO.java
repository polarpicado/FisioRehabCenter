package com.FisioRehabCenter.Proyecto.modelo.dao;

import org.springframework.data.repository.CrudRepository;

import com.FisioRehabCenter.Proyecto.modelo.entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
	
}
