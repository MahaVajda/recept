package sk.maha.recept.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import sk.maha.recept.model.Recipe;
import sk.maha.recept.repositories.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService{
	
	private RecipeRepository recipeRepository;

	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}

	@Override
	public Set<Recipe> getRecipe() {
		Set<Recipe> recipeSet = new HashSet();
		
		recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		return recipeSet;
	}

}
