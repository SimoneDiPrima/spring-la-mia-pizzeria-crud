package org.pizzeria.italy.demo.repo;

import org.pizzeria.italy.demo.pojo.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepo extends JpaRepository<Pizza, Integer> {

	
}
