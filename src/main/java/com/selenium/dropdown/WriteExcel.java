package com.selenium.dropdown;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteExcel {
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		File file = new File("D:\\Charter\\Book1.xls");
		WritableWorkbook workbook = Workbook.createWorkbook(file);
		WritableSheet sheet = workbook.createSheet("Sheet2", 1);
		Label label = new Label(0, 0, "mahima");
		sheet.addCell(label);
		workbook.write();
		workbook.close();
	}
}
