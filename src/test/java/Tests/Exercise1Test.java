package Tests;

import Pages.Exercise1Page;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Exercise1Test extends BaseTest {

    @Test
    public void simpleTestForThreeButton() {
        Exercise1Page exercise1Page = new Exercise1Page(driver);
        exercise1Page.openExercise1();
        exercise1Page.clickByElementBy(exercise1Page.buttonB2);
        exercise1Page.clickByElementBy(exercise1Page.buttonB2);
        exercise1Page.clickByElementBy(exercise1Page.buttonB1);
        Assertions.assertEquals(exercise1Page.readText(exercise1Page.trailElements), exercise1Page.trailText);
    }

    @Test
    public void testButtonForAnyNumberOfClickAndButtonConfiguration() {
        Exercise1Page exercise1Page = new Exercise1Page(driver);
        exercise1Page.openExercise1();
        exercise1Page.clickByElementBy(exercise1Page.buttonB2);
        exercise1Page.clickByElementBy(exercise1Page.buttonB2);
        exercise1Page.clickByElementBy(exercise1Page.buttonB1);
        Assertions.assertEquals(exercise1Page.readText(exercise1Page.trailElements), exercise1Page.createTextForTrail(exercise1Page.buttonB2, exercise1Page.buttonB2, exercise1Page.buttonB1));
    }
}
