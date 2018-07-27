  package com.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewTest6 {
	@Test
	public void test() {
	 File file=new File("Book1.xlsx");
	try {
		InputStream is = new FileInputStream(file);
		XSSFWorkbook xssf=new XSSFWorkbook(is);
		XSSFSheet sheet1=xssf.getSheet("Sheet1");
		System.out.println("First Row Number"+sheet1.getFirstRowNum());
		System.out.println("Last Row Number"+sheet1.getLastRowNum());
		for(int i=1;i<=sheet1.getLastRowNum();i++)
		{
			System.out.println(sheet1.getRow(i).getCell(0).getStringCellValue()+"\t\t"
		+sheet1.getRow(i).getCell(0).getStringCellValue());
			
			Assert.assertEquals(sheet1.getRow(i).getPhysicalNumberOfCells(),2);
			
		}
		
			
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) { 
	e.printStackTrace();
}
	
}
}
