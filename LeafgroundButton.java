package launchLeaftabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.navigate().back();
		System.out.println("position");
        System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation());
        System.out.println("colour");
        System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));;
        System.out.println("Size");
		System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());
		
		

	}

}
