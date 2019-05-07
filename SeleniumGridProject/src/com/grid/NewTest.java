package com.grid;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class NewTest {
	public WebDriver driver;
	@Parameters({"browser"})
  @Test(priority=1)
  public void openBrowser(String browsernm) throws MalformedURLException {
	  System.out.println("In chrome browser");
		DesiredCapabilities capabilities=new DesiredCapabilities().chrome();
		capabilities.setPlatform(Platform.WINDOWS);
		String node="http://192.168.0.39:4444/wd/hub";
		driver=new RemoteWebDriver(new URL(node), capabilities);
	  
  }
  @Test(priority=2)
  public void enterUrl() {
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
  }

}
