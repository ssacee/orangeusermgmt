package com.steps;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClassOHRM;

import io.cucumber.java.en.*;

public class Stepdefinition extends BaseClassOHRM{

	@Given("User launches Chrome browser")
	public void user_launches_chrome_browser() throws Throwable {
		getDriver("Chrome");
		getUrl("https://opensource-demo.orangehrmlive.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("chrome launched successfully");
	}

	@When("User enter valid <username> and <password>")
	public void user_enter_valid_username_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");	
	}

	@Then("User validate to login the orange HRM application")
	public void user_validate_to_login_the_orange_hrm_application() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Given("User mouseover admin tab and click")
	public void user_mouseover_admin_tab_and_click() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}

	@When("User mouse over to user management tab and click")
	public void user_mouse_over_to_user_management_tab_and_click() {
		driver.findElement(By.id("menu_admin_UserManagement")).click();
	}

	@Then("User validate to display the search button")
	public void user_validate_to_display_the_search_button() {
		System.out.println("Now user can see the search Elements ");
	}

	@Given("User Enter the Username value as {string}")
	public void user_enter_the_username_value_as(String string) {
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");
	}

	@Given("User selects the Userrole as ESS")
	public void user_selects_the_userrole_as_ess() {
		WebElement userrole = driver.findElement(By.id("searchSystemUser_userType"));
	    selectByvalue(userrole,"1");
	}

	@Given("User Enter the Employeename as {string}")
	public void user_enter_the_employeename_as(String string) {
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("paul");
	}

	@Given("User selects the status  as Enabled")
	public void user_selects_the_status_as_enabled() {
		WebElement status = driver.findElement(By.id("searchSystemUser_status"));
	    selectByvalue(status,"1");
	}

	@Then("User click to search and take screenshot")
	public void user_click_to_search_and_take_screenshot() {
		driver.findElement(By.id("searchBtn")).click();
		   screenShot();
	}

	@Given("User mouseover to username tab")
	public void user_mouseover_to_username_tab() {
	    driver.findElement(By.id("resetBtn")).click();
	}

	@Given("User click downarrow to display in ascending order")
	public void user_click_downarrow_to_display_in_ascending_order() {
		driver.findElement(By.xpath("//table[@id=\"resultTable\"]//th[2]//a")).click();
	}

	@Given("User click uparrow to display in descending order")
	public void user_click_uparrow_to_display_in_descending_order() {
		driver.findElement(By.xpath("//table[@id=\"resultTable\"]//th[2]//a")).click();
	}

	@Then("User validate and take screenshot")
	public void user_validate_and_take_screenshot() {
		//scrollUpDown(WebElement element);
		screenShot();
	}

	@Given("User mouseover to userrole tab")
	public void user_mouseover_to_userrole_tab() {
		System.out.println("user can display ascending and descending order based on userrole");
	}
	
	@Given("User click downarrow to display in ascending order based on userrole")
	public void user_click_downarrow_to_display_in_ascending_order_based_on_userrole() {
		driver.findElement(By.xpath("//table[@id=\"resultTable\"]//th[3]/a")).click();
	}

	@Given("User click uparrow to display in descending order based on userrole")
	public void user_click_uparrow_to_display_in_descending_order_based_on_userrole() {
		driver.findElement(By.xpath("//table[@id=\"resultTable\"]//th[3]/a")).click();
	}

	@Then("User validate and take screenshot based on userrole")
	public void user_validate_and_take_screenshot_based_on_userrole() {
		screenShot();
	}
	@Given("User mouseover to Employeename tab")
	public void user_mouseover_to_employeename_tab() {
		System.out.println("user can display ascending and descending order based on Employeename ");
	}

	@Given("User click downarrow to display in ascending order based on Employeename")
	public void user_click_downarrow_to_display_in_ascending_order_based_on_employeename() {
		driver.findElement(By.xpath("//table[@id=\"resultTable\"]//th[4]//a")).click();
	}
	
	@Given("User click uparrow to display in descending order based on Employeename")
	public void user_click_uparrow_to_display_in_descending_order_based_on_employeename() {
		driver.findElement(By.xpath("//table[@id=\"resultTable\"]//th[4]//a")).click();
	}

	@Then("User validate and take screenshot based on Employeename")
	public void user_validate_and_take_screenshot_based_on_employeename() {
		screenShot();
	}
	@Given("User mouseover to Status tab")
	public void user_mouseover_to_status_tab() {
		System.out.println("user can display ascending and descending order based on status ");
	}

	@Given("User click downarrow to display in ascending order based on Status")
	public void user_click_downarrow_to_display_in_ascending_order_based_on_status() {
		driver.findElement(By.xpath("//table[@id=\"resultTable\"]//th[5]//a")).click();
	}

	@Given("User click uparrow to display in descending order based on Status")
	public void user_click_uparrow_to_display_in_descending_order_based_on_status() {
		driver.findElement(By.xpath("//table[@id=\"resultTable\"]//th[5]//a")).click();
	}

	@Then("User validate and take screenshot based on Status")
	public void user_validate_and_take_screenshot_based_on_status() {
		screenShot();
	}

	@Given("User mouse over to System User")
	public void user_mouse_over_to_system_user() {
	    System.out.println("user clicks to hide search options");
	}

	@When("User clicks System user tab")
	public void user_clicks_system_user_tab() {
		driver.findElement(By.xpath("//a[@class=\"toggle tiptip\"]")).click();
	}

	@Then("User clicks validate to hide search tab and take screenshot")
	public void user_clicks_validate_to_hide_search_tab_and_take_screenshot() {
		screenShot();
	}
}
