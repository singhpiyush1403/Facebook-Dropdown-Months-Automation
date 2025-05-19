
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMonth {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	  WebElement createaccountButton =  driver.findElement(By.xpath("//a[text()='Create new account']"));
	  createaccountButton.click();

	WebElement drop = driver.findElement(By.id("month"));
	List<WebElement> dropList = drop.findElements(By.tagName("option"));
	System.out.println("Total availabel dropdownList:"+ dropList.size());
	for(int i=0; i<dropList.size(); i++) {
	System.out.println(dropList.get(i).getText());
	}

	}

}

