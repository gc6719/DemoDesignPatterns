package org.master.designutils.command;

import java.util.List;

public class Cockpit implements CommandController {

	List<CommandController> commandControls;

	public Cockpit(List<CommandController> commandControls) {
		commandControls.add(this);
		this.commandControls = commandControls;
	}

	static final String TAKE_OFF = "TAKE_OFF";
	static final String LAND = "LAND";
	static final String REACH_ALTITUDE = "REACH_ALTITUDE";
	static final String EXIT = "EXIT";

	@Override
	public void execute(String command) {
		for (CommandController commandController : commandControls) {

			if (commandController instanceof Cockpit) {
				switch (command) {
				case TAKE_OFF:
					this.takeOff();

					break;
				case LAND:
					this.land();
					break;
				case REACH_ALTITUDE:
					this.reachAltitude();
					break;
				case EXIT:
					System.exit(1);
					break;

				/*default:
					System.out
					.println("Sorry I don't understand Cockpit operation commend");
					break;*/
				}

			} else if (commandController.hasControl(command)) {
				commandController.execute(command);
			}/* else {
				System.out
						.println("Sorry I don't understand operation commend");
			}*/
		}

	}

	private void reachAltitude() {		 
		System.out.println("Flying at and Altitude...");
		 this.execute(EngineControl.SPEED_UP);
		 this.execute(WingControls.KEEP_FLAT);
		 System.out.println("...........................");
	}

	private void land() {
		 System.out.println("Landing the Fight...");
		 this.execute(EngineControl.SPEED_DOWN);
		 this.execute(WingControls.MOVE_DOWN);
		 System.out.println("...........................");
		
	}

	private void takeOff() {
		 System.out.println("Flight take-off operation..");
		 this.execute(EngineControl.SPEED_UP);
		 this.execute(WingControls.MOVE_UP);
		 System.out.println("...........................");
		
	}

	@Override
	public boolean hasControl(String command) {

		return false;
	}

}
