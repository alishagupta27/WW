package com.WW;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class Question2 {
	WebDriver driver;
	
	@Parameters({"URL"})
	@BeforeSuite
	public void fetchURL(String URL){
		//Path path = FileSystems.getDefault().getPath("src/test/resources/chromedriver.exe");
		Path path = FileSystems.getDefault().getPath("src/test/resources/chromedriver");
		System.setProperty("webdriver.chrome.driver",path.toString());
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	public void testFirstTitle(){
		Assert.assertEquals(driver.getTitle().equals("WW (Weight Watchers): Weight Loss & Wellness Help"),true);
	}
	
	@Test (priority=2)
	public void checkSecondPage(){
		driver.findElement(By.className("find-a-meeting")).click();
		Assert.assertEquals(driver.getTitle().equals("Find a Studio & Meeting Near You | WW USA"),true);
	}
	
	@Test (priority=3)
	public void fetchValues(){
		driver.findElement(By.id("meetingSearch")).sendKeys("10011");
		driver.findElement(By.xpath("//*[@id='content']/div/div/ui-view/ui-view/div/div/div/div/div[2]/div[1]/div/form/div[1]/span/button")).click();
		WebElement name=driver.findElement(By.xpath("//*[@id='ml-1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[1]/span"));
		WebElement dist=driver.findElement(By.xpath("//*[@id='ml-1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[2]"));
		System.out.println(name.getText());
		System.out.println(dist.getText());
	}
	
	@Parameters({"stxt"})
	@Test (priority=4)
	public void getScheduleSummary(String stxt){
		driver.findElement(By.xpath("//*[@id='ml-1180210']/result-location/div")).click();
		List<WebElement> a=driver.findElements(By.className("schedule-detailed-day-label"));
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for (int i=0;i<a.size();i++)
			if (a.get(i).getText().equals(stxt)){
				List<WebElement> l=driver.findElements(By.xpath(".//div[contains(text(),'"+stxt+"') and @class='schedule-detailed-day-label']/following-sibling::div/*/div[@class='schedule-detailed-day-meetings-item-leader']"));
				for(int j=0;j<l.size();j++){
					String str=l.get(j).getText();
					if (map.containsKey(str))						
						map.put(str, (map.get(str)+1));
					else
						map.put(str, 1);						
				}		
			}
		System.out.println(map);
	}
	
	@AfterSuite
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(500);
		driver.close();
	}
}


