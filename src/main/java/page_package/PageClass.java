package page_package;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;


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

        $(".aajZCb").shouldBe(Condition.visible);
        return this;
    }
}
