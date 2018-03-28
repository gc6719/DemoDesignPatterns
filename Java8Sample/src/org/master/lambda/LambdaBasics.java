package org.master.lambda;

public class LambdaBasics {

	public static void main(String[] args) {
		LambdaBasics myLambdaBasics = new LambdaBasics();
		/*
		 * myLambdaBasics.doProcess(10, new Process() {
		 * 
		 * @Override public void process(int i) {
		 * System.out.println("value of i is "+i);
		 * System.out.println("value of this :"+this); }
		 * 
		 * public String toString(){ return "This is the Anoymous inner class";
		 * } });
		 */

	/*	myLambdaBasics.doProcess(10, i -> {
			System.out.println("value of i is " + i);
			// System.out.println("value of this :" + this); 'this' don't works 
		});*/
		myLambdaBasics.execute();

	}

	public void execute(){
		doProcess(10, i -> { 
			System.out.println("value of i is " + i);
			 System.out.println("value of this :" + this);   
		}) ;
	}
	
	public void doProcess(int i, Process process) {
		process.process(i);
	}
	
	public String toString(){
		return "this is the main This reference example class instance" ;
	}
}

interface Process {
	void process(int i);
}
