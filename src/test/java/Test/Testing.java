package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
    public static void main(String args[])

    {
        WebDriver x = new ChromeDriver();
        x.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.27.0");
        System.out.println("Logged in");

    }
}
