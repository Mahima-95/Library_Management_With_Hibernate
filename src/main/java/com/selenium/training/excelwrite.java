package com.selenium.training;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.annotations.Test;

public class excelwrite {
	
	@Test
	public void m() throws IOException, RowsExceededException, WriteException
	{
		File f = new File("C:\\Users\\utomar\\Desktop\\umendra1.xls");
        WritableWorkbook wk = Workbook .createWorkbook(f);
        WritableSheet ws = wk.createSheet("Sheet1", 0);
        
        Label l1 = new Label(0, 0, "umendra");
        ws.addCell(l1);
        
        Label l2 = new Label(1, 0, "tomar");
        ws.addCell(l2);
        
        wk.write();
        wk.close();
    
		
	}

}
