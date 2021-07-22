package pages;

import com.codeborne.selenide.Selenide;

public class PracticeFormPage {

    public PracticeFormPage openPracticeFormPage(){
        Selenide.open("/automation-practice-form");
        return this;
    }
}
