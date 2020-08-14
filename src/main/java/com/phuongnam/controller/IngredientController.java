package com.phuongnam.controller;


import com.phuongnam.model.Ingredient;
import com.phuongnam.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class IngredientController {


	@Autowired
	private IngredientService ingredientService;

	@GetMapping
	public String showAddForm(Model model) {
		model.addAttribute("ingredient", new Ingredient());
		return "addIngredient";
	}

	@PostMapping("/ingredient/add")
	public String addIngredient(Ingredient ingredient, Model model) {
	  ingredientService.save(ingredient);
	  model.addAttribute(ingredient);
	  return "addIngredientSuccess";
	}
}