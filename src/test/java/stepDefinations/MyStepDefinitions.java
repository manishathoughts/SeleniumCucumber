package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Cucumber.Automation.*;
import PageObjectPattern.CartPage;
import PageObjectPattern.HomePage;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	 HomePage page;
	
	CartPage cp;

    @Given("^User is on Greenkart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
    	
    	driver=Base.getdriver();
        
    }

	/*
	 * @When("^search for the \"([^\"]*)\" item$") public void
	 * search_for_the_something_item(String strArg1) throws Throwable { page= new
	 * HomePage(driver); page.searchItem().sendKeys(strArg1); Thread.sleep(3000);
	 * 
	 * }
	 */
    
    @When("^search for the (.+) item$")
    public void search_for_the_item(String name) throws Throwable {
    	page= new HomePage(driver);
        page.searchItem().sendKeys(name);
        Thread.sleep(3000);
    }


    @Then("^\"([^\"]*)\" is populated$")
    public void something_is_populated(String strArg1) throws Throwable {
    	Assert.assertTrue(page.verifyCucumber().getText().contains(strArg1));
 
        
    }
    
    

    @When("^adding items to the cart$")
    public void adding_items_to_the_cart() throws Throwable {
        page.incrementItem().click();
        Thread.sleep(3000);
        page.addToCart().click();//add to cart click
        Thread.sleep(5000);
        page.clickOnBag().click();//click on bag
        Thread.sleep(5000);
    }

   

	/*
	 * @Then("^verify \"([^\"]*)\" is populated$") public void
	 * verify_is_populated(String arg1) throws Throwable { cp=new CartPage(driver);
	 * Assert.assertTrue( cp.verifyBrinjal().getText().contains(arg1));
	 * 
	 * }
	 */
    
    @Then("^verify (.+) is populated$")
    public void verify_is_populated(String name) throws Throwable {
    	cp=new CartPage(driver);
        Assert.assertTrue( cp.verifyBrinjal().getText().contains(name));
    }

    
}