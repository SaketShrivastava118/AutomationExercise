package SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpWithValidDetails {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        WebElement SelectSignUp = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        SelectSignUp.click();
        System.out.println("Signup Page Should be open");
        WebElement selectName = driver.findElement(By.name("name"));
        selectName.sendKeys("Bharat");
        WebElement selectEmail = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
        selectEmail.sendKeys("Bharat@gmail.com");
        WebElement clickSignUp =driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
        clickSignUp.click();
        WebElement selectTitle =driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
        selectTitle.click();
        WebElement enterPassword = driver.findElement(By.id("password"));
        enterPassword.sendKeys("Bharat@123");
        Select selectDay=new Select (driver.findElement(By.id("days")));
        selectDay.selectByValue("11");
        Select selectMonth=new Select (driver.findElement(By.id("months")));
        selectMonth.selectByVisibleText("March");
        Select selectYear=new  Select (driver.findElement(By.id("years")));
        selectYear.selectByValue("1998");
      //  WebElement selectNewsLetter = driver.findElement(By.id("newsletter"));
        //selectNewsLetter.click();
       // WebElement selectOption = driver.findElement(By.id("optin"));
       // selectOption.click();
        WebElement SelectFirstName = driver.findElement(By.name("first_name"));
        SelectFirstName.sendKeys("Bharat");
        WebElement SelectLastName = driver.findElement(By.name("last_name"));
        SelectLastName.sendKeys("singh");
        WebElement SelectCompany = driver.findElement(By.name("company"));
        SelectCompany.sendKeys("Q Spider");
        WebElement SelectAddress = driver.findElement(By.name("address1"));
        SelectAddress.sendKeys("Amrapali Village");
        WebElement SelectState = driver.findElement(By.name("state"));
        SelectState.sendKeys("Uttar pradesh");
        WebElement SelectCity = driver.findElement(By.name("city"));
        SelectCity.sendKeys("Ghaziabad");
        WebElement Selectzipcode = driver.findElement(By.name("zipcode"));
        Selectzipcode.sendKeys("201014");
        WebElement SelectMobileNo = driver.findElement(By.name("mobile_number"));
        SelectMobileNo.sendKeys("8109149253");
        WebElement clickButton = driver.findElement(By.cssSelector("#form > div > div > div > div > form > button"));
        clickButton.click();





    }
}
