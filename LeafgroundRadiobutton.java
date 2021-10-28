package launchLeaftabs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundRadiobutton{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.id("yes")).click();
		WebElement tick  = driver.findElement(By.xpath("(//input[@name='news'])[2]"));
		boolean Selected = tick.isSelected();
		if(Selected==true) {
			System.out.println("checked");
		}
	}
	}


