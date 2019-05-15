package com.acti.Helper;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.acti.Base.Driverscript;
    
public class Excelconfig extends Driverscript {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public Excelconfig()
	
	{
		
	try {
		File src = new File("./acti_testdata/Testdata.xlsx");
		fis=new FileInputStream(src);
		 wb = new XSSFWorkbook(fis);
	}
	catch (Exception e)
	{
		System.out.println("excel not found"+e.getMessage());
	}

	}
	 public int getrowcount(int sheetnum)
	    {
	    	int rowcount = wb.getSheetAt(sheetnum).getLastRowNum();
	    	rowcount=rowcount+1;
	    	return rowcount;
	    	
	       }
	    public String getdata(int sheetnum,int row,int col)
	    {
	    	 sheet = wb.getSheetAt(sheetnum);
	    	String data = sheet.getRow(row).getCell(col).getStringCellValue();
	    	return data;
	    }
	

}
