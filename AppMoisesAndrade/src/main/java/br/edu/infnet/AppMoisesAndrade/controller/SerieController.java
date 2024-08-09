package br.edu.infnet.AppMoisesAndrade.controller;

import br.edu.infnet.AppMoisesAndrade.model.domain.Serie;
import br.edu.infnet.AppMoisesAndrade.model.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class SerieController {

    @Autowired
    private SerieService serieService;

    @GetMapping(value = "/serie")
    public Collection<Serie> listarTodos() {
        return serieService.obterLista();
    }
}
