package org.tiny;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static  void launch(String s) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\base project\\\\JavaPro\\\\driver\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(s);
		

}
public static void passing(WebElement w,String s) {
 w.sendKeys(s);
		
	}
	public static void clik(WebElement w) {
		w.click();
	}
	public static void maxi() {
		driver.manage().window().maximize();
	}
	public static void text(WebElement w) {
		String t = w.getText();
		
		System.out.println(t);
	}
	
	
	
	
	
	
}
