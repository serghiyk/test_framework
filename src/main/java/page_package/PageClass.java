package page_package;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class PageClass {

    @Step
    public PageClass openGoogleUaPage() {
        Selenide.open("https://www.google.com.ua/");
        return this;
    }

    @Step
    public PageClass typeTextIntoSearchField(String text) {
        $("[class='gLFyf gsfi']").sendKeys(text);
        return this;
    }

    @Step
    public PageClass verifySuggestionsBlockDisplayed() {
        log.info("Info message -- hello");
        $(".aajZCb").shouldBe(Condition.visible);
        return this;
    }
}
