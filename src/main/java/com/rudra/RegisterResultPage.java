package com.rudra;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {

    // Declaring By variable and storing the path of unique locator as private
    private By _resultMessage = By.className("result");

//    public void toCheckRegistrationIsSuccessful(){
//        waitForUrlToBe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", 200);
//    }

    // This method will compare the expected and actual result after successful registration
    public void toCheckConfirmationMessage() {
        Assert.assertEquals(getText(_resultMessage), "Your registration completed", "Expected and Actual result didn't match");
    }
}
