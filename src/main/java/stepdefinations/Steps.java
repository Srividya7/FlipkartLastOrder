package stepdefinations;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps extends Base {

	@Before
	public void openBrowser(){
		Base.initBrowser();
	}
		

	@Given("^User is on Application  Page$")
	public void Application_Page() throws Exception{
		String actualTitle = driver.getTitle();
	    String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	    Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	Properties p=initproperties();
	@Then("^User enter username and password$")
	public void login(){
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(p.getProperty("phone"));
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}
	
	@Then("^User mousehover on username in menubar$")
	public void mousehover() throws InterruptedException {
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		WebElement menu = driver.findElement(By.className("_28p97w"));
		action.moveToElement(menu).perform();
	}

	@Then("^User click on orders$")
	public void orders(){
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[4]/a")).click();
		// click on last order item
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[3]/div/div[1]/div/a/div/div[1]/div/div[1]/div/div/img")).click();
	}

	@Then("^User extract last placed order in flipkart$")
	public void extract(){
		String Str = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[4]/div/div[1]/div[1]/div/div[2]/a")).getText();
		System.out.println("Last placed order is:");
		System.out.println(Str);
		
	}
	@After
	public void closebrowser() {
		driver.close();
	}
}
