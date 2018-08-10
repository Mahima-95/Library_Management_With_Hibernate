package com.selenium.training;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.Test;

public class excelread {
	
	@Test
	public void m() throws BiffException, IOException
	{
		
		File f = new File("C:\\Users\\utomar\\Desktop\\test.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet s = wk.getSheet("Sheet1");
		
		int r=s.getRows();
		int c=s.getColumns();
		
		
		System.out.println("number of rows--->"+r +"number of col--->"+c);
		
		
		for(int i=0;i<r;i++) // row
		{
			for(int j=0;j<c;j++)
			{
				
				Cell v=s.getCell(j, i);
				System.out.println(v.getContents());
				
				
			}
		}
		
		
	}

}
