package launchLeaftabs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
	    WebElement verify= driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
	    String expectedUrl=verify.getAttribute("href");
	    System.out.println(expectedUrl);
	    String link=driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
	    driver.navigate().to(link);
	    System.out.println(driver.getTitle());
	    System.out.println(link);
	    driver.navigate().back();
	   String link2= driver.findElement(By.xpath("(//a[@href='../home.html'])[3]")).getAttribute("href");
	    driver.navigate().to(link2);
	    driver.navigate().back();
	   List<WebElement> links=driver.findElements(By.tagName("a"));
	   int count=links.size();
	   System.out.println("total number of links: "+count);
	    
	}

}
