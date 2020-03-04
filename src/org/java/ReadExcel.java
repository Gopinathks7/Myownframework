package org.java;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) 
	{
		try
		{
	String path="";
	FileInputStream fin= new FileInputStream(path);
	Workbook book=WorkbookFactory.create(fin);
	}
catch(Exception e)
		{
	e.printStackTrace();
		}
}
}