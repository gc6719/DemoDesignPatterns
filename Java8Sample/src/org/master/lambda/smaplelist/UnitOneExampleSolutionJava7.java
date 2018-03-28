package org.master.lambda.smaplelist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitOneExampleSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Guru", "Cm", 26),
				new Person("Guru", "PM", 29), new Person("Test", "HOme", 320),
				new Person("Vinay", "Doli", 26), new Person("VIjay", "D", 36));

		// Task1 :Sort List by Last name

		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		;

		System.out.println("*******prints all******");
		// Task2 : Create method that prints all element in the give list
		printList(people);

		System.out
				.println("*******print all person that has last name begging with D******");

		// Task3 : Create method that print all person that has last name
		// begging with D
		ptintConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {

				return p.getLastName().startsWith("D");
			}
		});

		System.out
		.println("*******print all person that has name begging with G******");

		ptintConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {

				return p.getName().startsWith("G");
			}
		});

	}

	private static void ptintConditionally(List<Person> people,
			Condition condition) {
		for (Person person : people) {
			if (condition.test(person))
				System.out.println(person);
		}

	}

	private static void printList(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}

	}

}
