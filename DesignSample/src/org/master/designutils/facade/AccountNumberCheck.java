package org.master.designutils.facade;

public class AccountNumberCheck {

	private int accountNumber = 987654 ;
	private int getAccountNumber(){
		return accountNumber ;
	}
	
	public boolean isAccountActive(int accountNumber){
		return ( accountNumber == getAccountNumber()) ;
	}

}
