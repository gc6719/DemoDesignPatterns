package org.master.designutils.decorator;

import org.master.designutils.decorator.pizzasample.Cheese;
import org.master.designutils.decorator.pizzasample.Onions;
import org.master.designutils.decorator.pizzasample.PanPizza;
import org.master.designutils.decorator.pizzasample.Pizza;
import org.master.designutils.decorator.pizzasample.Tomatoes;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		 Pizza pizza = new PanPizza();
		 pizza = new Tomatoes(pizza);
		 pizza = new Onions(pizza);
		 pizza = new Cheese(pizza);
		 System.out.println("Your Order for Pan Pizza");
		 System.out.println("Pan Pizza With "+ pizza.description());
		 System.out.println("Total order :"+ pizza.cost());

	}

}
