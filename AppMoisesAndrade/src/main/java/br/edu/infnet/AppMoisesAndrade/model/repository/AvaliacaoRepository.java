package br.edu.infnet.AppMoisesAndrade.model.repository;

import br.edu.infnet.AppMoisesAndrade.model.domain.Avaliacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends CrudRepository<Avaliacao, Integer> {

}