import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.*;

class Lesson5Test2 {

    @BeforeAll
    static void setup() {
        Configuration.browserSize = "1920x1080";
        open("https://the-internet.herokuapp.com/drag_and_drop");
    }

    @Test
    void testDragAndDropUsingActions() {

        var A = $("#column-a");
        var B = $("#column-b");

        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.dragAndDrop(A, B).perform();

        A.shouldHave(Condition.text("B"));
        B.shouldHave(Condition.text("A"));
    }
}
