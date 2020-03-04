package com.wed;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXEC8 {

	public static void main(String[] args) 
	{
	try
	{
		String path="F:\\Book1.xlsx";
		FileInputStream fi= new FileInputStream(path);
		Workbook book=WorkbookFactory.create(fi);
		Sheet s=book.createSheet("latest");
		s.createRow(0).createCell(0).setCellValue("gopinath Kumsi");
		fi.close();
		FileOutputStream fout= new FileOutputStream(path);
		book.write(fout);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
