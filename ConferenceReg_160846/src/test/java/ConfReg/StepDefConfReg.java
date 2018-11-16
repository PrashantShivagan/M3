package ConfReg;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageBean.ConfRegPageFactory;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefConfReg {
	private WebDriver driver;
	private ConfRegPageFactory reg;

@Given("^User is on ConferenceRegistration page$")
public void user_is_on_ConferenceRegistration_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	reg = new ConfRegPageFactory(driver);
	driver.get("file:///D:/BDD%20MPT%20case%20study/ConferenceRegistartion.html");
}

@Then("^check the heading of page$")
public void check_the_heading_of_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String strheading =  driver.findElement(By.xpath("html/body/h2")).getText();
	if(strheading.contentEquals("Conference Registration"))
		System.out.println("Heading matched");
	else
		System.out.println("Heading Not Matched");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.close();
}

@When("^User does not enter firstname$")
public void user_does_not_enter_firstname() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setCfirstname("Prashant");Thread.sleep(1000);
	reg.setCnext();
}

@Then("^prompt user to fill firstname in details$")
public void prompt_user_to_fill_firstname_in_details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
	
}

@When("^User does not enter lastname$")
public void user_does_not_enter_lastname() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setCfirstname("Prashant");Thread.sleep(1000);
	reg.setClastname("Shivagan");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setCnext();
}

@Then("^prompt user to fill lastname in details$")
public void prompt_user_to_fill_lastname_in_details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User does not enter email in correct format$")
public void user_does_not_enter_email_in_correct_format() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setCfirstname("Prashant");Thread.sleep(1000);
	reg.setClastname("Shivagan");Thread.sleep(1000);
	reg.setCemail(" ");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setCnext();
}

@Then("^prompt user to write input correctly$")
public void prompt_user_to_write_input_correctly() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User does not enter contact number$")
public void user_does_not_enter_contact_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setCfirstname("Prashant");Thread.sleep(1000);
	reg.setClastname("Shivagan");Thread.sleep(1000);
	reg.setCemail("prashantshivagan@gmail.com");Thread.sleep(1000);
	reg.setCphone("");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setCnext();
}

@Then("^prompt user to enter mobile number$")
public void prompt_user_to_enter_mobile_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User enters  incorrect mobile no format and clicks the button$")
public void user_enters_incorrect_mobile_no_format_and_clicks_the_button(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    //throw new PendingException();
	reg.setCfirstname("Prashant");Thread.sleep(1000);
	reg.setClastname("Shivagan");Thread.sleep(1000);
	reg.setCemail("prashantshivagan@gmail.com");Thread.sleep(1000);
	List<String> list = arg1.asList(String.class);;
	
	for(int i=0; i<list.size(); i++) {
		reg.getCphone().clear();
		reg.setCphone(list.get(i)); Thread.sleep(1000);
		reg.setCnext();
	
		
		if(Pattern.matches("^[789][0-9]{9}$", list.get(i))) {
			System.out.println("*****Matched"+ list.get(i)+"****");
		}else {
			String alertMessage = driver.switchTo().alert().getText();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			System.out.println("" + alertMessage);
			System.out.println("****Not Matched" + list.get(i)+"*****");
		}
	}
	reg.setCnext();
}


@Then("^display alert msg$")
public void display_alert_msg() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();

}

@When("^User does not select number of people attending$")
public void user_does_not_select_number_of_people_attending() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setCfirstname("Prashant");Thread.sleep(1000);
	reg.setClastname("Shivagan");Thread.sleep(1000);
	reg.setCemail("prashantshivagan@gmail.com");Thread.sleep(1000);
	reg.setCphone("8692837660");Thread.sleep(1000);
	reg.setCsize(" ");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setCnext();
	
	
}

@Then("^prompt user to select the number of people attending$")
public void prompt_user_to_select_the_number_of_people_attending() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();

}

@When("^User does not enter address$")
public void user_does_not_enter_address() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	
}

@Then("^prompt user to fill in the address$")
public void prompt_user_to_fill_in_the_address() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User does not enter buildingname and room no$")
public void user_does_not_enter_buildingname_and_room_no() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setCfirstname("Prashant");Thread.sleep(1000);
	reg.setClastname("Shivagan");Thread.sleep(1000);
	reg.setCemail("prashantshivagan@gmail.com");Thread.sleep(1000);
	reg.setCphone("8692837660");Thread.sleep(1000);
	reg.setCsize("4");Thread.sleep(1000);
	reg.setCaddress(" ");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setCnext();
	
	
}

@Then("^prompt user to fill in the buildingname and room no$")
public void prompt_user_to_fill_in_the_buildingname_and_room_no() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User does not enter area name$")
public void user_does_not_enter_area_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setCfirstname("Prashant");Thread.sleep(1000);
	reg.setClastname("Shivagan");Thread.sleep(1000);
	reg.setCemail("prashantshivagan@gmail.com");Thread.sleep(1000);
	reg.setCphone("8692837660");Thread.sleep(1000);
	reg.setCsize("4");Thread.sleep(1000);
	reg.setCaddress("306 parvati Apts");Thread.sleep(1000);
	reg.setCaddress2(" ");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setCnext();
}

@Then("^prompt user to fill in the area name$")
public void prompt_user_to_fill_in_the_area_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User does not select city$")
public void user_does_not_select_city() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setCfirstname("Prashant");Thread.sleep(1000);
	reg.setClastname("Shivagan");Thread.sleep(1000);
	reg.setCemail("prashantshivagan@gmail.com");Thread.sleep(1000);
	reg.setCphone("8692837660");Thread.sleep(1000);
	reg.setCsize("4");Thread.sleep(1000);
	reg.setCaddress("306 parvati Apts");Thread.sleep(1000);
	reg.setCaddress2("Vakola");Thread.sleep(1000);
	reg.setCcity("Select City");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setCnext();
}

@Then("^prompt user to select city$")
public void prompt_user_to_select_city() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User does not select state$")
public void user_does_not_select_state() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setCfirstname("Prashant");Thread.sleep(1000);
	reg.setClastname("Shivagan");Thread.sleep(1000);
	reg.setCemail("prashantshivagan@gmail.com");Thread.sleep(1000);
	reg.setCphone("8692837660");Thread.sleep(1000);
	reg.setCsize("4");Thread.sleep(1000);
	reg.setCaddress("306 parvati Apts");Thread.sleep(1000);
	reg.setCaddress2("Vakola");Thread.sleep(1000);
	reg.setCcity("Pune");Thread.sleep(1000);
	reg.setCstate("Select State");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setCnext();
}

@Then("^prompt user to select state$")
public void prompt_user_to_select_state() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User does not select conference full access$")
public void user_does_not_select_conference_full_access() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setCfirstname("Prashant");Thread.sleep(1000);
	reg.setClastname("Shivagan");Thread.sleep(1000);
	reg.setCemail("prashantshivagan@gmail.com");Thread.sleep(1000);
	reg.setCphone("8692837660");Thread.sleep(1000);
	reg.setCsize("4");Thread.sleep(1000);
	reg.setCaddress("306 parvati Apts");Thread.sleep(1000);
	reg.setCaddress2("Vakola");Thread.sleep(1000);
	reg.setCcity("Pune");Thread.sleep(1000);
	reg.setCstate("Maharashtra");Thread.sleep(1000);
	reg.setCmember("member");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setCnext();
}

@Then("^prompt user to select conference full access$")
public void prompt_user_to_select_conference_full_access() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
}

@When("^User enters all valid details and clicks next$")
public void user_enters_all_valid_details_and_clicks_next() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	reg.setCfirstname("Prashant");Thread.sleep(1000);
	reg.setClastname("Shivagan");Thread.sleep(1000);
	reg.setCemail("prashantshivagan@gmail.com");Thread.sleep(1000);
	reg.setCphone("8692837660");Thread.sleep(1000);
	reg.setCsize("4");Thread.sleep(1000);
	reg.setCaddress("306 parvati Apts");Thread.sleep(1000);
	reg.setCaddress2("Vakola");Thread.sleep(1000);
	reg.setCcity("Pune");Thread.sleep(1000);
	reg.setCstate("Maharashtra");Thread.sleep(1000);
	reg.setCmember("member");Thread.sleep(1000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	reg.setCnext();
	Thread.sleep(1000);
}

@Then("^Display Alert Message and clicks OK$")
public void display_Alert_Message_and_clicks_OK() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	Alert alert=driver.switchTo().alert();
    String alertmsg=alert.getText();
    System.out.println(alertmsg);
    alert.accept();
}

@Then("^Navigate to Payment Details page$")
public void navigate_to_Payment_Details_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	driver.navigate().to("file:///D:/BDD%20MPT%20case%20study/PaymentDetails.html");
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
    Thread.sleep(500);
}
	@After
	public void after_method() {
		System.out.println("\nIn After Class... driver is closed\n\n");
		driver.close();
	}
}


	
	

