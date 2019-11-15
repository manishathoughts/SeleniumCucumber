package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	
	public WebDriver driver;

	By addToCart=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	By verifyBrinjal=By.cssSelector("p.product-name");
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement addToCart()
	{
		return driver.findElement(addToCart);
	}
	
	
	public WebElement verifyBrinjal()
	{
		return driver.findElement(verifyBrinjal);
	}
}
