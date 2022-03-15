package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Exercise2Page extends BasePage{

    public Exercise2Page(WebDriver driver) {
        super(driver);
    }

    public String text = "People either.";

    public String TrailSetText = "t14:People either.b1";

    public By buttonB1 = By.id("btnButton1");

    public By t14editbox = By.id("t14");

    public By trailElements = By.id("trail");
}
