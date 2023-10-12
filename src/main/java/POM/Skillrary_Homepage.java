package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_Homepage {
	//Declaration
		//Address of gears
		@FindBy(xpath="//a[text()=' GEARS ']")
		private WebElement gearbtn;
		
		@FindBy(xpath="//a[text()=' SkillRary Demo APP']")
		private WebElement skillrarydemoapp;
		
		@FindBy(xpath="//input[@name='q']")
		private WebElement searchTf;
		
		@FindBy(xpath="//input[@value='go']")
		private WebElement searchicon;
		
		@FindBy(xpath="//a[@class='close_cookies']")
		private WebElement cookies;
		
		//initialization
		
		public Skillrary_Homepage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//utilization
		
		//business logic
		public void gearsbutton()
		{
			gearbtn.click();
		}
		public void skillrarydemoapplink()
		{
			skillrarydemoapp.click();
		}
		public void searchtextfield(String data)
		{
			searchTf.sendKeys(data);;
		}
		public void searchIcon()
		{
			searchicon.click();
		}
		public void cookiesIcon()
		{
			cookies.click();
		}
}
