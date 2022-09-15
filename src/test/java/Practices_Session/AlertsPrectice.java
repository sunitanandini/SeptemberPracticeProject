package Practices_Session;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPrectice 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try
		{
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Alert Window with Ok Button
		driver.findElement(By.xpath("//button[@onclick = 'jsAlert()']")).click();
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);		
		//Alert window ok and cancel button 
		driver.findElement(By.xpath("//button[@onclick = 'jsConfirm()']")).click();
		Thread.sleep(2000);
        driver.switchTo().alert().accept(); //Click OK
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick = 'jsConfirm()']")).click();
		Thread.sleep(2000);
        driver.switchTo().alert().dismiss();  //Click on cancel
        Thread.sleep(1000);
        
        //Alert window input Box, Capture text from  and Ok button
        driver.findElement(By.xpath("//button[@onclick = 'jsPrompt()']")).click();
        Alert alert =  driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println("Alert Msg:-->  " + alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("Sunita");
        Thread.sleep(2000);
        alert.accept();
        		
		Thread.sleep(2000);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		
		driver.close();
		driver.quit();
		
	}

}
