package org.tiny;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page extends BaseClass{
public Page() {
	PageFactory.initElements(driver, this);
	
}
//@FindBy(id="firstName")
//private WebElement name;
//
//@FindBy(id="lastName")
//private WebElement last;
//
//public WebElement getName() {
//	return name;
//}
//
//public WebElement getLast() {
//	return last;

@FindBy(xpath="//input[@class='col-xs-20 searchformInput keyword']")
private List<WebElement> search;

@FindBy(className="searchTextSpan")
private WebElement btn;

@FindBy(xpath="//p[@class='product-title ']")
private List<WebElement> mbl;

public List<WebElement> getMbl() {
	return mbl;
}

public void setMbl(List<WebElement> mbl) {
	this.mbl = mbl;
}

public WebElement getBtn() {
	return btn;
}

public void setBtn (WebElement btn) {
	this.btn = btn;
}

public List<WebElement> getSearch() {
	return search;
}

public void setSearch(List<WebElement> search) {
	this.search = search;
}



}







