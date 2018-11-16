package Payment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageBean.ConfRegPageFactory;
import PageBean.PaymentPageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefPayment {
	private WebDriver driver;
	private PaymentPageFactory reg;

@Given("^User is on Payment page$")
public void user_is_on_Payment_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	//throw new PendingException();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		reg = new PaymentPageFactory(driver);
		driver.get("file:///D:/BDD%20MPT%20case%20study/PaymentDetails.html");
	}


@Then("^check the heading of page$")
public void check_the_heading_of_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String strheading =  driver.findElement(By.xpath("html/body/h4")).getText();
	if(strheading.contentEquals("Step 2: Payment Details"))
		System.out.println("Heading matched");
	else
		System.out.println("Heading Not Matched");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.close();
}

@When("^User does not enter card holder name$")
public void user_does_not_enter_card_holder_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setPchn("Prashant");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setPpayment();
}

@Then("^prompt user to fill in card holder name$")
public void prompt_user_to_fill_in_card_holder_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User does not enter debit card number$")
public void user_does_not_enter_debit_card_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setPchn("Prashant");Thread.sleep(1000);
	reg.setPdebit(" ");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setPpayment();
}

@Then("^prompt user to enter debit card number$")
public void prompt_user_to_enter_debit_card_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User does not enter cvv number$")
public void user_does_not_enter_cvv_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setPchn("Prashant");Thread.sleep(1000);
	reg.setPdebit("7892-2365-7563-3654");Thread.sleep(1000);
	reg.setPcvv(" ");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setPpayment();
}

@Then("^prompt user to enter cvv number$")
public void prompt_user_to_enter_cvv_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User does not enter card expiration month$")
public void user_does_not_enter_card_expiration_month() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setPchn("Prashant");Thread.sleep(1000);
	reg.setPdebit("7892-2365-7563-3654");Thread.sleep(1000);
	reg.setPcvv("444");Thread.sleep(1000);
	reg.setPmonth(" ");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setPpayment();
}

@Then("^prompt user to enter card expiration month$")
public void prompt_user_to_enter_card_expiration_month() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User does not enter card expiration year$")
public void user_does_not_enter_card_expiration_year() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ////throw new PendingException();
	reg.setPchn("Prashant");Thread.sleep(1000);
	reg.setPdebit("7892-2365-7563-3654");Thread.sleep(1000);
	reg.setPcvv("444");Thread.sleep(1000);
	reg.setPmonth("January");Thread.sleep(1000);
	reg.setPyear(" ");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setPpayment();
}

@Then("^prompt user to enter card expiration year$")
public void prompt_user_to_enter_card_expiration_year() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User clicks on Make Payment button$")
public void user_clicks_on_Make_Payment_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setPchn("Prashant");Thread.sleep(1000);
	reg.setPdebit("7892-2365-7563-3654");Thread.sleep(1000);
	reg.setPcvv("444");Thread.sleep(1000);
	reg.setPmonth("January");Thread.sleep(1000);
	reg.setPyear("2020");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setPpayment();
}

@Then("^navigate to Payment page$")
public void navigate_to_Payment_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}


}
