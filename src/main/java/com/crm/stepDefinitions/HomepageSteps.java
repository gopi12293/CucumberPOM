package com.crm.stepDefinitions;

import com.crm.base.Base;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.util.Util;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomepageSteps extends Base{

	LoginPage loginPage;
	HomePage homePage;
	Util util;
	public HomepageSteps() {
		super();
	}
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	    
	    Base.initialization();
	}

	@When("^user is on required loginpage$")
	public void user_is_on_required_loginpage() throws Throwable {
	    loginPage = new LoginPage();
		String title = loginPage.validateLoginpageTitle();
	    Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}

	@Then("^user logs in$")
	public void user_logs_in() throws Throwable {
	   homePage =  loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
	    
	}


	@Then("^validate title of home page$")
	public void validate_title_of_home_page() throws Throwable {
		 String homepageTitle = homePage.homepageTitle();
		    Assert.assertEquals("CRMPRO", homepageTitle);
	}

	@Then("^validate logged in user$")
	public void validate_logged_in_user() throws Throwable {
		util = new Util();
		util.switchToFrame();
	    boolean temp = homePage.loggedinUserName();
	    Assert.assertTrue(temp);
	}

}
