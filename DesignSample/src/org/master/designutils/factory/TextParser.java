package org.master.designutils.factory;

import java.io.File;
import java.util.List;

public class TextParser implements Parser{
	public TextParser() {
	}

	public TextParser(File file) {
			System.out.println("Creating TextParser...");
	}

	public List<Record> parse() {
		System.out.println("Parsing text creating record list");
		return null;
	}
	

}
