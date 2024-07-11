package com.generation.lojadegames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria_games" )
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank (message = "tipo é Obrigatório!")
    @Size(min =5, max =255, message = "O atributo tipo deve conter no mínimo 05 e no máximo 255 caracteres!")
    private String tipo;

    @ManyToOne
    @JsonIgnoreProperties("categoria")
    private Produto produto;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(){
        this.tipo = tipo;
    }

}
