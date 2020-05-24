package test_package;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;
import page_package.PageClass;

@Log4j2
public class TestClass {

    @Test
    void openGoogle() {
        log.warn("Suggestion displayed");
        new PageClass().openGoogleUaPage()
                .typeTextIntoSearchField("Hello")
                .verifySuggestionsBlockDisplayed();
    }
}
