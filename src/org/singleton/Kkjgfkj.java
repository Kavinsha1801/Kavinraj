package org.singleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kkjgfkj {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hemakavin\\eclipse-workspace\\SeleniumDay2\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	WebElement web=driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions a=new Actions(driver);
	a.moveToElement(web).perform();
	WebElement act = driver.findElement(By.xpath("//span[text()='Bigdata Training']"));
			act.click();
	}

}
