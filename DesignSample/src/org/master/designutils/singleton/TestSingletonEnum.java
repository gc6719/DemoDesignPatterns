package org.master.designutils.singleton;

public class TestSingletonEnum {

	enum Singleton  {
		INSTANCE;
		public String getCOnfig(){
			 return ("test config");
		}
	};
	public static void main(String[] args) {
		Singleton s1 =  Singleton.INSTANCE;
		Singleton s2 =  Singleton.INSTANCE;
		printSingleTon("s1",s1);
		 printSingleTon("s2",s2);

	}
	 static void printSingleTon(String name ,Singleton singleton){
		 System.out.println(String.format("Object :%s  , HashCode : %d",name , singleton.hashCode()));
	 }
}
