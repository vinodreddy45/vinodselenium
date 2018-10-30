import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class identification_mtd {

	public static void main(String[] args) {
    FirefoxDriver driver =new FirefoxDriver();
    driver.get("https://gmail.com");
    driver.findElement(By.id("identifierId")).sendKeys("manireddyvinod");
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    driver.findElement(By.name("password")).sendKeys("9059918921");
    driver.findElement(By.xpath("//span[text()='Next']")).click();
   
    

	}

}
