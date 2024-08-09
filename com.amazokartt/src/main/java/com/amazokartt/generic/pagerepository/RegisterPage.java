package com.amazokartt.generic.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		
		  PageFactory.initElements(driver, this);
		}
		//1.Address of name textfeild
		@FindBy(id="name")
	    WebElement nameTextfield1;
		
		public WebElement getName() {
			return nameTextfield1;	
		}
		
		//Address of name label
		@FindBy(xpath="//label[text()='Name:']")
	     WebElement nameLabel;
		
		//2.Address of email textfeild
		@FindBy(id="email")
	     WebElement emailTextfield;
		
		//Address of email label
		@FindBy(xpath="//label[text()='Email:']")
	    WebElement emaillabel1;
		
		//3.Address of password textfeild
		@FindBy(id="password")
		 WebElement pwdTextfield;
			
	    //Address of password label
		@FindBy(xpath="//label[text()='Password:']")
		 WebElement pwdlabel;
		
		//4.Address of mobile textfeild
		@FindBy(id="mobile")
		 WebElement mobTextfield;
				
		 //Address of email label
		@FindBy(xpath="//label[text()='Mobile.no:']")
		 WebElement moblabel;
}
