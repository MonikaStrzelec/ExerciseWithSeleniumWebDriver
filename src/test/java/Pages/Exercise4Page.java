package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Exercise4Page extends BasePage {
    public Exercise4Page(WebDriver driver) {
        super(driver);
    }

    public By AmberliteFiremistRadioButton = By.xpath("//input[@value='v81']");

    public By BelugaBrown2RadioButton = By.xpath("//input[@value='v02']");

    public By BelugaBrown3RadioButton = By.xpath("//input[@value='v03']");

    public String trailSet = "[0, 8, 0, 0]";

    public By trailElements = By.id("trail");

    public By BelugaBrownRadioButton = By.xpath("//input[@value='v00']");
}
