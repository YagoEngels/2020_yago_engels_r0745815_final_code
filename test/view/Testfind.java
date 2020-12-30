package view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Testfind {
    private WebDriver driver;
    String url = "http://localhost:8080/web2_website_week8_v3_war_exploded/";

    @Before
    public void setUp() throws Exception {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\...\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yagoe\\Documents\\school\\JAAR 3 SEMESTER 1\\WEB 2\\LIBRARIES\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url + "find.html");
    }

    @After
    public void clean() {
        driver.quit();
    }

    //test1 om te checken
    @Test
    public void test1() {
        assertEquals("find", driver.getTitle());
    }

}
