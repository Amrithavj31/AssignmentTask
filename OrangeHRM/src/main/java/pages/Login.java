package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	private WebDriver driver;
    private WebDriverWait wait;

    private By username = By.name("username");
    private By password = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
    private By login=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
   
    public Login(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String clickUsername() {
    	driver.findElement(username).sendKeys("Admin");
    	return driver.getCurrentUrl();
    }
    public String clickPassword() {
    	driver.findElement(password).sendKeys("admin123");
    	return driver.getCurrentUrl();
    }
    public String clickSubmitButton() {
    	driver.findElement(login).click();
    	System.out.println("dashboard ----"+driver.getCurrentUrl());
    	return driver.getCurrentUrl();
    }
}
