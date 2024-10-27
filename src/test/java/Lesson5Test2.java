import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import pages.PageForBox;

class Lesson5Test2 {

    @Test
    void testDragAndDropUsingPageObject() {
        PageForBox page = new PageForBox();
        page.dragAndDrop();
        page.getColumnA().shouldHave(Condition.text("B"));
        page.getColumnB().shouldHave(Condition.text("A"));
    }
}
