package Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class seleniumtest {

	public static void main(String[] args) throws InterruptedException {
		//Login_Admin();
		Addmemo();
	}
	
	
	public static void Login_Admin()
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

//       
        driver.get("https://aerouat.fluidmojo.com/auth");
        driver.findElement(By.id("basic_email")).click();
        driver.findElement(By.id("basic_email")).clear();
        driver.findElement(By.id("basic_email")).sendKeys("ribeyoh557@grassdev.com");
        driver.findElement(By.id("basic_password")).clear();
        driver.findElement(By.id("basic_password")).sendKeys("a=@3u91!|K/");
        driver.findElement(By.id("basic_password")).click();
        driver.findElement(By.id("basic_password")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.quit();
        System.out.println("Success");
      }
	
	public static void Addmemo() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();

//      String projectPath= System.getProperty("user.dir");
//      System.out.println(projectPath);
		
      driver.get("https://aerouat.fluidmojo.com/auth");
      driver.manage().window().maximize();


      driver.findElement(By.id("basic_email")).click();
      driver.findElement(By.id("basic_email")).clear();
      driver.findElement(By.id("basic_email")).sendKeys("ribeyoh557@grassdev.com");
      driver.findElement(By.id("basic_password")).clear();
      driver.findElement(By.id("basic_password")).sendKeys("a=@3u91!|K/");
      driver.findElement(By.id("basic_password")).click();
      driver.findElement(By.id("basic_password")).click();
      driver.findElement(By.xpath("//button[@type='button']")).click();
      Thread.sleep(10000);
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add New Project'])[1]/preceding::*[name()='svg'][4]")).click();
      Thread.sleep(3000);
     
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Project ops'])[1]/following::*[name()='svg'][8]")).click();
   
      Thread.sleep(3000);
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='HR ops'])[1]/following::p[9]")).click();
      Thread.sleep(3000);
//      driver.findElement(By.id("title")).click();
//      driver.findElement(By.id("title")).clear();
      Thread.sleep(3000);
      //driver.findElement(By.id("title")).sendKeys("Newtest");
      Thread.sleep(3000);
      
      driver.quit();
	}
	
	

}