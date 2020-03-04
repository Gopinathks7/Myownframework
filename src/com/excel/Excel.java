package com.excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel
{

	
	public static int getRowValue(String sheet,String path)
	{
		int row=0;
		try {
			FileInputStream fi = new FileInputStream(path);
			Workbook book=WorkbookFactory.create(fi);
			row=book.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return row;
	}
	public static  String getCallValue(String sheet,String path,int row,int col)
	{
		String value="";
		try {
			FileInputStream fi = new FileInputStream(path);
			Workbook book=WorkbookFactory.create(fi);
			
			value=book.getSheet(sheet).getRow(row).getCell(col).toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return value;
	}
	}
