package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    @FindBy(id = "products-orderby" )
    WebElement sortByFilterLink;

    @FindBys({@FindBy(xpath = "//div[@class='product-grid']//h2")})
    List<WebElement> sortFilterByZToA;

    @FindBy(xpath = "//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']")
    WebElement addToCartButton;

    public void sortFilterZtoA(String value) {
        selectByValueFromDropDown(sortByFilterLink, value);
        log.info("Enter the Value :" + value + "to Select Z To A Filter "+sortByFilterLink.toString());

    }

    public List<String> verifyProductSortedByZToAFilter() throws InterruptedException {


        List<String> productNameList = new ArrayList<>();
        Thread.sleep(2000);
        for (WebElement name : sortFilterByZToA) {
            Thread.sleep(1000);
            productNameList.add(name.getText());
        }
        return productNameList;
    }

    public void sortFilterAtoZ(String value){
        log.info("Enter the value "+ value+ "to select filter A To Z"+ sortByFilterLink.toString());
        selectByValueFromDropDown(sortByFilterLink,value);

    }

    public void clickOnAddToCartOnBuildYourOwnComputer() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Click on Add to Cart Button "+ addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

}
