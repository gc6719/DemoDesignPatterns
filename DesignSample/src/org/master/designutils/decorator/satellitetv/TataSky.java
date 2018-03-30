package org.master.designutils.decorator.satellitetv;

public class TataSky implements SatelliteTv {

	@Override
	public void show(int channelNo) {
		 if(channelNo < 100){
			 System.out.println("Watching Basic Channels");
		 }else{
			 System.out.println("Please subscribe Channel");
		 }

	}

	@Override
	public Double subscriptionPrice() {
		 
		return 100.0;
	}

}
