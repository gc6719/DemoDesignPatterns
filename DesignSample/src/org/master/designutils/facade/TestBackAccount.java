package org.master.designutils.facade;

public class TestBackAccount {

	public static void main(String[] args) {
		BankAccountFacade bank = new BankAccountFacade(987654 , 1234) ;
		bank.withdraw(50.0) ;
		bank.withdraw(900.0) ;
		bank.deposit(50.0) ;
		bank.withdraw(900.0) ;
	}

}
