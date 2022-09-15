package Practices_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopups {

	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	//driver.get("https://the-internet.herokuapp.com/basic_auth");
	//Syntax
	//https://username:password@the-internet.herokuapp.com/basic_auth
	//https://admin:admin@the-internet.herokuapp.com/basic_auth      //passing username-admin,pwd-admin
	
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	}

}
