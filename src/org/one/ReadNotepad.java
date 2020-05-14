package org.one;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class ReadNotepad {

	public static void main(String[] args) 
	{
		  int count=0;
		//File file = new File("E:/sample.txt");
		String file=("E:/sample.txt");
		try
		{
		Scanner sc = new Scanner(new FileInputStream(file));
		;
		   while(sc.hasNext())
		   {
		    //   sc.next();
		    
		     System.out.println( sc.nextLine());
			        count++;
		}
		    sc.close();
		System.out.println("Number of words: " + count);
		
		}
	
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}




	}


