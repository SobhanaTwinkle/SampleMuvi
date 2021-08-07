package com.sampleMuvi.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sampleMuvi.pageobjects.SamplePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Sample {
	
	static WebDriver driver;
	Actions action;
	static SamplePOM pom = null;
	
	@Given("^User logged in to Muvi application$")
	public void user_logged_in_to_Muvi_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Muvi_Assignment\\src\\main\\java\\com\\sampleMuvi\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.muvi.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@When("^logo of the application is present, user clicks on Free trial button$")
	public void logo_of_the_application_is_present_user_clicks_on_Free_trial_button() throws Throwable {
		pom = new SamplePOM (driver);
//		driver.switchTo().alert().accept();//
		//pom.Muvi_logo.isDisplayed();	
		//driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div/a[1]")).click(); 
		pom.free_trial.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^User-Info page appears , User fills all the information and click on Next button$")
	public void user_Info_page_appears_User_fills_all_the_information_and_click_on_Next_button() throws Throwable {
	   pom.userInfoBox.isDisplayed();
	   pom.uname.sendKeys("abpghsyd");
	   pom.cname.sendKeys("abphhoykj");
	   pom.phno.sendKeys("987654321091");
       pom.email.sendKeys("wl123@gmail.com");
	   pom.pswd.sendKeys("Abc24rt45@");
	   pom.subdomain.sendKeys("sdjghfjkss");
	   
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click();", pom.chkbox);
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   js.executeScript("arguments[0].click();", pom.nextbtn);
	   driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	   js.executeScript("arguments[0].scrollIntoView();", pom.nextbtn2);
	   js.executeScript("arguments[0].click();", pom.nextbtn2);
	   //pom.nextbtn2.click();
	   /*WebDriverWait wait2 = new WebDriverWait(driver, 10);
	   wait2.until(ExpectedConditions.elementToBeClickable(pom.nextbtn2));
	   js.executeScript("arguments[0].click();", pom.nextbtn2);*/
	  /* WebElement element = driver.findElement(By.xpath("//button[@id=\"nextbtn\"]"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(element).click().build().perform();*/
	   
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	}

	@When("^user is in Dashboard Page$")
	public void user_is_in_Dashboard_Page() throws Throwable {
		
		pom.dashboardTxt.isDisplayed();
	    pom.MM_nextbtn.click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    pom.CL_nextbtn.click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    pom.MT_nextbtn.click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    pom.Gotitbtn.click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    pom.dashboardTxt.isDisplayed();
	    
	}

	@Then("^Mousehovers to Manage Content and click on Content Library$")
	public void mousehovers_to_Manage_Content_and_click_on_Content_Library() throws Throwable {
	   action = new Actions(driver);
	   action.moveToElement(pom.MngCnt).perform();
	   pom.CntLib.click();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	}

	@When("^user Clicks on Add content$")
	public void user_Clicks_on_Add_content() throws Throwable {
	   pom.AddCnt.click();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("^fills the Basic Info section$")
	public void fills_the_Basic_Info_section() throws Throwable {
	    pom.CntName.sendKeys("abcCname");
	    pom.story.sendKeys("teststory");
	    pom.Cnt_Cat_Muv.click();
	    
	}

	@When("^Clicks on Save & Continue button$")
	public void clicks_on_Save_Continue_button() throws Throwable {
	    pom.savebtn.click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("^user checks for newly added content, it should be present in Content Library$")
	public void user_checks_for_newly_added_content_it_should_be_present_in_Content_Library() throws Throwable {
		String s1= pom.cntnameVerify.getText();
		String s2= pom.CntName.getText();
		
		if  (s1==s2)
		{
		   System.out.println("Content name Verified");
		}
		else
		{
		   System.out.println("Content name not present");
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();
	}
	
	
	
	
	
}
