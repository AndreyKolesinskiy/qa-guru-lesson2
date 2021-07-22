package tests;

import pages.PracticeFormPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    protected PracticeFormPage practiceFormPage = new PracticeFormPage();

    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }
}
