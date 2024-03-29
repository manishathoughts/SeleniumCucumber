package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

import Cucumber.Automation.Base;
import PageObjectPattern.CartPage;

@RunWith(Cucumber.class)
public class stepDefination extends Base {
	
	CartPage cp;

  @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    //code to navigate to login url
    	System.out.println("navigated to login url");
    	
    }
  @Given("^validate the browser$")
  public void validate_the_browser() throws Throwable {
	  System.out.println("deciding the browser to open");
  }
  
  @When("^performs proceed to checkout for purchase$")
  public void performs_proceed_to_checkout_for_purchase() throws Throwable {
	  cp=new CartPage(driver) ;
      cp.addToCart().click();
      Thread.sleep(5000);
     
  }

  @When("^Browser is triggered$")
  public void browser_is_triggered() throws Throwable {
	  System.out.println("Browser is triggered");
  }

  @Then("^check if browser is started$")
  public void check_if_browser_is_started() throws Throwable {
	  System.out.println("Browser is started");
  }
    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
      //code to login
    	System.out.println("Logged in success");
    }

   @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
      //home page validation
    	System.out.println("Validated home page");
    }
    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String arg1, String arg2) throws Throwable {
    	 System.out.println(arg1);
    	 System.out.println(arg2);
    	 
    	
    	 
    }


    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
    }

    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
       List<List<String>>  obj=data.raw();
      System.out.println(obj.get(0).get(0));
      System.out.println(obj.get(0).get(1));
      System.out.println(obj.get(0).get(2));
      System.out.println(obj.get(0).get(3));
      System.out.println(obj.get(0).get(4));
      
      
                                                
    	
    }
    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
       System.out.println(username);
       System.out.println(password);
       
    }
}