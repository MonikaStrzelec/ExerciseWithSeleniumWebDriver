package Tests;

import Pages.Exercise4Page;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise4Test extends BaseTest {

    @Test
    public void testForRadioButtons() {
        Exercise4Page exercise4Page = new Exercise4Page(driver);
        exercise4Page.openExercise4();
        exercise4Page.clickByElementBy(exercise4Page.BelugaBrownRadioButton);
        exercise4Page.waitForElementVisibility(exercise4Page.BelugaBrownRadioButton);

        exercise4Page.clickByElementBy(exercise4Page.AmberliteFiremistRadioButton);
        exercise4Page.waitForElementVisibility(exercise4Page.AmberliteFiremistRadioButton);

        exercise4Page.clickByElementBy(exercise4Page.BelugaBrown2RadioButton);
        exercise4Page.waitForElementVisibility(exercise4Page.BelugaBrown2RadioButton);

        exercise4Page.clickByElementBy(exercise4Page.BelugaBrown3RadioButton);
        exercise4Page.waitForElementVisibility(exercise4Page.BelugaBrown3RadioButton);

        Assertions.assertEquals(exercise4Page.readText(exercise4Page.trailElements), exercise4Page.trailSet);
    }
}