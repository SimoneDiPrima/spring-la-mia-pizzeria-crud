package org.pizzeria.italy.demo;
import java.util.List;

import org.pizzeria.italy.demo.pojo.Pizza;
import org.pizzeria.italy.demo.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner{
	@Autowired
	private PizzaService pizzaService;
	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Pizza p1 = new Pizza("Margherita","una rotonda sul mare il nostro disco che suona",5);
		Pizza p2 = new Pizza("Romana", "la piu antica di tutte",7);
		Pizza p3 = new Pizza("Salsiccia e funghi", "la preferita dagli alpini", 9);
		Pizza p4 = new Pizza("Filomena", "la piu formaggiosa di sempre",9);
		
		pizzaService.save(p1);
		pizzaService.save(p2);
		pizzaService.save(p3);
		pizzaService.save(p4);
		
		// LETTURA
		
		List<Pizza> pizze = pizzaService.findAll();
		System.out.println(pizze);
		
	}

}
