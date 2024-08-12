package br.edu.infnet.AppMoisesAndrade.controller;

import br.edu.infnet.AppMoisesAndrade.model.domain.Avaliacao;
import br.edu.infnet.AppMoisesAndrade.model.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @GetMapping(value = "/avaliacao")
    public Collection<Avaliacao> listarTodos() {
        return avaliacaoService.obterLista();
    }

    @GetMapping(value = "/avaliacao/{id}")
    public Avaliacao obterPorId(@PathVariable Integer id) {
        return avaliacaoService.obterPorId(id);
    }

    @PostMapping(value = "/avaliacao")
    public Avaliacao incluir(@RequestBody Avaliacao avaliacao) {
        avaliacaoService.incluir(avaliacao);
        return avaliacao;
    }

    @DeleteMapping(value = "/avaliacao/{id}")
    public String remover(@PathVariable Integer id) {
        avaliacaoService.remover(id);
        return "Elemento id \"" + id + "\" foi removido com sucesso!";
    }
}
