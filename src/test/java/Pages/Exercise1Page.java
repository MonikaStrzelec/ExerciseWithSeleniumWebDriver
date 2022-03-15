package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Exercise1Page extends BasePage {
    public Exercise1Page(WebDriver driver) {
        super(driver);
    }

    public String trailText = "b2b2b1";

    public By buttonB1 = By.id("btnButton1");

    public By buttonB2 = By.id("btnButton2");

    public By trailElements = By.id("trail");


    public String createTextForTrail(By... elementBy) {
        String text;
        String text2 = "";
        for (int i = 0; i < elementBy.length; i++) {
            if (elementBy[i] == buttonB1) {
                text = "b1";
            } else {
                text = "b2";
            }
            text2 = text2 + text;
        }
        return text2;
    }
}
