package com.generation.lojadegames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;


@Entity
@Table(name = "tb_produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank (message = "Nome é Obrigatório!")
    @Size(min =5, max =255, message = "O atributo nome deve conter no mínimo 05 e no máximo 255 caracteres!")
    private String nome;

    @NotBlank (message = "A Descrição é Obrigatório")
    @Size(min = 10, max = 255, message = "O atributo descrição deve conter no minimo 10 e no máximo 255 caracteres!")
    private String descricao;

    @NotBlank (message = "O Preço é Obrigatorio")
    private Float preco;

    @NotBlank (message = "A Categoria é Obrigatorio")
    @Size(min = 10, max = 255, message = "O atributo categoria deve conter no minimo 10 e no maximo 255 caracteres!")
    private String categoria;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "produto", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("produto")
    private List<Categoria> categorias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void  setNome() {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao() {
        this.descricao = descricao;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco() {
        this.preco = preco;
    }


    public Produto getCategoria() {
        return null;
    }
}

