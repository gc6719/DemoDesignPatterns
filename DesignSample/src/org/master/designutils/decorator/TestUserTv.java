package org.master.designutils.decorator;

import org.master.designutils.decorator.satellitetv.Cartoon;
import org.master.designutils.decorator.satellitetv.ESPN;
import org.master.designutils.decorator.satellitetv.SatelliteTv;
import org.master.designutils.decorator.satellitetv.TataSky;

public class TestUserTv {

	public static void main(String[] args) {
		 SatelliteTv satelliteTv = new ESPN(new Cartoon(new TataSky()));
		 satelliteTv.show(99);
		 System.out.println(satelliteTv.subscriptionPrice());
	}

}
