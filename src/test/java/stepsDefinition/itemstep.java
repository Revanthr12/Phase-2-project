package stepsDefinition;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.excel.*;

public class itemstep {
	
	mainpage mainpagetest = new mainpage();
	WebDriver driver = new ChromeDriver();
	
	@Given("I am on homepage of swiggy")
	public void i_am_on_homepage_of_swiggy() {
		System.out.println("I am on homepage of swiggy");
	}
	@When("I click search button")
	public void i_click_search_button() {
		System.out.println("I click on search button");
	}
	@Then("I see the list of product name with prices")
	public void i_see_the_list_of_product_name_with_prices() {
		System.out.println("I can see list of products with price");
	}
	@Given("I am on list of product name and price page")
	public void i_am_on_list_of_product_name_and_price_page() {
		System.out.println("I can see list of product name with price");
	}
	@When("I  find list of product name")
	public void i_find_list_of_product_name() {
		System.out.println("i can find list of product name");
		mainpagetest.home(driver);
		mainpagetest.loc(driver);
		mainpagetest.search(driver);
		mainpagetest.item(driver);
	}
	@Then("i can see list of product name on the console")
	public void i_can_see_list_of_product_name_on_the_console() {
		System.out.println("i can see list of product name on the console");
	}
	@When("I find list of product price")
	public void i_find_list_of_product_price() {
		mainpagetest.home(driver);
		mainpagetest.loc(driver);
		mainpagetest.search(driver);
		mainpagetest.price(driver);
	}
	@Then("i can see list of product price on the console")
	public void i_can_see_list_of_product_price_on_the_console() {
		System.out.println("i can see list of product price on the console");
	}
	@When("i click on add button on any of the given product")
	public void i_click_on_add_button_on_any_of_the_given_product() {
		System.out.println("i click on add button on any of the given product");
		mainpagetest.home(driver);
		mainpagetest.loc(driver);
		mainpagetest.search(driver);
		mainpagetest.addtocart(driver);
	}
	@Then("item will be added to cart")
	public void item_will_be_added_to_cart() {
		System.out.println("item will be added to cart");
	}
}
