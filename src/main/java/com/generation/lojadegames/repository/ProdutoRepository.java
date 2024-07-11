package com.generation.lojadegames.repository;

import com.generation.lojadegames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List<Produto> findAllByNomeContainingIgnoreCase (@Param("Nome") String nome);

}
