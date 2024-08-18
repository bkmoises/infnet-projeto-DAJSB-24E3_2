package br.edu.infnet.AppMoisesAndrade.model.repository;

import br.edu.infnet.AppMoisesAndrade.model.domain.Serie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends CrudRepository<Serie, Integer> {

}