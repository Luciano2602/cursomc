package com.luciano.rumojr.repositories;

//import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luciano.rumojr.domain.Categoria;

//@Repository <- essa notacao spring boot
//JpaRepository =  tipo especial do spring de acessar os dados conforme vc passa
//na categoria, passamos o id, no caso integer

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>  {

}
//CategoriaRepository <- ele mapeia a categoria que está no parametro, fazendo as operacoes de CRUD