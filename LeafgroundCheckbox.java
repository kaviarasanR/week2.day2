package launchLeaftabs;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundCheckbox {

	public static void main(String[] args) throws InterruptedException {   
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/checkbox.html");
	Thread.sleep(5000);
driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
WebElement tick = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
boolean isSelected = tick.isSelected();
if (isSelected==true) {
	System.out.println("selected");
}
driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
}
}
