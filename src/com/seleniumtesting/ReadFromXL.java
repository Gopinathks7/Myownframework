package com.seleniumtesting;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadFromXL
{

	private  static HashMap getValues(String path,String sheet,int r)
	{
		HashMap<String, String>map= new HashMap<String,String>();
		try
		{
		
		FileInputStream fi= new FileInputStream(path);
		Workbook book=WorkbookFactory.create(fi);
		Row row=book.getSheet(sheet).getRow(0);
		Row col=book.getSheet(sheet).getRow(r);
		int c=col.getLastCellNum();
		for(int i=0;i<c;i++)
		{
			map.put(row.getCell(i).toString(), col.getCell(i).toString());
		}
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return map;
		
	}
	public static void main(String[] args)
	{
		String path="F:\\contact.xlsx";
		getValues(path, "Sheet1", 0);
	}

}
