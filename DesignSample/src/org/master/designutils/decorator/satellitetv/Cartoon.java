package org.master.designutils.decorator.satellitetv;

public class Cartoon extends ChannelDecorator {

	public Cartoon(SatelliteTv satelliteTv) {
		super(satelliteTv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show(int channelNo) {
		if (channelNo > 200 && channelNo < 300)
			System.out.println("Watching Cartoon Channels");
		else
			this.getSatelliteTv().show(channelNo);
	}

	@Override
	public Double subscriptionPrice() {
		return this.getSatelliteTv().subscriptionPrice() + 10.0;
	}

}
