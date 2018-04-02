package org.master.designutils.singleton;

import java.io.Serializable;

public class Singleton implements /*Serializable*/ Cloneable{
	
//	private static Singleton soleInstance = new Singleton(); //Eager loading
	
	private static Singleton soleInstance ; //lazy loading 
	private Singleton(){
	System.out.println("Creating Singleton ...");	
	}
	public static Singleton getInstance(){
		if(soleInstance == null){soleInstance = new Singleton();}
		return soleInstance  ;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		 
		return super.clone();
	}

	
}
