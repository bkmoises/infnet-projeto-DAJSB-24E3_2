package br.edu.infnet.AppMoisesAndrade.model.repository;

import br.edu.infnet.AppMoisesAndrade.model.domain.Conteudo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConteudoRepository extends CrudRepository<Conteudo, Integer> {

}