package stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CRM.CRM.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity3Step extends TestBase
{
WebDriver driver=base();
	
	@Given("^Log in to Alchemy CRM$")
	public void Create_New_User() throws Throwable
	{
		
		driver.get("https://alchemy.hguy.co/crm/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
    }
	@When("^Schedule a meeting \"(.*)\"$")
	public void meeting(String subject) throws Throwable
	{
		driver.findElement(By.id("grouptab_3")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("moduleTab_9_Meetings")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Schedule Meeting")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys(subject);
		//Find the date time picker control

        WebElement dateBox1 = driver.findElement(By.id("date_start_trigger"));

        //Fill date as mm/dd/yyyy as 09/25/2013

        dateBox1.sendKeys("10202020");
        WebElement dateBox2 = driver.findElement(By.id("date_start_trigger"));
      
        dateBox2.sendKeys("10202020");
        
        
        Thread.sleep(2000);
        driver.findElement(By.id("search_first_name")).sendKeys("priya");
        driver.findElement(By.id("invitees_search")).click();
        driver.findElement(By.id("invitees_add_1")).click();
        driver.findElement(By.id("invitees_add_2")).click();
        driver.findElement(By.id("save_and_send_invites_header")).click();
             
        
		
	}
	@Then("^Confirm creation of meeting$")
	public void confirmMeeting() throws Throwable
	{
		driver.findElement(By.linkText("View Meetings")).click();
		Thread.sleep(2000);
		String meeting=driver.findElement(By.xpath("//a[contains(text(),'scrum call')]")).getText();
		assertEquals("scrum call", meeting);
	}

}
