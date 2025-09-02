package bazrokart.com;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_page {

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.bazrokart.com/");

	}

	@Test(priority = -1)

	public void RegWithValidData() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

		WebElement logo = driver.findElement(By.xpath("//img[@class='h-full w-full object-contain']"));
		System.out.println("Logo is visible :" + logo.isDisplayed());
		System.out.println("Logo is enable :" + logo.isEnabled());

		WebElement reg = driver.findElement(By.xpath("//button[text()='Register']"));
		System.out.println("regButton is visible :" + reg.isDisplayed());
		reg.click();

		WebElement reg2 = driver.findElement(By.xpath("//span[text()='Register as Customer']"));
		System.out.println("Register as Customer is visible :" + reg2.isDisplayed());
		reg2.click();
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("//h2[text()='Customer Registration']"));
		System.out.println("text is displayed :" + text.getText());

		driver.findElement(By.name("name")).sendKeys("Ikramullah VM");
		driver.findElement(By.name("email")).sendKeys("sdsstardrivingshoes@gmail.com");
//		driver.findElement(By.xpath("//li[@class=\'country highlight\']")).click();
//		driver.findElement(By.xpath("//span[text()='India']")).click();		
		driver.findElement(By.name("phone")).sendKeys("7550397862");
		driver.findElement(By.name("password")).sendKeys("Bazrokart@12");
		driver.findElement(By.name("confirmPassword")).sendKeys("Bazrokart@12");
		driver.findElement(By.name("hint")).click();
		driver.findElement(By.xpath("//option[text()='What is your nickname?']")).click();
		driver.findElement(By.name("hint_answer")).sendKeys("ikku");
		driver.findElement(By.name("agreeTerms")).click();
		driver.findElement(By.name("newsUpdates")).click();
		driver.findElement(By.xpath("//button[text()='Verify email']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Verify OTP']")).click();
    	driver.findElement(By.xpath("//button[text()='Register your account']")).click();
        WebElement conftext = driver.findElement(By.xpath("//button[@class='p-1 pl-2 rounded-full transition']"));
        conftext.getText();
        driver.findElement(By.xpath("//div[text()='ikramullahvm@gmail.com'][1]"));
		System.out.println("User got Registed with valid Data");

	}

	@Test(enabled = false)

	public void RegWithExistEmail() throws InterruptedException {

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

		WebElement logo = driver.findElement(By.xpath("//img[@class='h-full w-full object-contain']"));
		System.out.println("Logo is visible :" + logo.isDisplayed());
		System.out.println("Logo is enable :" + logo.isEnabled());

		WebElement reg = driver.findElement(By.xpath("//button[text()='Register']"));
		System.out.println("regButton is visible :" + reg.isDisplayed());
		reg.click();

		WebElement reg2 = driver.findElement(By.xpath("//span[text()='Register as Customer']"));
		System.out.println("Register as Customer is visible :" + reg2.isDisplayed());
		reg2.click();
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("//h2[text()='Customer Registration']"));
		System.out.println("text is displayed :" + text.getText());

		driver.findElement(By.name("name")).sendKeys("Shoaib");
		driver.findElement(By.name("email")).sendKeys("farzanavm01@gmail.com");
//		driver.findElement(By.xpath("//li[@class=\'country highlight\']")).click();
//		driver.findElement(By.xpath("//span[text()='India']")).click();
		driver.findElement(By.name("phone")).sendKeys("9867654789");
		driver.findElement(By.name("password")).sendKeys("Bazrokart@12");
		driver.findElement(By.name("confirmPassword")).sendKeys("Bazrokart@12");
		driver.findElement(By.name("hint")).click();
		driver.findElement(By.xpath("//option[text()='What is your nickname?']")).click();
		driver.findElement(By.name("hint_answer")).sendKeys("shoaib");
		driver.findElement(By.name("agreeTerms")).click();
		driver.findElement(By.name("newsUpdates")).click();
		driver.findElement(By.xpath("//button[text()='Verify email']")).click();
		WebElement toasttext = driver.findElement(By.xpath("//span[contains(@class,'text-[15px]')]"));
		boolean isDisplayed = toasttext.isDisplayed();
		System.out.println("Toast text element: " + toasttext.getText());
		Assert.assertTrue(isDisplayed);
//		driver.findElement(By.xpath("//button[text()='Register your account']")).click();
		System.out.println("The Registration got stoped scenes the Email is already registered");

	}

	@Test(enabled = false)

	public void RegWithExistPhoneNO() throws InterruptedException {

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

		WebElement logo = driver.findElement(By.xpath("//img[@class='h-full w-full object-contain']"));
		System.out.println("Logo is visible :" + logo.isDisplayed());
		System.out.println("Logo is enable :" + logo.isEnabled());

		WebElement reg = driver.findElement(By.xpath("//button[text()='Register']"));
		System.out.println("regButton is visible :" + reg.isDisplayed());
		reg.click();

		WebElement reg2 = driver.findElement(By.xpath("//span[text()='Register as Customer']"));
		System.out.println("Register as Customer is visible :" + reg2.isDisplayed());
		reg2.click();
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("//h2[text()='Customer Registration']"));
		System.out.println("text is displayed :" + text.getText());

		driver.findElement(By.name("name")).sendKeys("Rasqih");
		driver.findElement(By.name("email")).sendKeys("sdsstardrivingshoes@gmail.com");
//   	driver.findElement(By.xpath("//li[@class=\'country highlight\']")).click();
//  	driver.findElement(By.xpath("//span[text()='India']")).click();
		driver.findElement(By.name("phone")).sendKeys("7550397862");
		driver.findElement(By.name("password")).sendKeys("Bazrokart@12");
		driver.findElement(By.name("confirmPassword")).sendKeys("Bazrokart@12");
		driver.findElement(By.name("hint")).click();
		driver.findElement(By.xpath("//option[text()='What is your nickname?']")).click();
		driver.findElement(By.name("hint_answer")).sendKeys("rash");
		driver.findElement(By.name("agreeTerms")).click();
		driver.findElement(By.name("newsUpdates")).click();
		
		driver.findElement(By.xpath("//button[text()='Register your account']")).click();
		System.out.println("The Registration got stoped scenes the Phone_NO is already registered");
        
	}

}
