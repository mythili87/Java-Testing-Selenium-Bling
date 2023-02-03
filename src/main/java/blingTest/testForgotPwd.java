package blingTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testForgotPwd {

    public static void main (String args[]){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://dash.bling-center.com/platform/signIn.html");

        //click forgot password
        driver.findElement(By.xpath("//p[normalize-space()='Forgot Password?']")).click();
        //enter email id
        driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("abc123@gmail.com");
        //click reset password
        driver.findElement(By.xpath("//p[normalize-space()='Reset Password']")).click();

    }
}
