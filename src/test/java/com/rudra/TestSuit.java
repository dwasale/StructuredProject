package com.rudra;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    // HomePage class instantiation so that all the methods can be access by calling its name
    HomePage homePage = new HomePage();
    //RegisterPage class instantiation to access all the methods by calling its given name
    RegisterPage registerPage = new RegisterPage();
    //RegisterResultPage class instantiation to access all the methods by calling its given name
    RegisterResultPage registerResultPage = new RegisterResultPage();

//    @Test
//    public void toVerifyNewUserRegistrationSuccessful(){
//
//    }

    //This test method calls all the methods to register new user successfully
    @Test
    public void toVerifyRegisterButtonPresentInHomePageAndRegisteringNewUser(){
        homePage.toVerifyRegisterButtonPresent();   //Calling toVerifyRegistrationButtonPresent from HomePage class by calling its instantiated name and execute its code
        homePage.toClickRegisterLinkButton();   //Calling toClickRegisterLinkButton from HomePage class by calling its instantiated name and execute the method
        registerPage.toFillTheRegistrationForm();   //Calling toFillTheRegistrationForm from HomePage class by calling its instantiated name and perform its action of that method
        registerResultPage.toCheckConfirmationMessage();    //Calling toCheckConfirmationMessage from HomePage class by calling its instantiated name and perform its function
//        registerResultPage.toCheckRegistrationIsSuccessful();   //Calling toCheckRegistrationIsSuccessful from HomePage class by calling its instantiated name and perform its intended action to be

    }

//    @Test
//    public void toClickOnRegisterLinkButton(){
//        homePage.toClickRegisterLinkButton();
//    }
}
