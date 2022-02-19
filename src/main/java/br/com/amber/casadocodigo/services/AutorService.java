package br.com.amber.casadocodigo.services;

import br.com.amber.casadocodigo.entidades.Autor;
import br.com.amber.casadocodigo.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    @Autowired
    private  AutorRepository repository;

    public Autor save(Autor autor){
        return repository.save(autor);
    }
}
