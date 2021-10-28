package launchLeaftabs;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgrounddropdown {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("http://leafground.com/pages/Dropdown.html");
			WebElement selectTrainingProgram = driver.findElement(By.id("dropdown1")); 
			new Select(selectTrainingProgram).selectByIndex(1); 
			WebElement dropdown = driver.findElement(By.name("dropdown2")); 
			new Select(dropdown).selectByVisibleText("Selenium"); 
			WebElement dropdown2 = driver.findElement(By.id("dropdown3")); 
			new Select(dropdown2).selectByValue("1");  
			int count=driver.findElements(By.xpath("//option[@selected='selected']")).size();
			System.out.println("the number of dropdown are: "+count);
			driver.findElement(By.xpath("(//div[@class='example']//select)[5]")).sendKeys("Selenium");
			driver.findElement(By.xpath("//option[@disabled='true']/following-sibling::option[1]")).click();
	}

}
