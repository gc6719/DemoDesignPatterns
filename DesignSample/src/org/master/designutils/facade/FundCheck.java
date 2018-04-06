package org.master.designutils.facade;

public class FundCheck {

	private double cashInAccount = 1000.0 ;
	private double getCashInAccount(){
		return cashInAccount ;
	}
	
	
	public void decreaseCashInAccount(double withdrawalAmount){
		cashInAccount -= withdrawalAmount ;
	}
	public void increaseCashInAccount(double depositeAmount){
		cashInAccount += depositeAmount ;
	}
	
	public boolean haveEnoughMoney(double cashToWithdraw){		
		return cashToWithdraw <= getCashInAccount() ;		
	}
	
	public void cashWithdraw(double cashToWithdraw){
		if(haveEnoughMoney(cashToWithdraw)){
			decreaseCashInAccount(cashToWithdraw);
			System.out.println("Withdrawal Completed:Current balance is "+getCashInAccount());
			
		}else{
			System.out.println("Error: You dont have enough Money to withdraw");
			System.out.println("Current balance:"+getCashInAccount());
		}
	}
	
	public void cashDeposit(double cashToDeposite){
		increaseCashInAccount(cashToDeposite);
		System.out.println("Deposit Completed:Current balance is "+getCashInAccount());
	}
	

}
