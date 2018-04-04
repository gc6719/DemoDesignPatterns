package org.master.designutils.command;

public class EngineControl implements CommandController {

	Engine engine ;
	static final String SPEED_UP = "SPEED_UP" ;
	static final String SPEED_DOWN = "SPEED_DOWN" ;
	
	public EngineControl() {
		engine = new Engine();
	}
	
	@Override
	public void execute(String command) {
		 switch (command	) {
		case SPEED_UP:
			engine.speedUp();
			break;
		case SPEED_DOWN:
			engine.speedDOWN();
			break;
		default:
			System.out.println("Sorry I don't understand ENGINE operation commend");
			break;
		}

	}

	@Override
	public boolean hasControl(String command) {
		return (command != null) ?
				(command.equals(SPEED_UP) ||
				 command.equals(SPEED_DOWN)  ) : false ;
		 
	}

}
