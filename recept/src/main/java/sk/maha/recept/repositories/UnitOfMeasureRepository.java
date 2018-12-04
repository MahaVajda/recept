package sk.maha.recept.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import sk.maha.recept.model.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
	
	Optional<UnitOfMeasure> findByDescription(String description);
}
