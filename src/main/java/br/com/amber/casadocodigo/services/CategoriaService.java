package br.com.amber.casadocodigo.services;

import br.com.amber.casadocodigo.entidades.Categoria;
import br.com.amber.casadocodigo.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria save(Categoria categoria){
       return repository.save(categoria);
    }

}
