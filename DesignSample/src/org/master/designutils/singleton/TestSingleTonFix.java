package org.master.designutils.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleTonFix {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,  Exception  {
		FixedSingleton s1 =  FixedSingleton.getInstance();
		FixedSingleton s2 =  FixedSingleton.getInstance();
		/* printSingleTon("s1",s1);
		 printSingleTon("s2",s2);*/
		 
		 //Reflection Issue Fixed 
		 
	/*	Class class1 =  Class.forName("org.master.designutils.singleton.FixedSingleton") ;
		Constructor <FixedSingleton> constructor = class1.getDeclaredConstructor();
		constructor.setAccessible(true);
		FixedSingleton s3 = constructor.newInstance(); // This is reason for failure of singleton design pattern , Make constructor to handle this case 
		System.out.println( "Object created using reflection" );
		 printSingleTon("s3",s3);*/
		 
		 
		//END Reflection Issue Fixed 
		 
		 
		 
		 // Serialization and Deserialization Fix :-  private Object readResolve() throws ObjectStreamException
		 // After deserialization readResolve() method is called , overriding this method will solve issue 
		 
	/*	 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:/s2.ser")) ;
		 oos.writeObject(s2);
		 
		 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:/s2.ser")) ;
		 FixedSingleton s3 = (FixedSingleton) ois.readObject();
		 printSingleTon("s3",s3);*/
		// Serialization and Deserialization
		 
		 //Clone  Don't allow user to cloning object 
		 
		/* FixedSingleton s3 =  (FixedSingleton) s2.clone();
		 printSingleTon("s3",s3);*/
		//END Clone
		 
		 // Multi-thread  Make use of synchronized and volatile keyword 
		 
		 ExecutorService service = Executors.newFixedThreadPool(4);
		 service.submit(TestSingleTonFix::userSingleton);
		 service.submit(TestSingleTonFix::userSingleton);		  
		 service.shutdown();
	}

	static void userSingleton(){
		FixedSingleton singleton = FixedSingleton.getInstance();
		printSingleTon("singleton", singleton);
	}
	 static void printSingleTon(String name ,FixedSingleton singleton){
		 System.out.println(String.format("Object :%s  , HashCode : %d",name , singleton.hashCode()));
	 }
}
