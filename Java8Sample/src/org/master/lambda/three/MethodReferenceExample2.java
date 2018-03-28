package org.master.lambda.three;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.master.lambda.smaplelist.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Guru", "Cm", 26),
				new Person("Guru", "PM", 29), new Person("Test", "HOme", 320),
				new Person("Vinay", "Doli", 26), new Person("VIjay", "D", 36));

		 

		System.out.println("*******prints all******");
		 //System.out::println  === p -> System.out.println(p) 
		ptintConditionally(people, p -> true, System.out::println);

	 
	}

	private static void ptintConditionally(List<Person> people,
			Predicate<Person> p, Consumer<Person> consumer) {
		for (Person person : people) {
			if (p.test(person))
				consumer.accept(person);
		}

	}
}