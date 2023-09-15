package examles;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JUnit5Examles {
    @Test
    void firstTest() {
        System.out.println("__________firstTest()");
}
    @Test
    void secondTest() {
        System.out.println("__________secondTest()");
    }
    @AfterAll
    static void tearDown(){

    }

}
