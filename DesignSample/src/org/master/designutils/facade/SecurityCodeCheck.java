package org.master.designutils.facade;

public class SecurityCodeCheck {
	private int securityCode = 1234 ;
	private int getSecurityCode(){
		return securityCode ;
	}
	
	public boolean isCodeValid(int securityCode){
		return ( securityCode == getSecurityCode()) ;
	}
	 

}
