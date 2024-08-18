package br.edu.infnet.AppMoisesAndrade.controller;

import br.edu.infnet.AppMoisesAndrade.model.domain.Serie;
import br.edu.infnet.AppMoisesAndrade.model.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SerieController {

    @Autowired
    private SerieService serieService;

    @GetMapping(value = "/serie")
    public Iterable<Serie> listarTodos() {
        return serieService.obterLista();
    }

    @GetMapping(value = "/serie/{id}")
    public Serie obterPorId(@PathVariable Integer id) {
        return serieService.obterPorId(id);
    }

    @PostMapping(value = "/serie")
    public Serie incluir(@RequestBody Serie serie) {
        serieService.incluir(serie);
        return serie;
    }

    @DeleteMapping(value = "/serie/{id}")
    public String remover(@PathVariable Integer id) {
        serieService.remover(id);
        return "Elemento id \"" + id + "\" foi removido com sucesso!";
    }
}
