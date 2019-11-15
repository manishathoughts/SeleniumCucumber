package stepDefinations;

import org.openqa.selenium.WebDriver;

import Cucumber.Automation.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{

	
	@Before("@MobileTest")
	public void beforevaldiation()
	{
		System.out.println("Before Mobile  hook");
	}
	
	@After("@MobileTest")
	public void Aftervaldiation()
	{
		System.out.println("  After Mobile before hook");
	}
		
		@Before("@WebTest")
		public void beforeWebvaldiation()
		{
			System.out.println("Before Web  hook");
		}
		
		@After("@WebTest")
		public void AfterWebvaldiation()
		{
			System.out.println("  After Web before hook");
		}
		
		
		@After("@Selenium-test")
		public void TearDown()
		{
			
			driver.close();
			
		}
		
		@After("@Selenium-test1")
		public void close()
		{
			
			driver.close();
			
		}
	}

