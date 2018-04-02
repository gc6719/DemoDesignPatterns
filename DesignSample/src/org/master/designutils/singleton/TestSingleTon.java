package org.master.designutils.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleTon {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,  Exception  {
		 Singleton s1 =  Singleton.getInstance();
		 Singleton s2 =  Singleton.getInstance();
		/* printSingleTon("s1",s1);
		 printSingleTon("s2",s2);*/
		 
		 //Reflection
		 
	/*	Class class1 =  Class.forName("org.master.designutils.singleton.Singleton") ;
		Constructor <Singleton> constructor = class1.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton s3 = constructor.newInstance();
		System.out.println( "Object created using reflection" );
		 printSingleTon("s3",s3);*/
		 
		 // Serialization and Deserialization 
		 
	/*	 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:/s2.ser")) ;
		 oos.writeObject(s2);
		 
		 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:/s2.ser")) ;
		 Singleton s3 = (Singleton) ois.readObject();
		 printSingleTon("s3",s3);*/
		 
		 
		 //Clone 
		/* 
		 Singleton s3 =  (Singleton) s2.clone();
		 printSingleTon("s3",s3);*/
		 
		 
		 // Multi-thread 
		 
		 ExecutorService service = Executors.newFixedThreadPool(4);
		 service.submit(TestSingleTon::userSingleton);
		 service.submit(TestSingleTon::userSingleton);
		 
		 //service.submit(TestSingleTon::userSingleton);
		 service.shutdown();
	}

	static void userSingleton(){
		Singleton singleton = Singleton.getInstance();
		printSingleTon("singleton", singleton);
	}
	 static void printSingleTon(String name ,Singleton singleton){
		 System.out.println(String.format("Object :%s  , HashCode : %d",name , singleton.hashCode()));
	 }
}
