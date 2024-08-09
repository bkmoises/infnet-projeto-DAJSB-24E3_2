package br.edu.infnet.AppMoisesAndrade.controller;

import br.edu.infnet.AppMoisesAndrade.model.domain.Filme;
import br.edu.infnet.AppMoisesAndrade.model.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping(value = "/filme")
    public Collection<Filme> listarTodos() {
        return filmeService.obterLista();
    }
}
