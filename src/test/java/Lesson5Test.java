import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

class Lesson5Test {

    @BeforeAll
    static void setup() {
        Configuration.browserSize = "1920x1080";
        open("https://github.com");
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void testEnterprisePage() {

        $$(".HeaderMenu-link").findBy(Condition.text("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(Condition.text("Enterprise")).click();
        $("#hero-section-brand-heading").shouldHave(Condition.text("The AI-powered"));


    }
}
