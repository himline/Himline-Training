package com.himline.Chapter_9;

public class AccountDanger {
	private Account acc = new Account();
	public static void main(String[] args) {
		AccountDanger Accdan = new AccountDanger();
		Thread one = new Thread();
		Thread two = new Thread();
		one.setName("amar");
		two.setName("jot");
		one.start();
		two.start();
	}
	public void run(){
		for(int x = 0 ; x < 3 ; x++){
			makewithdrawl(10);
			if(acc.getbalance() < 0){
			System.out.println("Account is overdrawn!");
			}
		}
	}
	private void makewithdrawl(int amt) {
		if(acc.getbalance() >= amt){
			System.out.println(Thread.currentThread().getName() +"is going to withdrawn ");			
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		acc.withdraw(amt);
		System.out.println(Thread.currentThread().getName() +"completes the withdrawn ");
		}
		else{
		System.out.println("Not enough in account for " +Thread.currentThread().getName() +"To withdrawn " +acc.getbalance());
		}
		
	}

}
