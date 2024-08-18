package br.edu.infnet.AppMoisesAndrade.model.repository;

import br.edu.infnet.AppMoisesAndrade.model.domain.Filme;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends CrudRepository<Filme, Integer> {

}