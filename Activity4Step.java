package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CRM.CRM.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity4Step extends TestBase
{
WebDriver driver=base();
	
	@Given("^Open Browser and log in$")
	public void Create_New_User() throws Throwable
	{
		
		driver.get("https://alchemy.hguy.co/crm/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
    }
	@When("^create product with \"(.*)\",\"(.*)\",\"(.*)\"$")
	public void product(String Pname,String part, String price) throws Throwable
	{
		driver.findElement(By.id("grouptab_5")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Products")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Product")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys(Pname);
		driver.findElement(By.id("part_number")).sendKeys(part);
		driver.findElement(By.id("price")).sendKeys(price);
		driver.findElement(By.id("SAVE")).click();
	}
	
	  @Then("^validate Product$")
	  public void verify() throws Throwable
	  {
		  driver.findElement(By.linkText("View Products")).click(); 
		  Thread.sleep(2000);
		  String abc=driver.findElement(By.xpath("//a[contains(text(),'Intel Processor')]")).getText(); 
		  assertEquals("Intel Processor", abc);
	  }

}
