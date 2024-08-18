package br.edu.infnet.AppMoisesAndrade.model.service;

import br.edu.infnet.AppMoisesAndrade.model.domain.Serie;
import br.edu.infnet.AppMoisesAndrade.model.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieService {
    @Autowired
    private SerieRepository serieRepository;

    public void incluir(Serie serie) {
        serieRepository.save(serie);
    }

    public Iterable<Serie> obterLista(){
        return serieRepository.findAll();
    }

    public Serie obterPorId(Integer id) {
        return serieRepository.findById(id).orElse(null);
    }

    public void  remover(Integer id) {
        serieRepository.deleteById(id);
    }

    public Long obterQtd() {
        return serieRepository.count();
    }
}
