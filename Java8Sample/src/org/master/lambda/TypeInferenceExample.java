package org.master.lambda;

public class TypeInferenceExample {

	public static void main(String[] args) {
		/* StringLength stringLambda = (  s)-> s.length();
		System.out.println( stringLambda.getLength("Hello World"));*/
		printLambda((s)-> s.length());
		
	}

	public static void printLambda(StringLength stringLength ){
		System.out.println(stringLength.getLength("Hello World"));
	}
	interface StringLength{
		int getLength(String s);
	}
}
