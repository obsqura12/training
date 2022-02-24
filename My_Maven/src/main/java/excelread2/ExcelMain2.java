package excelread2;

import java.io.IOException;

public class ExcelMain2 {

	public static void main(String[] args) throws IOException {
		ExcelCode1 obj=new ExcelCode1();
		String c=obj.excelRead(0, 1);
		System.out.println(c);
		String d=obj.excelRead(0, 0);
		System.out.println(d);
		
	}

}
