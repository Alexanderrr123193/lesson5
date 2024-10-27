package pages;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.interactions.Actions;
import static com.codeborne.selenide.Selenide.*;

public class PageForBox {
     SelenideElement columnA = $("#column-a");
     SelenideElement columnB = $("#column-b");

    public PageForBox() {
        Configuration.browserSize = "1920x1080";
        open("https://the-internet.herokuapp.com/drag_and_drop");
    }

    public void dragAndDrop() {
        Actions actions = new Actions(WebDriverRunner.getWebDriver());
        actions.dragAndDrop(columnA, columnB).perform();
    }

    public SelenideElement getColumnA() {
        return columnA;
    }

    public SelenideElement getColumnB() {
        return columnB;
    }
}
