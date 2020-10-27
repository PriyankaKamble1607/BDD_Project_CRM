package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CRM.CRM.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity2Step extends TestBase
{
WebDriver driver=base();
	
	@Given("^Log in to CRM$")
	public void Create_New_User() throws Throwable
	{
		
		driver.get("https://alchemy.hguy.co/crm/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
    }
	 @When("^create lead with \"(.*)\",\"(.*)\",\"(.*)\"$")
	 public void Create_Lead(String Fname,String Lname,String title) throws Throwable
	 {
		 driver.findElement(By.id("grouptab_0")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("moduleTab_9_Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("first_name")).sendKeys(Fname);
		 driver.findElement(By.id("last_name")).sendKeys(Lname);
		 driver.findElement(By.id("title")).sendKeys(title);
		 driver.findElement(By.id("SAVE")).click();
		 
		 
	 }
	 @Then("^validate the Lead$")
	 public void validate_Lead() throws Throwable
	 {
		 driver.findElement(By.linkText("View Leads")).click();
		 Thread.sleep(2000);
		String Alead =driver.findElement(By.xpath("//a[contains(text(),'Priya Shitole')]")).getText();
		assertEquals("Priya Shitole", Alead);
	 }
	 
}