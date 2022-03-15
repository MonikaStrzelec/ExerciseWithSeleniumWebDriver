package Tests;

import Pages.Exercise2Page;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise2Test extends BaseTest {

    @Test
    public void testForEditbox() {
        Exercise2Page exercise2Page = new Exercise2Page(driver);
        exercise2Page.openExercise2();
        exercise2Page.clickByElementBy(exercise2Page.t14editbox);
        driver.findElement(exercise2Page.t14editbox).clear();
        exercise2Page.writeText(exercise2Page.t14editbox, exercise2Page.text);
        exercise2Page.clickByElementBy(exercise2Page.buttonB1);
        Assertions.assertEquals(exercise2Page.readText(exercise2Page.trailElements), exercise2Page.TrailSetText);
    }
}
