package BrowserStack;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.*;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.ShouldHave;
import com.codeborne.selenide.selector.ByText;
import BrowserStack.OpenURL;
import net.bytebuddy.matcher.CollectionElementMatcher;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import static com.codeborne.selenide.Condition.*;


public class Class1 {
	
	OpenURL open = new OpenURL();
	
	@Test
	public void Task1() {
		
		open.OpenBrowser();
		open.VerifyExistingItems();
		
	}
	
	@Test
	public void Task2() {
		
		open.OpenBrowser();
		
		String book1 = $(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]")).getText();
		Assert.assertTrue(book1.contains("JavaScript"));
		String book2 = $(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[2]")).getText();
		Assert.assertTrue(book2.contains("JavaScript"));
		String book3 = $(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[6]/div/div[2]")).getText();
		Assert.assertTrue(book3.contains("JavaScript"));
		String book4 = $(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[7]/div/div[2]")).getText();
		Assert.assertTrue(book4.contains("JavaScript"));
		
		LinkedList<String> link = new LinkedList<String>();
		link.add(book1);
		link.add(book2);
		link.add(book3);
		link.add(book4);
		
		System.out.println(link);
		System.out.println(link.size());
		
		//assertEquals(link.size(), 10);
		if(link.size() == 10) {
			System.out.println("Link size is correct!");
		}
		else {
			System.out.println("Link size is NOT correct!");
		}
		
		
		String FirstElement = link.getFirst();
		String ShouldMatch = "Learning JavaScript Design Patterns";
		
		System.out.println(FirstElement);
		System.out.println(ShouldMatch);
		
		assertEquals(FirstElement, ShouldMatch);
				
	}

}
