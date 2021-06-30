package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputer extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputer.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement actualTextBuildYourOwnComputer;

    @FindBy(xpath = "//dd[@id='product_attribute_input_1']//select[@id='product_attribute_1']" )
    WebElement select22GHzIntelPentiumDualCoreE2200;

    @FindBy(xpath = "//dd[@id='product_attribute_input_2']//select[@id='product_attribute_2']")
    WebElement select8GB;

    @FindBy(xpath = "//ul[@class='option-list']/li[@data-attr-value='7']/input[@id='product_attribute_3_7']" )
    WebElement select400GB;

    @FindBy(xpath = "//li[@data-attr-value='9']/input[@id='product_attribute_4_9']" )
    WebElement selectVistaPremium;

    @FindBy(xpath = "//li[@data-attr-value='12']//input[@id='product_attribute_5_12']")
    WebElement selectTotalCommander;

    @FindBy(xpath = "//div[@class='product-price']/span[@id='price-value-1']")
    WebElement totalPriceValue;

    @FindBy(xpath = "//div[@class='add-to-cart-panel']/button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productHasBeenAdded;

    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeGreenBar;

    public String verifyTextBuildYourOwnComputer(){
        log.info("Getting text from : "+ actualTextBuildYourOwnComputer.toString());
        return getTextFromElement(actualTextBuildYourOwnComputer);

    }

    public void selectProcessor(String value){
        selectByValueFromDropDown(select22GHzIntelPentiumDualCoreE2200,value);
        log.info("Enter the value "+value+" To Select The Processor "+ select22GHzIntelPentiumDualCoreE2200.toString());
    }

    public void selectRam(String value){
        selectByValueFromDropDown(  select8GB,value);
        log.info("Enter the value "+ value + "To select the Ram "+ select8GB.toString());
    }

    public void selectHDD(){
        clickOnElement(select400GB);
        log.info("Click on size of HDD "+ select400GB);
    }

    public void selectOS(){
        clickOnElement(selectVistaPremium);
        log.info("Click on OS : "+ selectVistaPremium.toString());
    }

    public void selectSoftware(){
        clickOnElement(selectTotalCommander);
        log.info("Select on Software : "+ selectTotalCommander.toString());
    }

    public String actualPriceValue() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Getting Text from :" + totalPriceValue.toString());
        return getTextFromElement(totalPriceValue);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
        log.info("Click on Add to Cart Button : " + addToCartButton.toString());

    }

    public String actualGreenBarText() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Getting message on Green pop Bar :" + productHasBeenAdded.toString());
        return getTextFromElement(productHasBeenAdded);
    }

    public void clickOnCrossOfGreenBar(){
        clickOnElement(closeGreenBar);
        log.info("Click on Green bar " + closeGreenBar.toString());
    }


}
