package PageBean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConfRegPageFactory {
	WebDriver driver;
	
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement cfirstname;
	
	@FindBy(name="txtLN")
	@CacheLookup
	WebElement clastname;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement cemail;
	
	@FindBy(name="Phone")
	@CacheLookup
	WebElement cphone;
	
	@FindBy(name="size")
	@CacheLookup
	WebElement csize;
	
	@FindBy(name="Address")
	@CacheLookup
	WebElement caddress;
	
	@FindBy(name="Address2")
	@CacheLookup
	WebElement caddress2;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement ccity;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement cstate;
	
	@FindBy(xpath="html/body/form/table/tbody/tr[12]/td[2]/input")
	@CacheLookup
	WebElement cmember;
	
	@FindBy(xpath="html/body/form/table/tbody/tr[13]/td[2]/input")
	@CacheLookup
	WebElement nomember;
	
	@FindBy(partialLinkText = "Next")
	@CacheLookup
	WebElement cnext;

	public ConfRegPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCfirstname() {
		return cfirstname;
	}

	public void setCfirstname(String firstname) {
		cfirstname.sendKeys(firstname);
	}

	public WebElement getClastname() {
		return clastname;
	}

	public void setClastname(String lastname) {
		clastname.sendKeys(lastname);
	}

	public WebElement getCemail() {
		return cemail;
	}

	public void setCemail(String email) {
		cemail.sendKeys(email);
	}

	public WebElement getCphone() {
		return cphone;
	}

	public void setCphone(String phone) {
		cphone.sendKeys(phone);
	}

	public WebElement getCsize() {
		return csize;
	}

	public void setCsize(String size) {
		csize.sendKeys(size);
	}

	public WebElement getCaddress() {
		return caddress;
	}

	public void setCaddress(String address) {
		caddress.sendKeys(address);
	}

	public WebElement getCaddress2() {
		return caddress2;
	}

	public void setCaddress2(String address2) {
		caddress2.sendKeys(address2);
	}

	public WebElement getCcity() {
		return ccity;
	}

	public void setCcity(String city) {
		Select s= new Select(ccity);
		s.selectByVisibleText(city);
	}

	public WebElement getCstate() {
		return cstate;
	}

	public void setCstate(String state) {
		Select s = new Select(cstate);
		s.selectByVisibleText(state);
	}

	public WebElement getCmember() {
		return cmember;
	}

	public void setCmember(String member) {
	cmember.click();
	}

	public void setNomember(String nonmember) {
		nomember.click();
		}


	public WebElement getCnext() {
		return cnext;
	}

	public void setCnext() {
		cnext.click();
	}
	
	
}

