package org.master.designutils.command;

public class WingControls implements CommandController {
	public static final String MOVE_UP = "MOVE_UP";
	public static final String MOVE_DOWN = "MOVE_DOWN";
	public static final String TURN_LEFT = "TURN_LEFT";
	public static final String TURN_RIGHT = "TURN_RIGHT";
	public static final String KEEP_FLAT = "KEEP_FLAT";
	
	Wings wings ;
	WingControls(){
		this.wings = new Wings();
	}
	
	
	
	
	
	
	
	@Override
	public void execute(String command) {
		switch (command) {			
		case MOVE_UP :
			wings.moveUp();
			break;
		case MOVE_DOWN :
			wings.moveDown();
			break;
		case  TURN_LEFT :
			wings.turnLeft();
			break;
		case  TURN_RIGHT :
			wings.turnRight();
			break;
		case  KEEP_FLAT :
			wings.keepFlat();
			break;

		default:
			System.out.println("Sorry I don't understand wing operation commend");
			break;
		} 

	}

	@Override
	public boolean hasControl(String command) {	
		return (command != null) ?
				(command.equals(MOVE_UP) ||
				 command.equals(MOVE_DOWN) ||
				 command.equals(TURN_LEFT) ||
				 command.equals(TURN_RIGHT) ||
				 command.equals(KEEP_FLAT) ) : false ;
	}

}
