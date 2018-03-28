package org.master.designutils.factory;

import java.io.File;
import java.util.List;

public class XmlParser extends TextParser {

	public XmlParser(File file) {
		System.out.println("Creating XMl Parser..");
	}

	@Override
	public List<Record> parse() {
		System.out.println("parsing Xml values and creating record list");
		return null;
	}
	
	

}
