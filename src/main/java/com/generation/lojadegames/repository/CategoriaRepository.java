package com.generation.lojadegames.repository;

import com.generation.lojadegames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    static List<Categoria> findAllByTipoContainingIgnoreCase(String tipo) {
        return List.of();
    }

    public List<Categoria> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
}
