package org.master.designutils.decorator.satellitetv;

public class TestUserTv {

	public static void main(String[] args) {
		 SatelliteTv satelliteTv = new ESPN(new Cartoon(new TataSky()));
		 satelliteTv.show(99);
		 System.out.println(satelliteTv.subscriptionPrice());
	}

}
