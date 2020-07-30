package org.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Day8 
{
	public static void main(String [] e)
	{
		
	
Map<String , Integer>phomebook=new HashMap<String, Integer>();

Scanner scan= new Scanner(System.in);
int n=scan.nextInt();

for(int i=0;i<n;i++)
{
	String name=scan.next();
	int number=scan.nextInt();
	phomebook.put(name, number);
}
while(scan.hasNext())
{
	String s=scan.next();
	Integer phonenumber=phomebook.get(s);
	System.out.println(phonenumber!=null ? s + "=" + phonenumber 
            : "Not found");
}
scan.close();
}
}