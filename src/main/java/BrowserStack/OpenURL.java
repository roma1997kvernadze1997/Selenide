package BrowserStack;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.codeborne.selenide.Condition;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OpenURL {
	
	//WebDriver driver = null;
	
	public void OpenBrowser() {
		open("https://demoqa.com/books");
	}
	
	public void VerifyExistingItems() {
		
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[2]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[3]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[4]")).shouldHave(Condition.appear);
		
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[1]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[3]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[4]")).shouldHave(Condition.appear);
		
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[1]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[2]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[3]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[4]")).shouldHave(Condition.appear);
		
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[1]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[2]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[3]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[4]")).shouldHave(Condition.appear);
		
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[5]/div/div[1]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[5]/div/div[2]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[5]/div/div[3]")).shouldHave(Condition.appear);
		$(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[5]/div/div[4]")).shouldHave(Condition.appear);
	}
	

}
