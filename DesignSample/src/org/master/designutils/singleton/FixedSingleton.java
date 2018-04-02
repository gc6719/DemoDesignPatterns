package org.master.designutils.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class FixedSingleton implements Serializable/*, Cloneable*/{
	
//	private static Singleton soleInstance = new Singleton(); //Eager loading
	
	private static volatile FixedSingleton soleInstance ; //lazy loading 
	private FixedSingleton(){
		if(soleInstance != null) throw new RuntimeException("Can't Create, Please use getInstance()");
		// Proceed with creation of object
	System.out.println("Creating Fixed Singleton ...");	
	}
	public static  FixedSingleton getInstance(){
		// Double checked Locking...
		if(soleInstance == null){
			synchronized (FixedSingleton.class) {
				if(soleInstance == null) soleInstance = new FixedSingleton();
			}
			
			}
		return soleInstance  ;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		 
		return super.clone();
	}

	private Object readResolve() throws ObjectStreamException{
		System.out.println("******* readReslove *******");
		return soleInstance;
		
	}
	
}
