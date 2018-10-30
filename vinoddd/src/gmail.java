import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) {
    FirefoxDriver driver = new FirefoxDriver();
    driver.get("https://gmail.com");
   String pt = driver.getTitle();
   System.out.println(pt);
   if(pt.equals("gmail")) {
	   System.out.println("login page is displayed==pass");
   }else {
	   System.out.println(pt);
   }
   System.out.println("login page not displayed==fail");

	}
	
}
