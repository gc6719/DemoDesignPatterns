package org.master.designutils.decorator.satellitetv;

public class ESPN extends ChannelDecorator {

	public ESPN(SatelliteTv satelliteTv) {
		super(satelliteTv);
	}

	@Override
	public void show(int channelNo) {
		if (channelNo > 100 && channelNo < 200)
			System.out.println("Watching Sports Channels");
		else
			this.getSatelliteTv().show(channelNo);
	}

	@Override
	public Double subscriptionPrice() {
		return this.getSatelliteTv().subscriptionPrice() + 7.0;
	}

}
