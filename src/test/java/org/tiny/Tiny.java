package org.tiny;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tiny extends BaseClass{
	public static void main(String[] args) {
		
		launch("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp\r\n");

		Page p=new Page();
//		passing(p.getName(),"kaveri");
//		passing(p.getLast(),"bhaskar");
	}

}
