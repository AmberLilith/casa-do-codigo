package br.com.amber.casadocodigo.entidades;

import org.hibernate.validator.constraints.Length;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class Autor {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotNull
    private String nome;
    @NotNull
    @Email
    private String email;
    @NotNull
    @Length(max = 400)
    private String descricao;
    private final LocalDateTime dataRegistro = LocalDateTime.now();
}
