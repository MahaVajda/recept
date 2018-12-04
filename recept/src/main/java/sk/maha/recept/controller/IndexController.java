package sk.maha.recept.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sk.maha.recept.model.Category;
import sk.maha.recept.model.UnitOfMeasure;
import sk.maha.recept.repositories.CategoryRepository;
import sk.maha.recept.repositories.UnitOfMeasureRepository;
import sk.maha.recept.services.RecipeService;

@Controller
public class IndexController {
	
	private final RecipeService recipeService;

	public IndexController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}

	@RequestMapping({"","/","/index"})
	public String getIndexPage(Model model) {
	
		model.addAttribute("recipes", recipeService.getRecipe());
		return "index";
	}
}
