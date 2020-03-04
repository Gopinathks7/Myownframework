package org.data;


import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.excel.Excel;

public class TestDatings
{
	
String path="E:/data.xlsx";
	 
@Test(dataProvider = "getData")
public void putData(String sub1,String sub2)
{
	
	Reporter.log(sub1+" "+sub2+" ",true);
	
}

@DataProvider
public  Object[][] getData()
{
	Object [][] s=new String[2][2];
	
	try
	{
	FileInputStream fin=new FileInputStream(path);
	Workbook book=WorkbookFactory.create(fin);
	int row=book.getSheet("Sheet1").getLastRowNum();
	int col=book.getSheet("Sheet1").getRow(0).getLastCellNum();

	for(int i=0;i<=row;i++)
	{
		 for(int j=0;j<col;j++)
		 {
			 s[i][j]=book.getSheet("Sheet1").getRow(i).getCell(j);
		 }
	}
			
	
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return s;
}
}