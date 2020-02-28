package com.selenium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.selenium.methods.PrimusBank;

public class DataDrivenTest 
{

	public static void main(String[] args) throws Exception
	{
		//Creating the branch with multiple set of Data
		
		PrimusBank app=new PrimusBank();
		
		app.appLaunch("Http://PrimusBank.qedgetech.com");
		app.appLogin("Admin", "Admin");
		
		//Reading multiple set of data from excel file
		
		File srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//XSSFSheet ws1=wb.getSheet("Testcases");
		
		
		
		//row count
		
		int rcnt=ws.getLastRowNum();
		
		
		for (int i = 1; i <=rcnt; i++)
		{
			String branchName=ws.getRow(i).getCell(0).getStringCellValue();
			
			String add1=ws.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(i+": set of data"+branchName+"   "+add1);
			
			String results=app.branchCreation(branchName, add1);
			
			System.out.println(i+": set of data results  "+branchName+"   "+add1+" "+results);
			
			ws.getRow(i).createCell(2).setCellValue(results);
			
			FileOutputStream fos=new FileOutputStream(srcFile);
			
			wb.write(fos);
			
		}
		
		wb.close();
		
		app.appLogout();
		
		app.appClose();

	}

}
