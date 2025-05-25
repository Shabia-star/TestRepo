//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//
//public class TestNGDemo2 {
//	WebDriver driver= null;;
//	
//	@BeforeTest
//	public void setupTest()
//	{
//	
//		 String projectPath= System.getProperty("user.dir");
//     System.setProperty("webdriver.chrome.driver",projectPath+"/drivers.chromedriver.exe");
//      System.out.println(projectPath+"/drivers.chromedriver.exe");
//	       driver = new ChromeDriver();
//	       System.out.println(driver);
//
//	
//
//}
//	@Test
//	public void AddMemo_Send() throws InterruptedException
//	{
//		
//		driver.get("https://aerouat.fluidmojo.com/auth");
//	      driver.manage().window().maximize();
//
//
//	      driver.findElement(By.id("basic_email")).click();
//	      driver.findElement(By.id("basic_email")).clear();
//	      driver.findElement(By.id("basic_email")).sendKeys("ribeyoh557@grassdev.com");
//	      driver.findElement(By.id("basic_password")).clear();
//	      driver.findElement(By.id("basic_password")).sendKeys("a=@3u91!|K/");
//	      driver.findElement(By.id("basic_password")).click();
//	      driver.findElement(By.id("basic_password")).click();
//	      driver.findElement(By.xpath("//button[@type='button']")).click();
//	      Thread.sleep(10000);
//	      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add New Project'])[1]/preceding::*[name()='svg'][4]")).click();
//	      Thread.sleep(3000);
//	     
//	      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Project ops'])[1]/following::*[name()='svg'][8]")).click();
//	   
//	      Thread.sleep(3000);
//	      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='HR ops'])[1]/following::p[9]")).click();
//	      Thread.sleep(3000);
//	     
//	      Thread.sleep(3000);
//	      //driver.findElement(By.id("title")).sendKeys("Newtest");
//	      Thread.sleep(3000);
//	      
//	     
//	}
//	
//	
//	@Test
//	public void AddMemo_SaveDraft() throws InterruptedException
//	{
//		
//	}
//	
//	
//	@AfterTest
//	public void TearDownTest()
//	{
//		 driver.quit();
//		 System.out.println("Test completed successfully");
//	}
//
//}
