package com.luciano.rumojr.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luciano.rumojr.domain.Categoria;
import com.luciano.rumojr.repositories.CategoriaRepository;

//a linha abaixo é uma notacao spring boot
@Service
public class CategoriaService {
	
	@Autowired //para instanciar a class, usando spring é só usar a notação @Autowired, que a variavel repo já é instanciada
	private CategoriaRepository repo; //declarando uma dependencia da class Repositore
	
	public Categoria buscar(Integer id) {
		
		//a linha a baixo faz uma consulta e retorna o objeto conforme o id
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.get();
	}

}
