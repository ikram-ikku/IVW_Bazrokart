package bazrokart.com;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dashboard_Page {

	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeClass
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.bazrokart.com/");

	}

	@Test(priority = 0)
	public void TC_DB_001() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//*[text()='Login as Manufacturer']")).click();
		driver.findElement(By.name("email")).sendKeys("ikramullahvm@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bazrokart@12");
		driver.findElement(By.xpath("//button[contains(@class,'w-full py-2.5 sm:py-3')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='I']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
		WebElement element = driver.findElement(By.xpath("//h1[text()=' Dashboard']"));
		String text = element.getText();
		System.out.println("User Navigated to Dashboard : " + text);
		assertEquals(text, "ikramullahvm@gmail.com Dashboard");

	}

	@Test(priority = 1)
	public void TC_DB_002() throws InterruptedException {

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bazrokart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement log = driver.findElement(By.xpath("//button[text()='Login']"));
		wait.until(ExpectedConditions.visibilityOf(log));
		log.click();
		driver.findElement(By.xpath("//*[text()='Login as Manufacturer']")).click();
		driver.findElement(By.name("email")).sendKeys("ikramullahvm@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bazrokart@12");
		driver.findElement(By.xpath("//button[contains(@class,'w-full py-2.5 sm:py-3')]")).click();
		driver.findElement(By.xpath("//div[text()='I']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();

		WebElement logo = driver.findElement(By.xpath("//img[@class=\"w-16 h-16 sm:w-20 sm:h-20 object-contain\"]"));
		boolean isdisplayed = logo.isDisplayed();
		System.out.println("The Logo is Displayed : " + isdisplayed);

		WebElement text1 = driver.findElement(By.xpath("//button[text()='Overview']"));
		String Overview = text1.getText();
		assertEquals(Overview, "Overview");
		System.out.println("The Overview Button is Displayed : " + Overview);

		WebElement text2 = driver.findElement(By.xpath("//button[text()='Analytics']"));
		String Analyst = text2.getText();
		assertEquals(Analyst, "Analytics");
		System.out.println("The Analytics Button is Displayed : " + Analyst);

		WebElement text3 = driver.findElement(By.xpath("//button[text()='Products']"));
		String products = text3.getText();
		assertEquals(products, "Products");
		System.out.println("The Products Button is Displayed : " + products);

		WebElement text4 = driver.findElement(By.xpath("//h3[text()='Top Buyers']"));
		String topbuyers = text4.getText();
		assertEquals(topbuyers, "Top Buyers");
		System.out.println("The TopBuyers Button is Displayed : " + topbuyers);

		WebElement searchbar = driver.findElement(By.xpath("//input[contains(@class,'w-full sm:w-64')]"));
		String searchbar1 = searchbar.getAttribute("placeholder");
		System.out.println("The SearchBar is Displayed : " + searchbar1);

	}

	@Test(priority = 2 )
	public void TC_DB_003() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bazrokart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//*[text()='Login as Manufacturer']")).click();
		driver.findElement(By.name("email")).sendKeys("ikramullahvm@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bazrokart@12");
		driver.findElement(By.xpath("//button[contains(@class,'w-full py-2.5 sm:py-3')]")).click();
		driver.findElement(By.xpath("//div[text()='I']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
		driver.findElement(By.xpath("//button[text()='Filter']")).click();

		driver.findElement(By.xpath("//button[text()='Top 5 Lowest Selling']")).click();
		WebElement text1 = driver.findElement(By.xpath("//span[text()='5']"));
		String drop1 = text1.getText();
		assertEquals(drop1, "5");
		System.out.println("the accuracy displayed in the charts is correct : " + drop1);

		driver.findElement(By.xpath("//button[text()='Filter']")).click();
		driver.findElement(By.xpath("//button[text()='Top 10 Available Quantity']")).click();

		WebElement text2 = driver.findElement(By.xpath("//span[text()='12']"));
		String drop2 = text2.getText();
		assertEquals(drop2, "12");
		System.out.println("the accuracy displayed in the charts is correct : " + drop2);
		
		WebElement element1 = driver.findElement(By.xpath("//button[text()='Top 10 Available Quantity']"));
		wait.until(ExpectedConditions.visibilityOf(element1));
		String button1 = element1.getText();
		assertEquals(button1, "Top 10 Available Quantity");
		System.out.println(button1);

		WebElement element2 = driver.findElement(By.xpath("//button[text()='Top 10 Highest Selling']"));		
		String button2 = element2.getText();
		assertEquals(button2, "Top 10 Highest Selling");
		System.out.println(button2);
		
		
		WebElement protext1 = driver.findElement(By.xpath("(//div[@class='flex items-center justify-between p-2 rounded-lg hover:bg-gray-50'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(protext1));
		String pro1 = protext1.getText();
		System.out.println(pro1);
		
		WebElement protext2 = driver.findElement(By.xpath("(//div[@class='flex items-center justify-between p-2 rounded-lg hover:bg-gray-50'])[2]"));
		wait.until(ExpectedConditions.visibilityOf(protext2));
 		String pro2 = protext2.getText();
 		System.out.println(pro2);
 		
 		System.out.println("Units Sold Breakdown List : "+pro1+" "+pro2);
		
		
		
		
		
		
		
		
		

	}

}
