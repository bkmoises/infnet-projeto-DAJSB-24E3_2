package br.edu.infnet.AppMoisesAndrade.controller;

import br.edu.infnet.AppMoisesAndrade.model.domain.Avaliacao;
import br.edu.infnet.AppMoisesAndrade.model.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @GetMapping(value = "/avaliacao")
    public Collection<Avaliacao> listarTodos() {
        return avaliacaoService.obterLista();
    }
}
