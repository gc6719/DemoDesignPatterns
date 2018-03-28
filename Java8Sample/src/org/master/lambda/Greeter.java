package org.master.lambda;

public class Greeter {

	void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		// Implementing Interface In Class
		// Instance of a class of greeting interface
		Greeting helloWorldGreeting = new HelloWorldGreeting();

		// Creating Lambda expression for interface
		Greeting lambdagreeting = () -> System.out.println("Hello World..!");

		// Anonymous Inner class (Dosn't have name)
		Greeting innerClassGreeting = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Hello World by Inner Class");
			}
		};
		/*helloWorldGreeting.perform();
		lambdagreeting.perform();
		innerClassGreeting.perform();*/
		greeter.greet(helloWorldGreeting);
		greeter.greet(lambdagreeting);
		greeter.greet(innerClassGreeting);

	}

}

/*
 * interface MyLambda{ void perform(); } interface MyAdd{ int add(int b , int
 * y); }
 */
