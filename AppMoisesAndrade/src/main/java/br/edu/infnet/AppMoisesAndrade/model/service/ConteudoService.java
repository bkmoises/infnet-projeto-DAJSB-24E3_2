package br.edu.infnet.AppMoisesAndrade.model.service;

import br.edu.infnet.AppMoisesAndrade.model.domain.Conteudo;
import br.edu.infnet.AppMoisesAndrade.model.repository.ConteudoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConteudoService {

    @Autowired
    private ConteudoRepository conteudoRepository;

    public Iterable<Conteudo> obterLista(){
        return conteudoRepository.findAll();
    }

    public Long obterQtd() {
        return conteudoRepository.count();
    }
}
