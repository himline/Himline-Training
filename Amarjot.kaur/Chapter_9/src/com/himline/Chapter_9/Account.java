package com.himline.Chapter_9;

public class Account {
private int balance = 50;
public int getbalance(){
	return balance;
}
public void withdraw(int amount){
	balance = balance - amount;
}
}
