package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CRM.CRM.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Activity1step extends TestBase
{

WebDriver driver=base();
	
	@Given("^log in to CRM$")
	public void Create_New_User() throws Throwable
	{
		
		driver.get("https://alchemy.hguy.co/crm/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
}
	@When("^count no of dashlets$")
	public void dashlets()
	{
		List <WebElement> number= driver.findElements(By.className("dashlet-title"));
		System.out.println("Total dashlets="+number.size());	
		System.out.println("Dashlet names are:");
		for(int i=0;i<number.size();i++)		
			System.out.println(number.get(i).getText());
	}

}