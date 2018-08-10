package com.selenium.dropdown;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {
	public static void main(String[] args) throws BiffException, IOException {
		File file = new File("D:\\Charter\\Book1.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getRows();
		int cols = sheet.getColumns();

		System.out.println("Rows  --> " + rows);
		System.out.println("Cols  --> " + cols);

		System.out.println("--Rows and Cols data--");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				Cell cell = sheet.getCell(j, i);
				System.out.println(cell.getContents());

			}
		}
	}
}
