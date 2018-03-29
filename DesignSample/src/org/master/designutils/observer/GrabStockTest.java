package org.master.designutils.observer;

import java.text.DecimalFormat;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class GrabStockTest {

	public static void main(String[] args) {
		StockGrabber subject = new StockGrabber();
		/*MasterObserver observer1 = new StockObserver(subject);
		
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
		
		Runnable getIBM = new GetStockRunnable(2, "IBM", 672.5, subject , (s) -> s.equals("IBM"));
		Runnable getAAP = new GetStockRunnable(2, "AAP", 192.5, subject,(s) -> s.equals("AAP"));
		Runnable getGOOG = new GetStockRunnable(2, "GOOG", 696.5, subject,(s) -> s.equals("GOOG"));
		
 		new Thread(getIBM).start();
		new Thread(getAAP).start();
		new Thread(getGOOG).start();
		
		*/
		
		TestValues getIBM =	  new	TestValues(2, "IBM", 672.5, subject , (s) -> s.equals("IBM"));
		TestValues getAAP = new TestValues(2, "AAP", 192.5, subject,(s) -> s.equals("AAP"));
		TestValues getGOOG = new TestValues(2, "GOOG", 696.5, subject,(s) -> s.equals("GOOG"));
		 new Thread(() -> { getConsumer().accept(getIBM) ;}).start();		
		 new Thread(() -> { getConsumer().accept(getAAP) ;}).start();	
		 new Thread(() -> { getConsumer().accept(getGOOG) ;}).start();	
	}
	
	static Consumer<TestValues>   getConsumer () {
		return (TestValues b) -> {
			IntStream.range(0, 5).forEach( nbr->{			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				 
				e.printStackTrace();
			}
			double ranNum =( Math.random() * (0.06)) - 0.03 ;
			DecimalFormat format = new DecimalFormat("#.##");
			b.stockPrice = Double.parseDouble(format.format((b.stockPrice+ranNum))) ;
			
			if(b.p.test(b.stock))((StockGrabber) b.sockGrabber).setIbmPrice(b.stockPrice);
			if(b.p.test(b.stock))((StockGrabber) b.sockGrabber).setAaplPrice(b.stockPrice);
			if(b.p.test(b.stock))((StockGrabber) b.sockGrabber).setGoogPrice(b.stockPrice);
			System.out.println("Loop"+nbr+" " +b.stock+" "+ format.format((b.stockPrice+ranNum))  +" "+format.format(ranNum));
			System.out.println("");
		}
		);
		} ;
	}

}

class TestValues{
	int startTime;
	String stock;
	double stockPrice;
	StockGrabber sockGrabber;
	Predicate<String> p;

	TestValues(int startTime, String stock, double stockPrice,StockGrabber sockGrabber, Predicate<String> p) 
	{		 
		this.startTime = startTime;
		this.stock = stock;
		this.stockPrice = stockPrice;
		this.sockGrabber = sockGrabber;
		this.p = p;
	}
	
	
	
	 
}
