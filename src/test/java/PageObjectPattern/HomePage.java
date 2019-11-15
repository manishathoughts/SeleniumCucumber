package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	By searchItem=By.xpath("//input[@type='search']");
	
	By verifyCucumber=By.cssSelector("h4.product-name");
	
	By incrementItem=By.cssSelector("a.increment");
	
	By addToCart=By.xpath("//div[@class='product-action']/button");
	
	By clickOnBag=By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");
	
	public HomePage(WebDriver driver) {
		
	this.driver=driver;
	
	}


	public WebElement searchItem()
	{
		return driver.findElement(searchItem);
	}
	

	public WebElement verifyCucumber()
	{
		return driver.findElement(verifyCucumber);
	}
	
	public WebElement incrementItem()
	{
		return driver.findElement(incrementItem);
	}
	
	public WebElement addToCart()
	{
		return driver.findElement(addToCart);
	}
	
	public WebElement clickOnBag()
	{
		return driver.findElement(clickOnBag);
	}

}
