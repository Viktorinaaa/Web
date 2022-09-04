package ru.netology;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class web {
    WebDriver driver;

    @BeforeAll
    static void setUpAll() {
        //System.setProperty("webdriver.chrome.driver","./driver/mac/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }

    @Test
    void shouldTestV1() {
        driver.get("http://localhost:9999");
        //WebElement driver = driver.findElement(By.cssSelector("[data-test-id=callback-form]"));
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Алиса");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+01234567891");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.cssSelector("button")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        assertEquals(expected, actual.trim());
    }

    @Test
    void shouldTestV2() {
        driver.get("http://localhost:9999");
        //WebElement driver = driver.findElement(By.cssSelector("[data-test-id=callback-form]"));
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("  Алиса  ");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+11111111111");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.cssSelector("button")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        assertEquals(expected, actual.trim());
    }

    @Test
    void shouldTestV3() {
        driver.get("http://localhost:9999");
        //WebElement driver = driver.findElement(By.cssSelector("[data-test-id=callback-form]"));
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Алиса Ли");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+01234567892");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.cssSelector("button")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        assertEquals(expected, actual.trim());
    }

    @Test
    void shouldTestV4() {
        driver.get("http://localhost:9999");
        //WebElement driver = driver.findElement(By.cssSelector("[data-test-id=callback-form]"));
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Марковна-Алиса-Ли");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79267890011");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.cssSelector("button")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        assertEquals(expected, actual.trim());
    }

    @Test
    void shouldTestV5() {
        driver.get("http://localhost:9999");
        //WebElement driver = driver.findElement(By.cssSelector("[data-test-id=callback-form]"));
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("алиса");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79267890011");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.cssSelector("button")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        assertEquals(expected, actual.trim());
    }

    @Test
    void shouldTestV6() {
        driver.get("http://localhost:9999");
        //WebElement driver = driver.findElement(By.cssSelector("[data-test-id=callback-form]"));
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("АЛИСА");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79267890011");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.cssSelector("button")).click();

        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        assertEquals(expected, actual.trim());
    }

}
