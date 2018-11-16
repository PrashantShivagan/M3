package PageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPageFactory {
	WebDriver driver;
	
	@FindBy(id="txtCardholderName")
	@CacheLookup
	WebElement pchn;
	
	@FindBy(name="debit")
	@CacheLookup
	WebElement pdebit;
	
	@FindBy(name="cvv")
	@CacheLookup
	WebElement pcvv;
	
	@FindBy(name="month")
	@CacheLookup
	WebElement pmonth;
	
	@FindBy(name="year")
	@CacheLookup
	WebElement pyear;
	
	@FindBy(id="btnPayment")
	@CacheLookup
	WebElement ppayment;

	public PaymentPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPchn() {
		return pchn;
	}

	public void setPchn(String Cardholder) {
		 pchn.sendKeys(Cardholder);
	}

	public WebElement getPdebit() {
		return pdebit;
	}

	public void setPdebit(String debit) {
		 pdebit.sendKeys(debit);
	}

	public WebElement getPcvv() {
		return pcvv;
	}

	public void setPcvv(String cvv) {
		pcvv.sendKeys(cvv);
	}

	public WebElement getPmonth() {
		return pmonth;
	}

	public void setPmonth(String month) {
		pmonth.sendKeys(month);
	}

	public WebElement getPyear() {
		return pyear;
	}

	public void setPyear(String year) {
		pyear.sendKeys(year);
	}

	public WebElement getPpayment() {
		return ppayment;
	}

	public void setPpayment() {
		ppayment.click();
	}
	
	
}
