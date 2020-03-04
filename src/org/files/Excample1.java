package org.files;

import java.io.FileWriter;

public class Excample1 {

	public static void main(String[] args) 
	{
		try
		{
			
		
	String path="F:\\write.txt";
	FileWriter writer=new FileWriter(path);
	writer.write("Gopinath");

	writer.close();
	System.out.println(writer);
	}
catch(Exception e)
		{
	e.printStackTrace();
		}
	
}
}