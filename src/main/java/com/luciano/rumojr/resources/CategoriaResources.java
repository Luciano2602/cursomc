package com.luciano.rumojr.resources;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luciano.rumojr.domain.Categoria;
import com.luciano.rumojr.services.CategoriaService;

//a linha abaixo é uma diretiva do spring boot
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	//a anotacao a baixo, nstancia automaticamente
	@Autowired
	private CategoriaService service;
	
	//avisa o Rest que vai 2 parametros, /categoria/id	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		//a linha a cima, a anotacao @PathVariable avisa que usaremos parametro e do tipo Integer
		//o tipo ResponseEntity encapsula diversas informacoes que vem do http o parametro <?> indica que pode ser qlq coisa
		
		
		//esse método esta na class categoriaService
		Categoria obj = service.buscar(id);
		
		//se estiver ok, ele retorno como corpo a categoria que esta navariavel obj
		return ResponseEntity.ok().body(obj);
	}
}
