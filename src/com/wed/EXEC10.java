package com.wed;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXEC10 {

	public static void main(String[] args) 
	{
		try
		{
		String path="F:\\ku.xlsx";
		FileInputStream fin= new FileInputStream(path);
		Workbook book=WorkbookFactory.create(fin);
		
		
Sheet s=book.createSheet("One");
s.createRow(0).createCell(0).setCellValue("Gopinath");
//s.createRow(1).createCell(1).setCellValue("Bangalore");
//s.createRow(2).createCell(2).setCellValue("Kumsi");
//s.createRow(3).createCell(3).setCellValue("Manali");
//s.createRow(4).createCell(4).setCellValue("Delhi");
FileOutputStream fout=new FileOutputStream(path);
book.write(fout);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Done");
		}
	}

}
