package com.rudra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CameraAndPhotoPage  extends Utils{

    private By _cameraPhotoPage = By.linkText("Camera & photo");


    public void toClickOnCameraPhotoPage(){
        clickOnElement(_cameraPhotoPage);
    }

    public void toGetAllTheNamesOfProductsFromCameraAndPhotoPage(){
        List<WebElement> productNameList = driver.findElements(By.xpath("//h2[@class='product-title']"));

        for (WebElement element: productNameList){
            System.out.println(element.getText());
        }
//        for (int i =0; i < productNameList.size(); i++){
//            System.out.println(productNameList.get(i).getText());
//        }

    }
}
