package org.master.lambda.three;

//Method References
public class MethodReferenceExample1 {

	public static void main(String[] args) {
		/* Thread t = new Thread(()->printMessage());
		 t.start();*/
		
		
		/*MethodReferenceExample::printMessage === ()->printMessage()*/
		 Thread t = new Thread(MethodReferenceExample1::printMessage); //This is Same As ()->printMessage()
		 
		 t.start();

	}
	
	public static void printMessage(){
		System.out.println("Hello");
	}

}
