package org.hackerrank;

import java.util.Scanner;

abstract class Book 
{
String title;
String author;
int price;
public abstract void display();
public Book(String title,String author,int price)
{
	this.author=author;
	this.title=title;
	this.price=price;
}
}
public class MyBook extends Book
{

	public MyBook(String title, String author, int price) {
		super(title, author, price);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void display() 
	{
		System.out.println("Title==>"+title);
		System.out.println("Author==>"+author);
		System.out.println("Price==>"+price);
		
	}
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		String title=scan.next();
		String author=scan.next();
		int price=scan.nextInt();
		scan.close();
		MyBook book=new MyBook(title,author,price);
		book.display();

	}

	

}







