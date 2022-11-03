package driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        // Medeni Gozleme ucun
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Icinde Oldugu seyfenin bizim yazdigimiz POSITION-u verir
        driver.manage().window().setPosition(new Point(20, 60));

        // Icinde oldugu seyfenin Bizim verdiyimiz olculeri verir
        driver.manage().window().setSize(new Dimension(400, 600));

        // Icinde oldugu Seyfenin Pixel olaraq olculerini verir
        System.out.println("Size: " + driver.manage().window().getSize());

        // Icinde oldugu Seyfenin Pixel olaraq yerini verir
        System.out.println("Get Postion: " + driver.manage().window().getPosition());

        // Iicinde oldugu tam ekran acir
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Iicinde oldugu tam ekran acir
        driver.manage().window().fullscreen();
        System.out.println("Size: " + driver.manage().window().getSize());

        // Icinde oldugu seyfenin Balacalasdirir
        driver.manage().window().minimize();
        Thread.sleep(2000);

        // Icinde oldugu seyfeni baglayir
           driver.close();





    }
}