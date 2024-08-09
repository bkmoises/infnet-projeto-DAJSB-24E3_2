package br.edu.infnet.AppMoisesAndrade.model.service;

import br.edu.infnet.AppMoisesAndrade.model.domain.Avaliacao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AvaliacaoService {
    private Map<Integer, Avaliacao> mapa = new HashMap<Integer, Avaliacao>();
    private Integer id = 0;

    public void incluir(Avaliacao avaliacao) {
        avaliacao.setId(id++);
        mapa.put(avaliacao.getId(), avaliacao);
    }

    public Collection<Avaliacao> obterLista(){
        return mapa.values();
    }

}
