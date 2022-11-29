package com.training.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	 static XSSFWorkbook ExcelWbook;
     static XSSFSheet ExcelWsheet;
     static XSSFRow Row;
     static XSSFCell Cell;
     
     public static Object[][] getTableArray(String filepath,String sheetName) throws IOException {
    	 String [][] tabArray=null;
    	 FileInputStream Excelfile=new  FileInputStream(filepath);
   	  ExcelWbook=new XSSFWorkbook(Excelfile);
   	  ExcelWsheet=ExcelWbook.getSheet(sheetName);
   	  int totalRows=ExcelWsheet.getLastRowNum();
   	  int totalCols=2;
   	  tabArray=new String[totalRows][totalCols];
   	 for(int i=1;i<=totalRows;i++) {
		  for (int j=1;j<=totalCols;j++) {
			tabArray[i][j]=getCellData(i,j);
			System.out.println(tabArray[i][j]+ " ");
    	 
    	 
    	
     }

}
   	return tabArray;
     }
     public static String getCellData(int RowNum,int ColNum) {
    	 Cell=ExcelWsheet.getRow(RowNum).getCell(ColNum);
    	 return null;
     }
}
