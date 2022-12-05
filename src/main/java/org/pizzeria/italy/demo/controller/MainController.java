package org.pizzeria.italy.demo.controller;

import java.util.List;
import java.util.Optional;

import org.pizzeria.italy.demo.pojo.Pizza;
import org.pizzeria.italy.demo.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class MainController {
	
	@Autowired
	private PizzaService pizzaService;
	
	@GetMapping
	public String getPizza(Model model) {
	List<Pizza> pizze = pizzaService.findAll();
	model.addAttribute("pizza",pizze);
	return "pizze";
	}
	@GetMapping("/pizza/{id}")
	public String getBook(@PathVariable("id") int id, Model model) {
		
		Optional<Pizza> optPizza = pizzaService.findBookById(id);
		
		if (optPizza.isEmpty()) {
			
			System.err.println("La pizza non presente con id: " + id);
		}
		
		Pizza pizza = optPizza.get();
		
		model.addAttribute("pizza", pizza);
		
		return "pizza";
	}
	
	@GetMapping("/pizza/create")
	public String createBook(Model model) {
		
		Pizza book = new Pizza();
		model.addAttribute("book", book);
		
		return "pizza-create";
	}
	@PostMapping("/pizza/create")
	public String storePizza(@Valid @ModelAttribute("pizza") Pizza pizza) {
		
		pizzaService.save(pizza);
		
		return "redirect:/";
	}
	
}


