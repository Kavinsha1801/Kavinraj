import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winhand {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hemakavin\\eclipse-workspace\\SeleniumDay2\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("");
	
	}

}
