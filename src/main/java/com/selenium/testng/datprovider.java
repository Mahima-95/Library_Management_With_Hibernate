package com.selenium.testng;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.DataProvider;

public class datprovider {
	
	
		@DataProvider(name="ExcelData1")
		public Object[][] dataProvider() throws BiffException, IOException
		{
			File f = new File("D:\\Charter\\Book1.xls");
			Workbook wk = Workbook.getWorkbook(f);
			Sheet s = wk.getSheet(0);
			
			int r=s.getRows();
			int c=s.getColumns();
			
			
			System.out.println("number of rows--->"+r +"number of col--->"+c);
			
			Object[][] a = new Object[r][c];
			
			
			for(int i=0;i<r;i++) // row
			{
				for(int j=0;j<c;j++) // col
				{
					
					Cell v=s.getCell(j, i);
					a[i][j]=v.getContents();
					
					
				}
			}
			return a;
		}
		
	}


