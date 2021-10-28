package launchLeaftabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath(" //input[@name='phoneNumber'] ")).sendKeys("6382537741");
		driver.findElement(By.linkText("Find Leads")).click();
		String text = driver.findElement(By.xpath("(//td[contains(@class,'cell-first ')])[1]/div/a")).getText();	
		System.out.println(text);
		driver.findElement(By.xpath("(//td[contains(@class,'cell-first ')])[1]/div/a")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.name("id")).sendKeys(text);
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(2000);
		String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(text2);
		if (text2.equalsIgnoreCase("No records to display"))
		{
			System.out.println("successful deletion");
		}
	}

}

