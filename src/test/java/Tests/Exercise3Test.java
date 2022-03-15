package Tests;

import Pages.Exercise3Page;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Exercise3Test extends BaseTest {

    @Test
    public void simpleTestForDropdownList() {
        Exercise3Page exercise3Page = new Exercise3Page(driver);
        exercise3Page.openExercise3();
        exercise3Page.clickByElementBy(exercise3Page.dropdownList);
        exercise3Page.clickByElementBy(exercise3Page.amberliteFiremistElement);
        Assertions.assertEquals(exercise3Page.readText(exercise3Page.trailElements), exercise3Page.trailSet);
    }

    @Test
    public void testForDropdownListWithSelectClass() {
        Exercise3Page exercise3Page = new Exercise3Page(driver);
        exercise3Page.openExercise3();

        Select make = new Select(driver.findElement(By.id("s13")));
        Assertions.assertEquals(9, make.getOptions().size());
        make.selectByVisibleText(exercise3Page.AmberliteFiremistText);
        Assertions.assertEquals(exercise3Page.readText(exercise3Page.trailElements), exercise3Page.trailSet);
    }
}