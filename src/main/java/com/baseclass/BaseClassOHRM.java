package com.baseclass;
	import java.io.File;
	import java.io.IOException;
	import java.util.List;
	import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.devtools.v97.browser.Browser;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	//import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClassOHRM {
		public static WebDriver driver;

		public static WebDriver getDriver(String browser) {
			try {
				if (browser.equalsIgnoreCase("chrome")) {
					//System.setProperty("webdriver.chrome.driver","C:\\Users\\sasi\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
					ChromeOptions chromeOpt = new ChromeOptions();
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver(chromeOpt);
				}
				else if (browser.equalsIgnoreCase("ie")) {
					//System.setProperty("webdriver.ie.driver","C:\\Users\\sasi\\eclipse-workspace\\Selenium\\Drivers\\IEDriverServer.exe");
					WebDriverManager.iedriver().setup();
					driver=new InternetExplorerDriver();
				}
				/*else if (browserName.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver","C:\\Users\\sasi\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
					driver=new geckodriver();
					driver.get("https://www.amazon.in");
					}*/
				else {
					System.out.println("Invalid browser");
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return driver;
		}
		public static void manage() {
			try {
				driver.manage().window().maximize();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void close() {
			try {
				driver.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		public static void quit() {
			try {
				driver.quit();
			} catch (Exception e) {
				
				e.printStackTrace();
			}


		}
		public static void navigateTo(WebDriver driver ,String linkTo) {
			try {
				driver.navigate().to(linkTo);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		public static void navigateBack(WebDriver driver , String linkBack) {
			try {
				driver.navigate().back();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		public static void navigateFor(WebDriver driver , String linkFor) {
			try {
				driver.navigate().forward();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		public static void navigateRef() {
			try {
				driver.navigate().refresh();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}


		public static void getUrl(String webLink) {
			try {
				driver.get(webLink);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}	
		public static void getcurUrl(String Link) {
			try {
				String currentUrl = driver.getCurrentUrl();
				System.out.println("Current Url  :"  +currentUrl);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void getTitle(String Title) {
			try {
				String title = driver.getTitle();
				System.out.println("Title :" + title);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		public static void getPageSrc(WebDriver driver , String displayValues) {
			try {
				String pageSource = driver.getPageSource();
				System.out.println("Source :-" + pageSource);
			} catch (Exception e) {
				e.printStackTrace();
			}


		}

		public static void WinHandle(String window) {
			try {
				String windowHandle = driver.getWindowHandle();
				System.out.println("Window  :" + windowHandle );
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void WinHandles(String windows ) {
			try {
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println(windowHandles);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void alertAccept() {

			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void alertDismiss() {
			try {
				driver.switchTo().alert().dismiss();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void alertGetText() {
			try {
				String alertText = driver.switchTo().alert().getText();
				System.out.println("Display text   :"  + alertText);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void actionClass(WebElement element) {
			try {
				Actions builder = new Actions(driver);
				builder.click().perform();
				builder.contextClick().perform();
				builder.moveToElement(element).perform();
				builder.contextClick(element).perform();
				builder.dragAndDrop(element, element).perform();
				builder.sendKeys(element,"value").perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void builder(Actions action) {
			try {
				Actions act= new Actions(driver);
				act.click().perform();
				act.clickAndHold().perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void sendkey(WebElement element,String value) {
			try {
				element.sendKeys(value);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}


		public static void frameClass(WebElement element) {
			try {
				driver.switchTo().frame(0);
				driver.switchTo().frame("");
				driver.switchTo().defaultContent();
				driver.switchTo().parentFrame();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void selectClass(WebElement element) {
			try {
				Select dropdown = new Select(element);
				dropdown.deselectAll();
				dropdown.deselectByIndex(0);
				dropdown.deselectByValue("");
				dropdown.deselectByVisibleText("");
				dropdown.selectByIndex(0);
				List<WebElement> allSelectedOptions = dropdown.getAllSelectedOptions();
				for (WebElement selections : allSelectedOptions) {
					System.out.println(selections);

				}
				WebElement firstSelectedOption = dropdown.getFirstSelectedOption();
				System.out.println("Display First Option :"  +firstSelectedOption);
				List<WebElement> options = dropdown.getOptions();
				for (WebElement option : options) {
					System.out.println(option);

				}
				boolean multiple = dropdown.isMultiple();
				System.out.println("T/F :" + multiple);

				dropdown.selectByIndex(0);
				dropdown.selectByValue("");
				dropdown.selectByVisibleText("");
				List<WebElement> getopt = dropdown.getOptions();
				for (WebElement opt : getopt) {
					System.out.println(opt);
					
					

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void checkBox(WebElement element) {
			try {
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		
		public static void selectByIndex(WebElement element,int i) {
			try {
				Select ind = new Select(element);
				ind.selectByIndex(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		public static void selectByvisible(WebElement element,String s) {
			try {
				Select text = new Select(element);
				text.selectByVisibleText(s);
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		
		public static void selectByvalue(WebElement element,String k) {
			try {
				Select value = new Select(element);
				value.selectByValue(k);
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		
		public static void isEnable(WebElement element) {
			try {
				boolean enabled = element.isEnabled();
				System.out.println("Is it enabled ? "+enabled);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void isDisplayed(WebElement element) {
			try {
				boolean displayed = element.isDisplayed();
				System.out.println("Is it Displayed ?" + displayed);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void isSelected(WebElement element) {
			try {
				boolean selected = element.isSelected();
				System.out.println("Is the element selected? "  + selected);
			} catch (Exception e) {
				e.printStackTrace();
			}	

		}

		public static void getAttribute(WebElement element) {
			try {
				String attribute = element.getAttribute(null);
				System.out.println("Attribute Value :" + attribute);
			} catch (Exception e) {
				e.printStackTrace();
			}


		}
		public static void getLocation(WebElement element ) {
			try {
				Point location = element.getLocation();
				location.x=0;
				location.y=0;
				int x = location.getX();
				System.out.println(x);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		public static void  screenShot()  {

			try {
				TakesScreenshot ts=(TakesScreenshot)driver;
				File source=ts.getScreenshotAs(OutputType.FILE);
				File dest= new File("C:\\Users\\sasi\\eclipse\\Cucumber\\screenshot\\images.png");
				FileUtils.copyFileToDirectory(source, dest);
			} catch (WebDriverException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}  



		}
		public static void scrollUpDown(WebElement element) {
			try {
				JavascriptExecutor execute = (JavascriptExecutor) driver;
				execute.executeScript("arguments[0].scrollIntoView()",element);
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}


		}
		public static void  enterContent(WebElement element , String content) {
			try {
				element.sendKeys(content);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}


		public static void click(WebElement element) {
			try {
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	

		public static void clear(WebElement element) {
			try {
				element.clear();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}



