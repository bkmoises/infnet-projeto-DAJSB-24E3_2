package br.edu.infnet.AppMoisesAndrade.model.service;

import br.edu.infnet.AppMoisesAndrade.model.domain.Serie;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class SerieService {
    private Map<Integer, Serie> mapa = new HashMap<Integer, Serie>();
    private Integer id = 0;

    public void incluir(Serie serie) {
        serie.setId(id++);
        mapa.put(serie.getId(), serie);
    }

    public Collection<Serie> obterLista(){
        return mapa.values();
    }

}
