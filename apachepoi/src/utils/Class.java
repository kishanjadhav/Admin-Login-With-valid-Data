package utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.className("G43f7e"));
		List<WebElement> list=ele.findElements(By.tagName("li"));
		
		System.out.println(list.size());
		
		for(int i=1; i<list.size(); i++)
		{
			if(list.get(i).getText().toLowerCase().contains("download"))
			{
				list.get(i).click();
				break;
			}
		}
	}

}
