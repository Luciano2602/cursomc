package com.luciano.rumojr.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luciano.rumojr.domain.Categoria;

//a linha abaixo é uma diretiva do spring boot
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1,"Informatica");
		Categoria cat2 = new Categoria(2,"Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		
		lista.add(cat1);
		lista.add(cat2);
		
		
		return lista;
	}
}
