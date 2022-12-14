package com.rudra;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {

    //Creating and storing all the locators given path in a variable which have a private access modifiers
    private By _selectGender = By.id("gender-male");
    private By _userName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dateOfBirth = By.name("DateOfBirthDay");
    private By _monthOfBirth = By.name("DateOfBirthMonth");
    private By _yearOfBirth = By.name("DateOfBirthYear");
    private By _emailAddress = By.id("Email");
    private By _companyName = By.name("Company");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");

    //This method performs all the action to be done by specific methods which is called from Utils class a parent class
    public void toFillTheRegistrationForm() {
        // Uniquely identify the element within the web page and perform click action
        clickOnElement(_selectGender);
        // It identifies the unique element by id and fill in LastName field with "Test"
        sendUserInput(_userName, LoadProp.getProperty("FirstName"));
        // It identifies the unique element by id and fill in FirstName field with "Tester"
        sendUserInput(_lastName, LoadProp.getProperty("LastName"));
        // Identifies the unique element by xPath and selects Date of birth Day by "23"
        selectListByValue(_dateOfBirth, LoadProp.getProperty("DoBDay"));
        // Identifies the unique element by xPath and selects Date of birth Month by "September"
        selectListByIndexValue(_monthOfBirth, 9);
        // Identifies the unique element by xPath and selects Date of birth Year by "1990"
        selectListByVisibleText(_yearOfBirth, "1990");
        // Identifies unique element by id and fill it with given user inputs - timeStamp is used in between so everytime we test it will be unique and accepts the data
        sendUserInput(_emailAddress, ("test123" + dateTimeStamp() + "@maven.com"));
        // Identifies unique element by name and fill in Company field with user data "ABC Company"
        sendUserInput(_companyName, "ABC Company");
        // Identifies the unique element by id and fill the Password field with "test12345"
        sendUserInput(_password, "test12345");
        // Identifies the unique element by id and fill the ConfirmPassword field with "test12345"
        sendUserInput(_confirmPassword, "test12345");
        // Identifies unique element by id and click the Register button
        clickOnElement(_registerButton);
    }
}
