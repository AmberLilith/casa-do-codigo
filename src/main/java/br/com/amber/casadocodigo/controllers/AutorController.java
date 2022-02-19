package br.com.amber.casadocodigo.controllers;

import br.com.amber.casadocodigo.dtos.AutorDto;
import br.com.amber.casadocodigo.entidades.Autor;
import br.com.amber.casadocodigo.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<Autor> salvar(@RequestBody AutorDto autorDto){
        System.out.println(autorDto.toString());
        Autor autor = autorDto.converter();
        service.save(autor);
        return ResponseEntity.ok().body(autor);
    }
}
