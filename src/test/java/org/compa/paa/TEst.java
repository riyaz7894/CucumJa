package org.compa.paa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TEst {
	WebDriver ame;

	@Given("The user in the  demo.guru99.com")
	public void the_user_in_the_demo_guru99_com() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riyaz\\eclipse-w\\Seleium12\\driver\\chromedriver.exe");
		  ame = new ChromeDriver();
		 ame.get("http://demo.guru99.com/telecom/");
		 ame.manage().window().maximize(); 
		 ame.findElement(By.xpath("(//a[text()='Add Tariff Plan'])[1]")).click();

	}
	@When("The user want to enter the username {string},{string},{string},{string},{string}")
	public void the_user_want_to_enter_the_username(String item, String MonthlyRenta, String LocalMinutes, String InternationalMinutes, String SMSPac) {
	    ame.findElement(By.id("rental1")).sendKeys(MonthlyRenta);
	    ame.findElement(By.id("local_minutes")).sendKeys(LocalMinutes);
	    ame.findElement(By.id("inter_minutes")).sendKeys(InternationalMinutes);
	    ame.findElement(By.id("sms_pack")).sendKeys(SMSPac);

	    }

	@Then("The username should ne displayed {string},{string},{string},{string},{string}")
	public void the_username_should_ne_displayed(String item, String MonthlyRenta, String LocalMinutes, String InternationalMinutes, String SMSPac) {
		String retext =	 ame.findElement(By.id("rental1")).getAttribute("value");
		Assert.assertTrue(retext.contains(MonthlyRenta));
		String localtext =	    ame.findElement(By.id("local_minutes")).getAttribute("value");
		Assert.assertTrue(localtext.contains(localtext));
		String i =    ame.findElement(By.id("inter_minutes")).getAttribute("value");
		Assert.assertTrue(i.contains(InternationalMinutes));

		    String smstxt = ame.findElement(By.id("sms_pack")).getAttribute("value");
			Assert.assertTrue(smstxt.contains(SMSPac));

	}

}
