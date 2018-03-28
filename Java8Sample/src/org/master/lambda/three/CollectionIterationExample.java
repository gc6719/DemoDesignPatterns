package org.master.lambda.three;

import java.util.Arrays;
import java.util.List;

import org.master.lambda.smaplelist.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(new Person("Guru", "Cm", 26),
				new Person("Guru", "PM", 29), new Person("Test", "HOme", 320),
				new Person("Vinay", "Doli", 26), new Person("VIjay", "D", 36));
		
		System.out.println("Using for in loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for in  loop");
		for (Person person : people) {
			System.out.println(person);
		}
		
		System.out.println("Using Lambda for each loop");
		people.forEach( System.out::println );
	}

}
