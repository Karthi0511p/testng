package org.screenshort;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		
		
		
		File f=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Ngtest\\src\\test\\resources\\Book1.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(2);
		System.out.println(c);
		
		int rowcount = s.getPhysicalNumberOfRows();
		int celcount = r.getPhysicalNumberOfCells();
		
		for(int i=0;i<rowcount;i++) {
			
		}
		
	}
}
