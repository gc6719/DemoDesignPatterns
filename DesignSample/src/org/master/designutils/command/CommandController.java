package org.master.designutils.command;

/**
 * A CommandController should be implemented by all controllers
 */
public interface CommandController {
	public void execute(String command);
	public boolean hasControl(String command);
}
