package org.master.lambda.three;

import java.util.Arrays;
import java.util.List;

import org.master.lambda.smaplelist.Person;

public class StreamsExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Guru", "Cm", 26),
				new Person("Guru", "PM", 29), new Person("Test", "HOme", 320),
				new Person("Vinay", "Doli", 26), new Person("VIjay", "D", 36));
		
		people.stream()
		.filter(p-> p.getLastName().startsWith("D"))
		.forEach(p-> System.out.println(p.getName()));
	}

}
