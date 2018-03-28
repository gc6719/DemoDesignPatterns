package org.master.designutils.observer;

public class StockObserver implements MasterObserver {
	
	double ibmPrice , aaplPrice , googPrice ;
	public static int observerIDTracker = 0 ;
	private int observerID ;
	private MasterSubject stockGrabber ;
	
	public StockObserver(MasterSubject stockGrabber) {
		this.stockGrabber = stockGrabber ;
		observerID = ++observerIDTracker ; 
		this.stockGrabber.reg(this);
		System.out.println("New Observer "+ this.observerID);
	}

	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		 
		this.ibmPrice = ibmPrice ;
		this.aaplPrice = aaplPrice ;
		this.googPrice = googPrice ;
		System.out.println(observerID+": \nIBM:"+ibmPrice+"\nAapl:"+aaplPrice+"\nGoogle:"+googPrice);
	}

}
