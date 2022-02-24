package excelread2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode1 {
	 
	 XSSFSheet s1;
	 public ExcelCode1() throws IOException
	 {
		 FileInputStream f=new FileInputStream("C:\\Users\\user\\Desktop\\Book1.xlsx");
		 XSSFWorkbook w=new XSSFWorkbook(f);
		 s1=w.getSheet("Sheet1");
		 
	 }
	 public String excelRead(int i,int j)
	 {
		 Row r=s1.getRow(i);
		 Cell c=r.getCell(j);
		 int celltype=c.getCellType();
	switch(celltype)
		{
		case Cell.CELL_TYPE_NUMERIC:
		{
		int num=(int)c.getNumericCellValue();
		return String.valueOf(num);
		
			}
	case Cell.CELL_TYPE_STRING:
	{
		return c.getStringCellValue();
	}
	 }
		 
		return null;
		 
	 }


}
