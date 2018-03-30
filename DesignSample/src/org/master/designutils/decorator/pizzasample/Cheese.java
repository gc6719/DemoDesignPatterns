package org.master.designutils.decorator.pizzasample;

public class Cheese extends PizzaToppings {

	public Cheese(Pizza pizza) {
		 this.pizza = pizza ;
	}

	@Override
	public String description() {
		 
		return pizza.description()+ " Cheese";
	}

	@Override
	public Double cost() {
		 
		return pizza.cost()+ 2.5;
	}

}
