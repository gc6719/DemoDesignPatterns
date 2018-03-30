package org.master.designutils.decorator.pizzasample;

public class Onions extends PizzaToppings {

	public Onions(Pizza pizza) {
		 this.pizza = pizza ;
	}

	@Override
	public String description() {
		 
		return pizza.description()+ " Onions";
	}

	@Override
	public Double cost() {
		 
		return pizza.cost()+ 1.5;
	}

}
