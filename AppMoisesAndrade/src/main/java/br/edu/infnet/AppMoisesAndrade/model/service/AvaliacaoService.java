package br.edu.infnet.AppMoisesAndrade.model.service;

import br.edu.infnet.AppMoisesAndrade.model.domain.Avaliacao;
import br.edu.infnet.AppMoisesAndrade.model.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public void incluir(Avaliacao avaliacao) {
        avaliacaoRepository.save(avaliacao);
    }

    public Iterable<Avaliacao> obterLista(){
        return avaliacaoRepository.findAll();
    }

    public Avaliacao obterPorId(Integer id) {
        return avaliacaoRepository.findById(id).orElse(null);
    }

    public void  remover(Integer id) {
        avaliacaoRepository.deleteById(id);
    }

    public long obterQtd() {
        return avaliacaoRepository.count();
    }
}
