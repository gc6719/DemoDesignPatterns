package org.master.designutils.observer;

import java.util.ArrayList;

public class StockGrabber implements MasterSubject {

	ArrayList<MasterObserver> observers;
	double ibmPrice , aaplPrice , googPrice ;
	
	  StockGrabber() {
		observers = new ArrayList<MasterObserver>();

	}
	
	@Override
	public void reg(MasterObserver newObserver) {
		 observers.add(newObserver);

	}

	@Override
	public void unReg(MasterObserver deleteObserver) {
		 int observerIndex = observers.indexOf(deleteObserver);
		 System.out.println("Observer "+(observerIndex+1)+" Deleted");
		 observers.remove(observerIndex);

	}

	@Override
	public void notifyObservers() {
		 for (MasterObserver masterObserver : observers) {
			masterObserver.update(ibmPrice, aaplPrice, googPrice);
		}

	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		 notifyObservers() ;
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		 notifyObservers() ;
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		 notifyObservers() ;
	}
	
	

}
