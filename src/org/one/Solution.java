package org.one;

import java.util.Scanner;

abstract class Book
{
	String title;
	String author;
	public Book(String title,String author)
	{
		title=this.title;
		author=this.author;
	}
	public abstract void display();
}

class MyBook extends Book
{
	int price=0;
	public MyBook( String title,String author,int price)
	{
		super("java","gopinath");
		
	

		// TODO Auto-generated constructor stub
	}

	@Override
	public void display()
	{
		
		
	System.out.println("Title "+title);
	System.out.println("Author"+author);
	System.out.println("Price"+price);
	
		
	}

	
}
public class Solution {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		String title=scan.next();
		String author=scan.next();
		int price=scan.nextInt();
		
	Book book=new MyBook(title,author,price);
		book.display();

	}

}
