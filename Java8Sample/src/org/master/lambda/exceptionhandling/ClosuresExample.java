package org.master.lambda.exceptionhandling;

public class ClosuresExample {

	public static void main(String[] args) {
		int i = 10 ; 
		 int x = 20 ;
		doProcess(i, a -> System.out.println(i+x));
	}	
	public static void doProcess(int i , Process process)
	{
		process.process(i);
	}
}

  interface Process{
	void process(int i) ;
}
