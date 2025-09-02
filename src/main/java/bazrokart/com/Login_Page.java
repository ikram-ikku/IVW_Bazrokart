package bazrokart.com;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Page {

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.bazrokart.com/");

	}

	@Test(priority = 1)
	public void validLogin() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Login as Customer']")).click();
		driver.findElement(By.name("email")).sendKeys("farzanavm01@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bazrokart@12");
		driver.findElement(By.xpath("//button[contains(@class,'w-full py-2.5 sm:py-3')]")).click();
		driver.findElement(By.xpath("//div[text()='F']")).click();
		WebElement text = driver.findElement(By.xpath("//div[text()='Ikramullah ']"));
		String name = text.getText();
		System.out.println(name);

	}

	@Test(priority = 0)
	public void invalidEmail() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Login as Customer']")).click();
		driver.findElement(By.name("email")).sendKeys("farzanavm@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bazrokart@12");
		driver.findElement(By.xpath("//button[contains(@class,'w-full py-2.5 sm:py-3')]")).click();
		WebElement element = driver.findElement(By.xpath("//span[text()='Login error: User not found']"));
		String errortext = element.getText();
		System.out.println(errortext);
		assertEquals(errortext, "Login error: User not found");

	}
             
	
	@Test(priority = -1)
	public void invalidPass() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Login as Customer']")).click();
		driver.findElement(By.name("email")).sendKeys("farzanavm01@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bazrokart@");
		driver.findElement(By.xpath("//button[contains(@class,'w-full py-2.5 sm:py-3')]")).click();
		WebElement element = driver.findElement(By.xpath("//span[text()='Login error: Invalid Password']"));
		String errortext = element.getText();
		System.out.println(errortext);
		assertEquals(errortext,"Login error: Invalid Password");

	}
	
	
	
	@Test(priority = -2)
	public void  invalidLogin() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Login as Customer']")).click();
		driver.findElement(By.name("email")).sendKeys("ikku@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bazrokart");
		driver.findElement(By.xpath("//button[contains(@class,'w-full py-2.5 sm:py-3')]")).click();
		WebElement element = driver.findElement(By.xpath("//span[text()='Login error: User not found']"));
		String errortext = element.getText();
		System.out.println(errortext);
		assertEquals(errortext, "Login error: User not found");
         
	}
	
	
	 
	
	
	
	
	
	
	
}
