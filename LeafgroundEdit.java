package launchLeaftabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundEdit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("email")).sendKeys("kaviarasancr498@gmail.com");

		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("kavi");
		WebElement keyboardtab = driver.findElement(By.xpath("//input[@value='Append ']"));
		keyboardtab.sendKeys(Keys.TAB);
		String value = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		System.out.println(value);
		driver.findElement(By.xpath("(//input[@align='left'])[2]")).clear();
		boolean enable = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		if (!enable) {
			System.out.println(" disabled");

		}
	}
}
