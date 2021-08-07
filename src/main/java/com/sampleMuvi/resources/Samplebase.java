package com.sampleMuvi.resources;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.sampleMuvi.pageobjects.SamplePOM;

public class Samplebase {
	public static WebDriver driver;
	Actions action;
//	public static  pom
	
	
	public void initializeObjects() throws IOException, Exception {
		SamplePOM pom = new SamplePOM (driver);
	}
}
