package com.rudra;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepsDefinition {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Given("I am at register page")
    public void i_am_at_register_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.toClickRegisterLinkButton();
        homePage.toVerifyRegisterButtonPresent();
    }
    @When("I should be able to input valid data")
    public void i_should_be_able_to_input_valid_data() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.toFillTheRegistrationForm();
    }
    @Then("I should be able to register successfully")
    public void i_should_be_able_to_register_successfully() {
        // Write code here that turns the phrase above into concrete actions
        registerResultPage.toCheckConfirmationMessage();
    }

    @When("I click on {string} link button")
    public void i_click_on_link_button(String category_name) {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnCategoryPage(category_name);
    }
    @Then("I should be able to navigate {string} page successfully")
    public void i_should_be_able_to_navigate_page_successfully(String category_link) {
        // Write code here that turns the phrase above into concrete actions
        homePage.assertCurrentUrl(category_link);
    }
}
