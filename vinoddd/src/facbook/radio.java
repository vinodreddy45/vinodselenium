package facbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class radio {

	public static void main(String[] args) {
    FirefoxDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://www.facebook.com/");
    String expmsg="image is displayed";
    WebElement wb = driver.findElement(By.xpath("//img[@src=\"https://static.xx.fbcdn.net/rsrc.php/v3/yc/r/GwFs3_KxNjS.png\"]"));
    String msg=wb.getText();
    System.out.println("msg");
    if(msg.equals(expmsg)) {
    System.out.println("msg is verified==pass");
    }
    else {
    	System.out.println("msg is not verified==fail");
    	
    }
    { 
    	WebElement f= driver.findElement(By.id("\"u_0_6\""));
    	WebElement m = driver.findElement(By.id("u_0_a"));
    }
    String actresult = " ";
     String expresult = "radio buttion no selected";}

}
