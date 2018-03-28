package org.master.designutils.factory;

public class TestFactor {

	public static void main(String[] args) {
		System.out.println("***Start*****");
		BatchProcessor processor = new CsvBatchProcessor();
		processor.processBatch(args[0] );
		System.out.println("****Done****");
		

	}

}
