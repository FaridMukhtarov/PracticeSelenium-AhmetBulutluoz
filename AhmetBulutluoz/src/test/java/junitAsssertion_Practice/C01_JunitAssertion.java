package junitAsssertion_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_JunitAssertion {

    WebDriver driver;
    @Test
    public void test_1() throws InterruptedException {

        // 1. Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3 . Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
        Assert.assertTrue(homePage.isDisplayed());

        // 4. Click on 'Signup / Login' button
        WebElement singnUp = driver.findElement(By.xpath("//a[@href='/login']"));
        singnUp.click();

        // 5. Verify 'Login to your account' is visible
        WebElement loginText = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginText.isDisplayed());

        // 6. Enter correct email address and password
        WebElement emailAddress = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        emailAddress.sendKeys("ahmet@nehaber.com");
        WebElement password = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        password.sendKeys("12345");

        // 7. Click 'login' button
        WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        loginButton.click();

        // 8. Verify that 'Logged in as username' is visible
        WebElement loggedText = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
        Assert.assertTrue(loggedText.isDisplayed());

        // 9. Click 'Logout' button
        WebElement logout = driver.findElement(By.xpath("//a[@href='/logout']"));
        logout.click();

        // 10. Verify that user is navigated to login page
        String expectedUrl = "https://automationexercise.com/login";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        //11 Close Driver
        driver.close();




    }
}
