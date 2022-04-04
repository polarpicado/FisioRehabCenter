package com.FisioRehabCenter.Proyecto.modelo.dao;

import org.springframework.data.repository.CrudRepository;

import com.FisioRehabCenter.Proyecto.modelo.entity.Empleado;

public interface IEmpleadoDAO extends CrudRepository<Empleado, Long> {

}
