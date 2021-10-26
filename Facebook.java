package launchLeaftabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("kaviarasan");
		driver.findElement(By.name("lastname")).sendKeys("R");
		driver.findElement(By.name("reg_email__")).sendKeys("6382537741");
		driver.findElement(By.id("password_step_input")).sendKeys("abcd@123"); // day
		WebElement day = driver.findElement(By.id("day"));
		Select dropDown = new Select(day);
		dropDown.selectByIndex(4);
		WebElement month = driver.findElement(By.id("month"));
		Select dropDown1 = new Select(month);
		dropDown1.selectByIndex(8);
		WebElement year = driver.findElement(By.id("year"));
		Select dropDown2 = new Select(year);
		dropDown2.selectByIndex(23);
		driver.findElement(By.xpath("//input[@name='sex']/following::input")).click();

	}

}
