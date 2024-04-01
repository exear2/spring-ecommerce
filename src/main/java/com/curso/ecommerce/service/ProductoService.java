package com.curso.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.curso.ecommerce.model.Producto;

public interface ProductoService {

	public Producto save(Producto producto); //guardar

	public Optional<Producto> get(Integer id); //obtener 1 solo producto

	public void update(Producto producto); //actualizar 1 producto

	public void delete(Integer Id); //borrar producto
	
	public List<Producto> findAll();

}
