package org.master.designutils.command;

import java.util.ArrayList;
import java.util.List;

public class Exec {

	public static void main(String[] args) {
		WingControls wingControls = new WingControls();
		EngineControl  engineControls = new EngineControl ();
		List<CommandController> commandControllers = new ArrayList<CommandController>();
		commandControllers.add(wingControls);
		commandControllers.add(engineControls);
		Cockpit cockpit = new Cockpit(commandControllers);
				
		Pilot pilot = new Pilot(cockpit);
		pilot.fly();
	}

}
