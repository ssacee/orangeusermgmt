package com.runner;

//import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClassOHRM;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sasi\\eclipse\\Cucumber\\src\\test\\java\\Feature", glue= {"com\\steps"}, dryRun=false,monochrome=false,plugin="pretty")
public class TestRunner extends BaseClassOHRM {

	public static WebDriver driver;
	
	  
}
