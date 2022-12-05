package org.pizzeria.italy.demo.controller;

import java.util.List;

import org.pizzeria.italy.demo.pojo.Pizza;
import org.pizzeria.italy.demo.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

