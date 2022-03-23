package com.breakoutedu.pages;

import com.breakoutedu.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import static com.breakoutedu.utility.ConfigReader.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class StudentPlayGamePage {


    public StudentPlayGamePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='locks']")
    public List<WebElement> locksList;

    @FindBy(xpath = "//img[contains (@src, 'keyboard')]")
    public WebElement keyboardImg;

    @FindBy(xpath = "//img[contains (@src, 'endscreens')]")
    public WebElement imageYouBrokeOut;


    public void enterGameClueCombination(String combination){
        for (int i = 0; i < combination.length(); i++) {
            Driver.getDriver().findElement(By.xpath("//div[@class='select__lock__box__inr']/h2[text()="+combination.charAt(i)+"]")).click();
        }
    }






}