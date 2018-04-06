package org.master.designutils.facade;

public class BankAccountFacade {

	int accountNumber ;
	int securityCode ;
	AccountNumberCheck accountNumberCheck ;
	SecurityCodeCheck securityCodeCheck ;
	FundCheck fundCheck ;
	WellcomeToBank bank ;
	public BankAccountFacade(int accountNumber , int securityCode) {
		 this.accountNumber = accountNumber ;
		 this.securityCode = securityCode ;
		 accountNumberCheck = new AccountNumberCheck() ;
		 securityCodeCheck = new SecurityCodeCheck() ;
		 fundCheck = new FundCheck();
		 bank = new WellcomeToBank();
		 
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}


	 

	public int getSecurityCode() {
		return securityCode;
	}

	public void withdraw(double cashToWithdraw){
		if(accountNumberCheck.isAccountActive(getAccountNumber()) && 
				securityCodeCheck.isCodeValid(getSecurityCode()) && 
				fundCheck.haveEnoughMoney(cashToWithdraw)){
			fundCheck.cashWithdraw(cashToWithdraw);
			System.out.println("Transaction Complete\n");
		}else{
			System.out.println("Transaction failed\n");
		}
	}
	
	
	public void deposit(double cashToDeposit){
		if(accountNumberCheck.isAccountActive(getAccountNumber()) && 
				securityCodeCheck.isCodeValid(getSecurityCode())  ){
			fundCheck.cashDeposit(cashToDeposit) ;
			System.out.println("Transaction Complete\n");
		}else{
			System.out.println("Transaction failed\n");
		}
	}
}
