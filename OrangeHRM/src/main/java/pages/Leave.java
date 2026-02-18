package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leave {
    private WebDriver driver;
    private WebDriverWait wait;

    private By applyLink = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a");
    private By myLeaveLink=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a");
    private By entitlementsLink=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span/text()");
    private By reportsLink=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span/text()");
   
    public Leave(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String clickApplyLink() {
    	driver.findElement(applyLink).click();
    	return driver.getCurrentUrl();
    }
    public String clickMyLeaveLink() {
    	driver.findElement(applyLink).click();
    	return driver.getCurrentUrl();
    }
    public String clickEntitlementLink() {
    	driver.findElement(applyLink).click();
    	return driver.getCurrentUrl();
    }
    public String clickReportsLink() {
    	driver.findElement(applyLink).click();
    	return driver.getCurrentUrl();
    }
    public String clickConfigureLink() {
    	driver.findElement(applyLink).click();
    	return driver.getCurrentUrl();
    }
    public String clickLeaveListLink() {
    	driver.findElement(applyLink).click();
    	return driver.getCurrentUrl();
    }
    public String clickAssignLeaveListLink() {
    	driver.findElement(applyLink).click();
    	return driver.getCurrentUrl();
    }
}
