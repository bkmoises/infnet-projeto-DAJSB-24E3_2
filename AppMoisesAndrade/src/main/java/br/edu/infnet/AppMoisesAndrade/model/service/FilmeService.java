package br.edu.infnet.AppMoisesAndrade.model.service;

import br.edu.infnet.AppMoisesAndrade.model.domain.Filme;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class FilmeService {
    private Map<Integer, Filme> mapa = new HashMap<Integer, Filme>();
    private Integer id = 0;

    public void incluir(Filme filme) {
        filme.setId(id++);
        mapa.put(filme.getId(), filme);
    }

    public Collection<Filme> obterLista(){
        return mapa.values();
    }

}
