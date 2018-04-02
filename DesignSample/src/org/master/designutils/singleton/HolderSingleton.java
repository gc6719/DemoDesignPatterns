package org.master.designutils.singleton;

 

public class HolderSingleton {

	private HolderSingleton() {
		System.out.println("Creating Fixed Singleton ...");
	}

	public static HolderSingleton getInstance() {
		return Holder.HOLDER_SINGLETON;
	}

	static class Holder {
		static final HolderSingleton HOLDER_SINGLETON = new HolderSingleton();
	}
}
