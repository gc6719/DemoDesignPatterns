package org.master.lambda.exceptionhandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] setValues = {1 , 2,3,4};
		int key = 0 ;
		
		//TRY CATCH BLOCK CAN BE REMOVED 
	/*	process(setValues , key , (v,k)-> {
			try {
				System.out.println(v/k);
			} catch (ArithmeticException e) {			 
				System.out.println("ArithmeticException" );
			}
		});*/
		
		process(setValues , key , wrapperLambda((v,k)->  	System.out.println(v/k) ));

	}

	private static void process(int[] setValues, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : setValues) {
			consumer.accept(i, key);
		}
		
	}
	
	static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){		
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {			 
				System.out.println("ArithmeticException in wrapperLambda" );
			}
			
		} ;
		
	}

}
