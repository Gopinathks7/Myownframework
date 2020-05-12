package org.one;

public class PRG101 {

	int amount=100;
	public int getBAlance()
	{
		System.out.println(amount);
		return amount;
	}
	
	public void putAmount(int put)
	{
		amount=put+amount;
		System.out.println("After deposti"+amount);
	}
	
	public static void main(String[] args)
	{
		PRG101 p= new PRG101();
		p.getBAlance();
		p.putAmount(200);

	}

}
