package br.com.amber.casadocodigo.dtos;

import br.com.amber.casadocodigo.entidades.Categoria;

public class CategoriaDto {

    private String nome;

    public CategoriaDto() {
    }

    public Categoria converter(){
        return new Categoria(this.nome);
    }

    public String getNome() {
        return nome;
    }
}
