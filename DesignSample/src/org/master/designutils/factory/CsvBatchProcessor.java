package org.master.designutils.factory;

import java.io.File;

public class CsvBatchProcessor extends BatchProcessor {

	@Override
	public Parser creatParser(File file) {
		return new CsvParser(file);
	}

}
