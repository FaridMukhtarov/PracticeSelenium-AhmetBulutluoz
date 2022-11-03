package driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethod {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.amazon.com/");
        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Url: " + driver.getCurrentUrl());
        System.out.println("Page Source: " + driver.getPageSource());
        System.out.println("UNIQUE hash code: " + driver.getWindowHandle());





    }
}
