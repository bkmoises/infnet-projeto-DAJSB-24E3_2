package br.edu.infnet.AppMoisesAndrade.model.service;

import br.edu.infnet.AppMoisesAndrade.model.domain.Filme;
import br.edu.infnet.AppMoisesAndrade.model.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public void incluir(Filme filme) {
        try {
            filmeRepository.save(filme);
        } catch (Exception e) {
            System.err.println("[ERRO] " + e.getMessage());
        }
    }

    public Iterable<Filme> obterLista(){
        return filmeRepository.findAll();
    }

    public Filme obterPorId(Integer id) {
        return filmeRepository.findById(id).orElse(null);
    }

    public void  remover(Integer id) {
        filmeRepository.deleteById(id);
    }

    public Long obterQtd() {
        return filmeRepository.count();
    }
}
