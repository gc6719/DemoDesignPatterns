package org.master.designutils.observer;

public interface MasterSubject {

	void reg(MasterObserver observer);
	void unReg(MasterObserver observer);
	void notifyObservers();
}
