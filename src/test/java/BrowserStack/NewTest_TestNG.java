package BrowserStack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.sf.json.JSONObject;

public class NewTest_TestNG {
	
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
	}
	
	@Test
	public void ClickLogo() {
		WebElement element1 = driver.findElement(By.id("nav-logo"));
	    element1.click();
	}
	
	@Test
    public void readAllDetails() {
		
		Response response = RestAssured.get("https://chercher.tech/sample/api/product/read");
		// store the response body in string
		String responseBody = response.getBody().asString();
		// print the response
		System.out.println("Response Body is =>  " + responseBody);
		// store the response code
		int responseStatusCode = response.getStatusCode();
		System.out.println("************************************************");
		System.out.println("Status Code => "+ responseStatusCode);
		System.out.println(response.getTimeIn(TimeUnit.MILLISECONDS));
	}
	
	@Test
	public void putDetails() {
		
		RequestSpecification reqSpec = RestAssured.given();

		JSONObject jo = new JSONObject();
		jo.put("name", "myname");
		jo.put("description", "that is my name");
		jo.put("price", "122222");
		reqSpec.body(jo.toString());

		Response resp = reqSpec.put("https://chercher.tech/sample/api/product/create");
		System.out.println("Response code => " +resp.statusCode());
		
	}
	
	@AfterTest
	public void CloseBrowser() {
		//close Fire fox
      driver.close();
	}

}
