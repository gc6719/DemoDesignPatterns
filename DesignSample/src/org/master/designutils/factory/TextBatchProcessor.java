package org.master.designutils.factory;

import java.io.File;

public class TextBatchProcessor extends BatchProcessor {

	@Override
	public Parser creatParser(File file) {
		return new TextParser(file);
	}

}
