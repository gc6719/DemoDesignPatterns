package org.master.designutils.observer;

public class GrabStockTest {

	public static void main(String[] args) {
		StockGrabber subject = new StockGrabber();
		MasterObserver observer1 = new StockObserver(subject);
		
		subject.setIbmPrice(672.5);
		subject.setAaplPrice(192.5);
		subject.setGoogPrice(696.5);
		
		MasterObserver observer2 = new StockObserver(subject);
		
		subject.setIbmPrice(672.5);
		subject.setAaplPrice(192.5);
		subject.setGoogPrice(696.5);
		
		subject.unReg(observer1);
		subject.setIbmPrice(672.5);
		subject.setAaplPrice(192.5);
		subject.setGoogPrice(696.5);
		
		Runnable getIBM = new GetStockRunnable(2, "IBM", 672.5, subject);
		Runnable getAAP = new GetStockRunnable(2, "AAP", 192.5, subject);
		Runnable getGOOG = new GetStockRunnable(2, "GOOG", 696.5, subject);
		
		new Thread(getIBM).start();
		new Thread(getAAP).start();
		new Thread(getGOOG).start();
		
	}

}
