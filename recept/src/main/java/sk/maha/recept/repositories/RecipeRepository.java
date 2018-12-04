package sk.maha.recept.repositories;

import org.springframework.data.repository.CrudRepository;

import sk.maha.recept.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
	

}
