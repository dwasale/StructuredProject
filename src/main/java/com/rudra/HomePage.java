package com.rudra;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils {

    //Assigning a variable for By type to store locator path
    private By _registerLink = By.className("ico-register");

    //This method verify the register link button is present or not with the name Register
    public void toVerifyRegisterButtonPresent(){
//        Assert.assertEquals(getText(_registerButton),"Register", "Expected result is not equal as Actual result");
        Assert.assertEquals(getText(_registerLink), "Register", "Expected result is not as Actual result"); // Assertion class checks and compare the actual and expected result as given
    }

    //Method to click on the given element
    public void toClickRegisterLinkButton(){
        waitElementToBeClickable(_registerLink,200);
        clickOnElement(_registerLink);
    }

}
