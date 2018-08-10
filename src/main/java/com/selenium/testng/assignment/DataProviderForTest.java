package com.selenium.testng.assignment;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.DataProvider;

public class DataProviderForTest {

	@DataProvider(name = "ExcelData")
	public Object[][] dataProvider() throws BiffException, IOException {
		File file = new File("D:\\Charter\\Book1.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);

		int rows = sheet.getRows();
		int cols = sheet.getColumns();

		System.out.println("number of rows---> " + rows + "number of col---> " + cols);

		Object[][] a = new Object[rows][cols];

		// loop for rows
		for (int i = 0; i < rows; i++) {
			// loop for columns
			for (int j = 0; j < cols; j++) {
				Cell cell = sheet.getCell(j, i);
				a[i][j] = cell.getContents();
			}
		}
		return a;

	}
}
