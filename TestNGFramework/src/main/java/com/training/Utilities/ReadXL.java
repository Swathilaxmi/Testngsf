package com.training.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL {
      static XSSFWorkbook ExcelWbook;
      static XSSFSheet ExcelWsheet;
      static XSSFRow Row;
      static XSSFCell Cell;
      
      public static void main(String[] args) throws IOException   {
    	  String Filepath="C:\\Users\\16692\\Downloads\\TestData.xlsx";
    	  FileInputStream Excelfile=new  FileInputStream(Filepath);
    	  ExcelWbook=new XSSFWorkbook(Excelfile);
    	 ExcelWsheet= ExcelWbook.getSheet("Login");
    	  int totalRows=ExcelWsheet.getLastRowNum();
    	  System.out.print(totalRows);
    	  int totalCols=2;
    	  for(int i=1;i<=totalRows;i++) {
    		  for (int j=1;j<=totalCols;j++) {
    			Cell=ExcelWsheet.getRow(i).getCell(j);  
    		  System.out.print(Cell);
    		  }
    		  System.out.print(" \n");
    	   		  
    		  }
    	  }
    	  
      }
	

