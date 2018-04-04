package org.master.designutils.observer;

import java.text.DecimalFormat;

public class GetStockRunnable implements Runnable {

	//private int startTime;
	private String stock;
	private double stockPrice;	
	private StockGrabber sockGrabber ;
		
	  GetStockRunnable(/*int startTime,*/ String stock, double stockPrice,  StockGrabber sockGrabber) 
	  {		 
		//this.startTime = startTime;
		this.stock = stock;
		this.stockPrice = stockPrice;
		this.sockGrabber = sockGrabber;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {				 
				e.printStackTrace();
			}
			double ranNum =( Math.random() * (0.06)) - 0.03 ;
			DecimalFormat format = new DecimalFormat("#.##");
			stockPrice = Double.parseDouble(format.format((stockPrice+ranNum))) ;
			if(stock.equals("IBM"))((StockGrabber) sockGrabber).setIbmPrice(stockPrice);
			if(stock.equals("AAP"))((StockGrabber) sockGrabber).setAaplPrice(stockPrice);
			if(stock.equals("GOOG"))((StockGrabber) sockGrabber).setGoogPrice(stockPrice);
			System.out.println(stock+" "+ format.format((stockPrice+ranNum))  +" "+format.format(ranNum));
			System.out.println("");
		}

	}

}
