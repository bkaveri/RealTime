package org.tiny;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 extends BaseClass{
	public static void main(String[] args) {
		launch("https://www.snapdeal.com/");
	Page l=new Page();
	passing(l.getSearch().get(0),"watches");
	clik(l.getBtn());
	
	WebDriverWait w=new WebDriverWait(driver,10);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='product-title ']")));
	clik(l.getMbl().get(0));
	}

}
