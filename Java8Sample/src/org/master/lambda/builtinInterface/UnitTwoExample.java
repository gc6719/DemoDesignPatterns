package org.master.lambda.builtinInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.master.lambda.smaplelist.Person;

public class UnitTwoExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Guru", "Cm", 26),
				new Person("Guru", "PM", 29), new Person("Test", "HOme", 320),
				new Person("Vinay", "Doli", 26), new Person("VIjay", "D", 36));

		// Task1 :Sort List by Last name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		System.out.println("*******prints all******");
		// Task2 : Create method that prints all element in the give list
		ptintConditionally(people, p -> true , (p)-> System.out.println(p));

		System.out .println("*******print all person that has last name begging with D******");

		// Task3 : Create method that print all person that has last name
		// begging with D
		ptintConditionally(people, p -> p.getLastName().startsWith("D"), (p)-> System.out.println(p));

		System.out
				.println("*******print all person that has name begging with G******");

		ptintConditionally(people, p -> p.getName().startsWith("G"), (p)-> System.out.println(p));
	}

	private static void ptintConditionally(List<Person> people, Predicate<Person> p , Consumer<Person> consumer) {
		for (Person person : people) {
			if (p.test(person))
				consumer.accept(person);
		}

	}
}
