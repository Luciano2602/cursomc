package com.luciano.rumojr.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//a linha abaixo é uma diretiva do spring boot
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Rest está funcionando !";
	}
}
