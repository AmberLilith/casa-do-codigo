package br.com.amber.casadocodigo.controllers;

import br.com.amber.casadocodigo.dtos.CategoriaDto;
import br.com.amber.casadocodigo.entidades.Categoria;
import br.com.amber.casadocodigo.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService service;

    @PostMapping("cadastrar")
    public ResponseEntity<Categoria> register(@RequestBody CategoriaDto categoriaDto){
        Categoria categoria = categoriaDto.converter();
        service.save(categoria);
        return ResponseEntity.ok(categoria);
    }
}
