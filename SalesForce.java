package launchLeaftabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("UserFirstName")).sendKeys("kavi");
		driver.findElement(By.name("UserLastName")).sendKeys("arasan");
		driver.findElement(By.name("UserEmail")).sendKeys("kaviarasancr498@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("testleaf");
		driver.findElement(By.name("UserPhone")).sendKeys("6382537741");
		WebElement title = driver.findElement(By.name("UserTitle"));
		Select dropdown = new Select(title);
		dropdown.selectByIndex(7);
		WebElement companyemp = driver.findElement(By.name("CompanyEmployees"));
		Select dropdown1 = new Select(companyemp);
		dropdown1.selectByIndex(2);
		WebElement companycountry = driver.findElement(By.name("CompanyCountry"));
		Select dropdown2 = new Select(companycountry);
		dropdown2.selectByVisibleText("India");
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
