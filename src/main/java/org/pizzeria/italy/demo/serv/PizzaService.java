package org.pizzeria.italy.demo.serv;

import java.util.List;
import java.util.Optional;

import org.pizzeria.italy.demo.pojo.Pizza;
import org.pizzeria.italy.demo.repo.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PizzaService {
	
	@Autowired
	private PizzaRepo pizzaRepo;
	public void save(Pizza pizza) {
		pizzaRepo.save(pizza);
		
	}
	
	public List<Pizza> findAll(){
		return pizzaRepo.findAll();
	}
	public Optional<Pizza> findBookById(int id) {
		
		return pizzaRepo.findById(id);
	}

	
}
