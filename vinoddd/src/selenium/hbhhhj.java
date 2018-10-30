package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class hbhhhj {

	public static void main(String[] args) {
	
     FirefoxDriver driver = new FirefoxDriver();
     driver.get("http://localhost/login.do");
     driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
     driver.findElement(By.id("loginButton")).click();

     
     
     
     
     
	}

}
