package br.com.amber.casadocodigo.entidades;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String titulo;
    @NotNull
    @Length(max = 500)
    private String resumo;
    private String sumario;
    @NotNull
    @DecimalMin("20")
    private Double preco;
    @NotNull
    @Size(min = 100)
    private Integer numeroDePaginas;
    @NotNull
    private String isbn;
    private LocalDateTime dataPublicacao;
    @NotNull
    private Long idCategoria;
    @NotNull
    private Long idAutor;
}
