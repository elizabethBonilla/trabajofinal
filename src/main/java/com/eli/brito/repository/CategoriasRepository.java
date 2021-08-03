package com.eli.brito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eli.brito.model.Categoria;

public interface CategoriasRepository extends  JpaRepository<Categoria, Integer> {

}
