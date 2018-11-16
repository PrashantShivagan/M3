package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "file:///D:/Reading%20material%20java/Module%203/BDD%20for%20Full%20Stack/Demos/Lesson%205-HTML%20Pages/WorkingWithForms.html";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test() throws Exception {
    driver.get("file:///D:/BDD%20MPT%20case%20study/ConferenceRegistartion.html");
    try {
      assertEquals("Conference Registartion", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Conference Registration", driver.findElement(By.cssSelector("h2")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the First Name", closeAlertAndGetItsText());
    driver.findElement(By.id("txtFirstName")).click();
    driver.findElement(By.id("txtFirstName")).clear();
    driver.findElement(By.id("txtFirstName")).sendKeys("Prashant");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the Last Name", closeAlertAndGetItsText());
    driver.findElement(By.id("txtLastName")).click();
    driver.findElement(By.id("txtLastName")).clear();
    driver.findElement(By.id("txtLastName")).sendKeys("Shivagan");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the Email", closeAlertAndGetItsText());
    driver.findElement(By.id("txtEmail")).click();
    driver.findElement(By.id("txtEmail")).clear();
    driver.findElement(By.id("txtEmail")).sendKeys("prashantshivagan@gmail.com");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the Contact No.", closeAlertAndGetItsText());
    driver.findElement(By.id("txtPhone")).click();
    driver.findElement(By.id("txtPhone")).clear();
    driver.findElement(By.id("txtPhone")).sendKeys("8692837660");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the Number of people attending", closeAlertAndGetItsText());
    new Select(driver.findElement(By.name("size"))).selectByVisibleText("4");
    driver.findElement(By.cssSelector("option[value=\"four\"]")).click();
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the Building & Room No", closeAlertAndGetItsText());
    driver.findElement(By.id("txtAddress1")).click();
    driver.findElement(By.id("txtAddress1")).clear();
    driver.findElement(By.id("txtAddress1")).sendKeys("306 Parvati Apts");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please fill the Area name", closeAlertAndGetItsText());
    driver.findElement(By.id("txtAddress2")).click();
    driver.findElement(By.id("txtAddress2")).clear();
    driver.findElement(By.id("txtAddress2")).sendKeys("Santacruz");
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please select city", closeAlertAndGetItsText());
    driver.findElement(By.name("city")).click();
    driver.findElement(By.cssSelector("option[value=\"Select City\"]")).click();
    driver.findElement(By.name("city")).click();
    new Select(driver.findElement(By.name("city"))).selectByVisibleText("Pune");
    driver.findElement(By.cssSelector("option[value=\"Pune\"]")).click();
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please select state", closeAlertAndGetItsText());
    driver.findElement(By.name("state")).click();
    new Select(driver.findElement(By.name("state"))).selectByVisibleText("Maharashtra");
    driver.findElement(By.cssSelector("option[value=\"Maharashtra\"]")).click();
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Please Select MemeberShip status", closeAlertAndGetItsText());
    driver.findElement(By.name("memberStatus")).click();
    driver.findElement(By.linkText("Next")).click();
    assertEquals("Personal details are validated.", closeAlertAndGetItsText());
    try {
      assertEquals("Payment Details", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Step 2: Payment Details", driver.findElement(By.cssSelector("h4")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("btnPayment")).click();
    assertEquals("Please fill the Card holder name", closeAlertAndGetItsText());
    driver.findElement(By.id("txtCardholderName")).clear();
    driver.findElement(By.id("txtCardholderName")).sendKeys("Prashant");
    driver.findElement(By.id("btnPayment")).click();
    assertEquals("Please fill the Debit card Number", closeAlertAndGetItsText());
    driver.findElement(By.id("txtDebit")).clear();
    driver.findElement(By.id("txtDebit")).sendKeys("7896-2155-26365-32635");
    driver.findElement(By.id("btnPayment")).click();
    assertEquals("Please fill the CVV", closeAlertAndGetItsText());
    driver.findElement(By.id("txtCvv")).clear();
    driver.findElement(By.id("txtCvv")).sendKeys("444");
    driver.findElement(By.id("btnPayment")).click();
    assertEquals("Please fill expiration month", closeAlertAndGetItsText());
    driver.findElement(By.id("txtMonth")).clear();
    driver.findElement(By.id("txtMonth")).sendKeys("January");
    driver.findElement(By.id("btnPayment")).click();
    assertEquals("Please fill the expiration year", closeAlertAndGetItsText());
    driver.findElement(By.id("txtYear")).clear();
    driver.findElement(By.id("txtYear")).sendKeys("2020");
    driver.findElement(By.id("btnPayment")).click();
    assertEquals("Conference Room Booking successfully done!!!", closeAlertAndGetItsText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
