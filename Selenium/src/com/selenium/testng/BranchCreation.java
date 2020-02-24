package com.selenium.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BranchCreation extends PrimusBank
{

	@Test(dataProvider="getData")
	public void branchCreation(String branchName,String add1) throws Exception
	{
		
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BtnNewBR")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtbName")).sendKeys(branchName);
		
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		
		driver.findElement(By.id("txtZip")).sendKeys("55555");
		
		Thread.sleep(2000);
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		
		country.selectByIndex(1);
		
		
		Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		
		state.selectByIndex(1);
		
		
		Thread.sleep(2000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		
		city.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(2000);
		//validation
		
		Alert al=driver.switchTo().alert();
		
		
		al.accept();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();

	}

	@DataProvider
	
	public Object[][] getData()
	{
		Object [][] data=new Object[2][2];
		
		data[0][0]="Qedge1";
		data[0][1]="ameerpet";
		data[1][0]="Qedge2";
		data[1][1]="ameerpet";
		return data;
	}
}
