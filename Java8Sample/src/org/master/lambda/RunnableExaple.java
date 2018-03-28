package org.master.lambda;

public class RunnableExaple {

	public static void main(String[] args) {
		//JAVA 7 Exmaple For Runnable
		 Thread myThred = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside runnable");				
			}
		}); 
		 myThred.run();
		 
		 //JAVA 8 Lambda Expression For Runnable
		Thread myLambdaThread = new Thread(()-> System.out.println("Printed inside Lambda Thread"));
		myLambdaThread.run();		
		
	}

}
