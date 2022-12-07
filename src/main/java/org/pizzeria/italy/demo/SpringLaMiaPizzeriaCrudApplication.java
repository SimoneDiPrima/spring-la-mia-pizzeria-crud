package org.pizzeria.italy.demo;

import org.pizzeria.italy.demo.pojo.Pizza;
import org.pizzeria.italy.demo.pojo.Drink;
import org.pizzeria.italy.demo.serv.DrinkService;
import org.pizzeria.italy.demo.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner{
	@Autowired
	private PizzaService P;
	@Autowired
	private DrinkService ds;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Pizza p1 = new Pizza("Margherita","una rotonda sul mare il nostro disco che suona",5);
		Pizza p2 = new Pizza("Romana", "la piu antica di tutte",7);
		Pizza p3 = new Pizza("Salsiccia e funghi", "la preferita dagli alpini", 9);
		Pizza p4 = new Pizza("Filomena", "la piu formaggiosa di sempre",9);
		
		P.save(p1);
		P.save(p2);
		P.save(p3);
		P.save(p4);
		
		Drink d1 = new Drink("coca","colaaaaaa",9);
		Drink d2 = new Drink("fanta","e vedi che ti mangi",9);
		Drink d3 = new Drink("sprite","Gente di mare",5);
		Drink d4 = new Drink("peroncino","la birra bevuta dai campioni",3);
		Drink d5 = new Drink("Gin Tonic"," dai che è venerdiiii",7);
		
		
		ds.save(d1);
		ds.save(d2);
		ds.save(d3);
		ds.save(d4);
		ds.save(d5);
		
		
	}

}
