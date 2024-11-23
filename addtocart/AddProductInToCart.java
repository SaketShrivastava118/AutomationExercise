package addtocart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductInToCart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        WebElement SelectSignUp = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        SelectSignUp.click();
//        System.out.println("login Page Should be open");
        WebElement selectName = driver.findElement(By.name("email"));
        selectName.sendKeys("Bharat@gmail.com");
        WebElement selectEmail = driver.findElement(By.name("password"));
        selectEmail.sendKeys("Bharat@123");
        WebElement clickloginButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        clickloginButton.click();
//        System.out.println("login successfull");
        WebElement OpenProductPage = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"));
        OpenProductPage.click();
//        System.out.println("Open Product Page");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        WebElement OpenViewProductPage = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a"));
        OpenViewProductPage.click();
        WebElement AddProductFromProductViewPage= driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));
        AddProductFromProductViewPage.click();
        Thread.sleep(2000);
        WebElement Continue_Shopping= driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));
        Continue_Shopping.click();
        WebElement ViewCart= driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a"));
        ViewCart.click();


    }
}
