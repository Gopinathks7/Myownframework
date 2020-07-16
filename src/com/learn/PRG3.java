package com.learn;

public class PRG3 {

 class B
{
	public  void one()
	{
		System.out.println("One");
	}
}
	public static void main(String[] args) 
	{
		PRG3 p = new PRG3();
		B b= p.new B();
		b.one();
		

	}

}
