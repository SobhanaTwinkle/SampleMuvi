package com.sampleMuvi.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamplePOM {

	public WebDriver wdriver;

	public SamplePOM(WebDriver rdriver) {
		wdriver = rdriver ;
		PageFactory.initElements(rdriver,this);
		}
		
		@FindBy(xpath="/html/body/div[2]/a[1]")
		@CacheLookup
		public  WebElement redirect_notice;
		
		@FindBy(xpath="//a[@class=\"navbar-brand mr-auto d-lg-none\"]/img")
		@CacheLookup
		public  WebElement Muvi_logo;
		
		@FindBy(xpath="//div[text()=\"No credit card required\"]/../a[1]")
		@CacheLookup
		public  WebElement free_trial;
		
		@FindBy(xpath="/html/body/div[3]/main/section[1]/div/div/div[2]/div")
		@CacheLookup
		public  WebElement userInfoBox;
		
		@FindBy(id="name")
		@CacheLookup
		public  WebElement uname;
		
		@FindBy(id="companyname")
		@CacheLookup
		public  WebElement cname;
		
		@FindBy(xpath="//*[@id=\"userinfo\"]/div[3]/input")
		@CacheLookup
		public  WebElement phno;
		
		@FindBy(id="email")
		@CacheLookup
		public  WebElement email;
		
		@FindBy(id="inputPassword")
		@CacheLookup
		public  WebElement pswd;
		
		@FindBy(id="subdomain")
		@CacheLookup
		public  WebElement subdomain;
		
		@FindBy(xpath="//label[@for=\"accept\"]")
		@CacheLookup
		public  WebElement chkbox;
		
		@FindBy(id="nextbtn")
		@CacheLookup
		public  WebElement nextbtn;
		
		@FindBy(xpath="//button[@id=\"nextbtn\"]")
		@CacheLookup
		public  WebElement nextbtn2;
		
		@FindBy(xpath="//*[@id=\"overlay-content\"]/div[1]/div[2]/div[1]/a")
		@CacheLookup
		public  WebElement MM_nextbtn;
		
		@FindBy(xpath="//*[@id=\"overlay-content\"]/div[2]/div[2]/div[1]/a[1]")
		@CacheLookup
		public  WebElement CL_nextbtn;

		@FindBy(xpath="//*[@id=\"overlay-content\"]/div[3]/div[2]/div[1]/a[1]")
		@CacheLookup
		public  WebElement MT_nextbtn;
		
		@FindBy(xpath="//*[@id=\"overlay-content\"]/div[4]/div[1]/div[1]/a[1]")
		@CacheLookup
		public  WebElement Gotitbtn;
		
		@FindBy(xpath="//*[@id=\"body_alert\"]/div[5]/div[3]/div[1]/div/div[1]/h3")
		@CacheLookup
		public  WebElement dashboardTxt;
		
		@FindBy(xpath="//*[@id=\"mCSB_1_container\"]/ul/li[2]/a")
		@CacheLookup
		public  WebElement MngCnt;
		
		@FindBy(xpath="//*[@id=\"mCSB_1_container\"]/ul/li[2]/ul/li[1]/a")
		@CacheLookup
		public  WebElement CntLib;
		
		@FindBy(xpath="//*[@id=\"body_alert\"]/div[5]/div[3]/div[3]/div/a[1]/button")
		@CacheLookup
		public  WebElement AddCnt;
		
		@FindBy(id="mname")
		@CacheLookup
		public  WebElement CntName;
		
		@FindBy(xpath="//*[@id=\"content_category_value\"]/option[1]")
		@CacheLookup
		public  WebElement Cnt_Cat_Muv;
		
		@FindBy(id="story")
		@CacheLookup
		public  WebElement story;
		
		@FindBy(id="save-btn")
		@CacheLookup
		public  WebElement savebtn;
		
		@FindBy(xpath="//*[@id=\"movie_list_tbl\"]/tbody/tr[1]/td[1]/a/div[2]")
		@CacheLookup
		public  WebElement cntnameVerify;
		
		
		
}
