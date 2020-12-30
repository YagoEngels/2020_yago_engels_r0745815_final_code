package view;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestAddPlayer {
    private WebDriver driver;
    String url = "http://localhost:8080/web2_website_week8_v3_war_exploded/";

    @Before
    public void setUp() throws Exception {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\...\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yagoe\\Documents\\school\\JAAR 3 SEMESTER 1\\WEB 2\\LIBRARIES\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url + "add.jsp");
    }

    @After
    public void clean() {
        driver.quit();
    }

    @Test
    public void test1() {
        WebElement naamInput = driver.findElement(By.id("naam"));
        naamInput.clear();
        naamInput.sendKeys("scott");

        WebElement soortInput = driver.findElement(By.id("nationaliteit"));
        soortInput.clear();
        soortInput.sendKeys("schott");

        WebElement voedselInput = driver.findElement(By.id("team"));
        voedselInput.clear();
        voedselInput.sendKeys("fnatic");

        driver.findElement(By.id("submit")).click();

        assertEquals("player database", driver.getTitle());

        ArrayList<WebElement> lis = (ArrayList<WebElement>) driver.findElements(By.tagName("td"));

        assertEquals("scott" , lis.get(lis.size()-4 ).getText().toString());
    }

    @Test
    public void test2() {
        WebElement naamInput = driver.findElement(By.id("naam"));
        naamInput.clear();
        naamInput.sendKeys(" ");

        WebElement soortInput = driver.findElement(By.id("nationaliteit"));
        soortInput.clear();
        soortInput.sendKeys("schott");

        WebElement voedselInput = driver.findElement(By.id("team"));
        voedselInput.clear();
        voedselInput.sendKeys("fnatic");

        driver.findElement(By.id("submit")).click();

        assertEquals("speler toevoegen", driver.getTitle());
    }

    @Test
    public void test3() {
        WebElement naamInput = driver.findElement(By.id("naam"));
        naamInput.clear();
        naamInput.sendKeys("scott");

        WebElement soortInput = driver.findElement(By.id("nationaliteit"));
        soortInput.clear();
        soortInput.sendKeys("");

        WebElement voedselInput = driver.findElement(By.id("team"));
        voedselInput.clear();
        voedselInput.sendKeys("fnatic");

        driver.findElement(By.id("submit")).click();

        assertEquals("speler toevoegen", driver.getTitle());
    }

    //test4
    @Test
    public void test4() {
        WebElement naamInput = driver.findElement(By.id("naam"));
        naamInput.clear();
        naamInput.sendKeys("scott");

        WebElement soortInput = driver.findElement(By.id("nationaliteit"));
        soortInput.clear();
        soortInput.sendKeys("schottt");

        WebElement voedselInput = driver.findElement(By.id("team"));
        voedselInput.clear();
        voedselInput.sendKeys("");

        driver.findElement(By.id("submit")).click();

        assertEquals("speler toevoegen", driver.getTitle());
    }

    //test 5 werkt alleen de eerste keer na het opstarten van de webserver
    //vanwege het feit dat je de pagina kan sluiten maar de webcontainer blijft wel draaien
    //en de info staat op de webcontainer geschreven
    @Test
    public void test5() {
        WebElement naamInput = driver.findElement(By.id("naam"));
        naamInput.clear();
        naamInput.sendKeys("scott");

        WebElement soortInput = driver.findElement(By.id("nationaliteit"));
        soortInput.clear();
        soortInput.sendKeys("schott");

        WebElement voedselInput = driver.findElement(By.id("team"));
        voedselInput.clear();
        voedselInput.sendKeys("fnatic");

        driver.findElement(By.id("submit")).click();

        assertEquals("player database", driver.getTitle());

        ArrayList<WebElement> lis = (ArrayList<WebElement>) driver.findElements(By.tagName("tr"));

        assertEquals(8 , lis.size());
    }
}