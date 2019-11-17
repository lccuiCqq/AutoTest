package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        WebDriver  driver;
        System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.imooc.com/user/newlogin");
        driver.findElement(By.name("email")).sendKeys("1403330102@qq.com");
        driver.findElement(By.name("password")).sendKeys("82855033.clc");
        driver.findElement(By.className("moco-btn")).click();



    }
}
