package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Exercise3Page extends BasePage {
    public Exercise3Page(WebDriver driver) {
        super(driver);
    }

    public String AmberliteFiremistText = "Amberlite Firemist";

    public String trailSet = "s13:v8";

    public By dropdownList = By.id("s13");

    public By trailElements = By.id("trail");

    public By belugaBrown = By.xpath("//*[text()='Beluga Brown']");

    public By amberliteFiremistElement = By.xpath("//*[@id='s13']/option[9]");
}
