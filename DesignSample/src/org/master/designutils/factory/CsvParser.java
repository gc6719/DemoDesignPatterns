package org.master.designutils.factory;

import java.io.File;
import java.util.List;

public class CsvParser extends TextParser {

	public CsvParser(File file) {
		System.out.println("Creating csv parser...");
	}

	@Override
	public List<Record> parse() {
		System.out.println("Parsing csv values and creating record list");
		return null;
	}

	
}
