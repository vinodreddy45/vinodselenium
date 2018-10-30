package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ibm {

	public static void main(String[] args) {
    FirefoxDriver driver = new FirefoxDriver();
    driver.get("https://google.com");
    WebElement wb = driver.findElement(By.id("searchText"));
    wb.sendKeys("ibm");
    

	}

}
