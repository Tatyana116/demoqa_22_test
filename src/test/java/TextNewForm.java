import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextNewForm {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1500x980";
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        $("#firstName").setValue("Tania");
        $("#lastName").setValue("Kozlova");
        $("#userEmail").setValue("Kozlova@mail.com");
        $(byText("Female")).click();
        $("#userNumber").setValue("9891335678");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-dropdown-container").$(byText("May")).click();
        $(".react-datepicker__year-select").selectOption("1989");
        $(".react-datepicker__day--019").click();
        $("#subjectsInput").setValue("Physics").pressEnter();
        $(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("photo.jpg");
        $("#currentAddress").setValue("Russia");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $(".modal-dialog").shouldHave(text("Thanks for submitting the form"));
        $(".modal-content").shouldHave(
                text("Tania Kozlova"),
                text("Kozlova@mail.com"),
                text("Female"),
                text("9891335678"),
                text("19 May,1989"),
                text("Physics"),
                text("photo.jpg"),
                text("Russia"),
                text("NCR Delhi")
        );
    }
}