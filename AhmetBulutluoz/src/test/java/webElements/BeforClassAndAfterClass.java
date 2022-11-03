package webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BeforClassAndAfterClass {

    WebDriver driver;

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement sherchBox = driver.findElement(By.id("twotabsearchtextbox"));
        sherchBox.sendKeys("Nuttela");
        sherchBox.submit();
        WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(result.getText());
        driver.close();
    }
    @Test
    public void tet2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("azer@gmail.com");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("123456");

        Thread.sleep(1000);
        WebElement logIn = driver.findElement(By.xpath("//button[@name='login']"));
        logIn.click();


        WebElement x = driver.findElement(By.xpath("//div[@class='_9ai5']"));
        x.click();
    }
    @Test
    public void test3(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com");
    }
}
