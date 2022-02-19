package br.com.amber.casadocodigo.dtos;

import br.com.amber.casadocodigo.entidades.Autor;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class AutorDto {

    private String nome;
    private String email;
    private String descricao;
    private LocalDateTime dataRegistro;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public AutorDto() {
    }

    public Autor converter(){
        return new Autor(this.nome, this.email, this.descricao);
    }

    @Override
    public String toString() {
        return "AutorDto{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataRegistro=" + dataRegistro +
                '}';
    }
}
