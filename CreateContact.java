package launchLeaftabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("kavi");
		driver.findElement(By.id("lastNameField")).sendKeys("arasan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("kavi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("arasan");
		driver.findElement(By.name("departmentName")).sendKeys("sales");
		driver.findElement(By.id("createContactForm_description")).sendKeys("hello");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kaviarasancr498@gmail.com");
		WebElement elestate = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropstate = new Select(elestate);
		dropstate.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("welcome");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
