package com.rudra;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{

    private By _electronicsPage = By.linkText("Electronics");

    public void toClickOnElectronicsPage(){
        clickOnElement(_electronicsPage);
    }
}
