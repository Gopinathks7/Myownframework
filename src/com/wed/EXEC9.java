package com.wed;

import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EXEC9 {
	public static void makFolder()
	{
		String files="F://gopikumsi";
		File file=new File(files);
		if(file.exists())
		{
			System.out.println("Folder Exixt");
		}
		else
		{
			file.mkdir();
		}
	}
	
	public static void makeFile() 
	{
		FileWriter fw=null;
		try
		{
		String filepath=("F:/nth.txt");
		File file=new File(filepath);
		fw=new FileWriter(file);
		fw.write("Teting the java code");
		if(file.exists())
		{
			System.out.println("File Exist");
		}
		else
		{
			file.createNewFile();
			
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try
			{
			System.out.println("File Created sucessfully");
			fw.flush();
			fw.close();
		}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
	}
		public static void readFile() 
		{
			FileWriter writer=null;
			try
			{
			String folderpath="f://kumsi";
			String filepath="f://kumsi//latest.txt";
			File foler=new File(folderpath);
			File file=new File(filepath);
			
			if(foler.exists()&&file.exists() )
			{
				 System.out.println("Folder Pressent and File are pressent ");
			}
			else
			{
				foler.mkdir();
				file.createNewFile();
				writer=new FileWriter(file);
				writer.write("gopinath kums");
				System.out.println("Creted");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				}
			finally {
				try {
					writer.flush();
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		public static void runVideo()
		{
			try
			{
			
			}
		catch(Exception e)
			{
			e.printStackTrace();
			}
		}
	public static void main(String[] args)
	{
		runVideo();
	}

}
