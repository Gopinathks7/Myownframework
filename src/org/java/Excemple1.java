package org.java;

public class Excemple1
{
	
	private int amtbalance=200;
	
	public int getBalance()
	{
		System.out.println("Before"+amtbalance);
		return amtbalance;
	}
	public void putBalance(int amt)
	{
		amtbalance=amtbalance+amt;
		System.out.println("After"+amtbalance);
	}

	public static void main(String[] args) {

		Excemple1 one= new Excemple1();
		one.getBalance();
		one.putBalance(200);
	}

}
