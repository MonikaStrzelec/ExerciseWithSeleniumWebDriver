package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends LinksToPages {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void openExercise1(){
        driver.get(Exercise1);
    }

    public void openExercise2(){
        driver.get(Exercise2);
    }

    public void openExercise3(){
        driver.get(Exercise3);
    }

    public void openExercise4(){
        driver.get(Exercise4);
    }

    //Click Method
    public void clickByElementBy(By elementBy){
        waitForElementVisibility(elementBy).click();
    }

    public WebElement waitForElementVisibility(By elementBy){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
        return element;
    }

    //Read Text
    public String readText(By elementBy){
        waitForElementVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public void writeText(By elementBy, String text){
        waitForElementVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

}