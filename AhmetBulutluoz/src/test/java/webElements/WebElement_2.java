package webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElement_2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
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
}
