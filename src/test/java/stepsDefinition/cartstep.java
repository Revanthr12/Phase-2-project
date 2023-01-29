package stepsDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.excel.*;

public class cartstep {
	
	mainpage mainpagetest =new mainpage();
	WebDriver driver = new ChromeDriver();

	@Given("I am on swiggy website")
	public void i_am_on_swiggy_website() {
		mainpagetest.home(driver);
		System.out.println("I am on swiggy_website");
	}
	@When("I click cart option and delete items from the cart")
	public void i_click_cart_option_and_delete_items_from_the_cart() {
		System.out.println("i can click cart option and delete from cart");
		mainpagetest.home(driver);
		mainpagetest.loc(driver);
		mainpagetest.search(driver);
		mainpagetest.addtocart(driver);
		mainpagetest.update(driver);
	}
	@Then("I able to delete the  items from cart")
	public void i_able_to_delete_the_items_from_cart() {
		System.out.println("I can delete from cart");
	}
	@Given("I am on of swiggy website")
	public void i_am_on_of_swiggy_website() {
//		mainpagetest.home(driver);
		System.out.println("I am on swiggy_website");		
	}
	@When("I click cart option and update items from the cart")
	public void i_click_cart_option_and_update_items_from_the_cart() {
		System.out.println("I can update cart");
		mainpagetest.home(driver);
		mainpagetest.loc(driver);
		mainpagetest.search(driver);
		mainpagetest.addtocart(driver);
		mainpagetest.update(driver);
	}
	@Then("I able to update the  items from cart")
	public void i_able_to_update_the_items_from_cart() {
		System.out.println("I can update from cart");  
	}
}
