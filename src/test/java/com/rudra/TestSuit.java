package com.rudra;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    // HomePage class instantiation so that all the methods can be access by calling its name
    HomePage homePage = new HomePage();
    //RegisterPage class instantiation to access all the methods by calling its given name
    RegisterPage registerPage = new RegisterPage();
    //RegisterResultPage class instantiation to access all the methods by calling its given name
    RegisterResultPage registerResultPage = new RegisterResultPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
//    @Test
//    public void toVerifyNewUserRegistrationSuccessful(){
//
//    }

    //This test method calls all the methods to register new user successfully
    @Test (priority = 1)
    public void toVerifyRegisterButtonPresentInHomePageAndRegisteringNewUser(){
        //Calling toVerifyRegistrationButtonPresent from HomePage class by calling its instantiated name and execute its code
        homePage.toVerifyRegisterButtonPresent();
        //Calling toClickRegisterLinkButton from HomePage class by calling its instantiated name and execute the method
        homePage.toClickRegisterLinkButton();
        //Calling toFillTheRegistrationForm from HomePage class by calling its instantiated name and perform its action of that method
        registerPage.toFillTheRegistrationForm();
        //Calling toCheckConfirmationMessage from HomePage class by calling its instantiated name and perform its function
        registerResultPage.toCheckConfirmationMessage();
        //Calling toCheckRegistrationIsSuccessful from HomePage class by calling its instantiated name and perform its intended action to be
//        registerResultPage.toCheckRegistrationIsSuccessful();

    }

    @Test
    public void toVerifyEachProductHasName(){
        //Be in home page
        //Go to Electronics page
        electronicsPage.toClickOnElectronicsPage();
        //Under electronics page go to camera and photo
        cameraAndPhotoPage.toClickOnCameraPhotoPage();
        //Get all the products name from it
        cameraAndPhotoPage.toGetAllTheNamesOfProductsFromCameraAndPhotoPage();
    }
}
