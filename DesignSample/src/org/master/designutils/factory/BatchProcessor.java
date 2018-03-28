package org.master.designutils.factory;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {
	//ADD FOR SECOND COMMIT
	public final void processBatch(String fileName /*, String format*/){
		File file = openFile(fileName);
		
		/* Working Sample code
		 * Before Design patter concept is applied
		 * To fix this using Factory Method design patter
		 * To create parser class (support multiple format of parser's) 
		TextParser parser = null;
		if(format.equals("text")){
			parser = new TextParser(file);
		}else if(format.equals("csv")){
			parser = new CsvParser(file);
		}else if(format.equals("xml")){
			parser = new XmlParser(file);
		}*/
		
		Parser  parser = creatParser(file);	//Factory method 	
		List<Record> list =  parser.parse();
		processRecords(list);
		writeSummery();
		closerfile(file);			
	}

	public abstract Parser creatParser(File file) ;
	private File openFile(String fileName) {
		System.out.println("Open file..");
		return null;
	}
	private void processRecords(List<Record> list){
		System.out.println("Processing each record Db calls , etc..");
	}
	private void writeSummery() {
		System.out.println("Wrote batch summery o failed");
		
	}

	private void closerfile(File file) {
		System.out.println("Closed file");
		
	}

}
