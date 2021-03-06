package org.master.designutils.command;

import javax.swing.JOptionPane;
public class Pilot {
	private Cockpit cockpit ;
	private String[ ] commands = {
			Cockpit.TAKE_OFF,
			Cockpit.LAND,
			Cockpit.REACH_ALTITUDE,
			WingControls.MOVE_UP,
			WingControls.MOVE_DOWN,
			WingControls.KEEP_FLAT,
			EngineControl .SPEED_DOWN,
			EngineControl .SPEED_UP,
			Cockpit.EXIT
	};
	
	public Pilot(Cockpit cockpit) {
		this.cockpit= cockpit ;
	}

	public void fly(){
		do{
		String command = (String)JOptionPane.showInputDialog(null, "Give command", "Command Controls", JOptionPane.INFORMATION_MESSAGE, null, this.commands, this.commands[0]);
		cockpit.execute(command);
		}while(true);
	}
	 

}
