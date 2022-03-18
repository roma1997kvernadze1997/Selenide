package BrowserStack;


import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumClass {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void OpenBrowser() {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\BrowserStack\\ProJava1\\driver\\chromedriver3.exe");
		WebDriverManager.chromedriver().driverVersion("93.0.4844.51").setup();
		driver = new ChromeDriver();
		String baseUrl = "https://www.amazon.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
	}

	@Test
	public void VerifyPageTitle() {
		
		String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = "";
        
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        WebElement element1 = driver.findElement(By.id("nav-logo"));
        element1.click();
	}
	
	@AfterTest
	public void CloseBrowser() {
        driver.close();
	}

}
