package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginWithInvalidEmail {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        WebElement SelectSignUp = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        SelectSignUp.click();
        System.out.println("login Page Should be open");
        WebElement selectName = driver.findElement(By.name("email"));
        selectName.sendKeys("Bharat45@gmail.com");
        WebElement selectEmail = driver.findElement(By.name("password"));
        selectEmail.sendKeys("Bharat@123");
        WebElement clickloginButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        clickloginButton.click();
        System.out.println("error message should be displayed");
    }
}
