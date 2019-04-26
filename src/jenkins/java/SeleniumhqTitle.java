package jenkins.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumhqTitle {
	@Test
	public void getTitlel() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\SrinidhiJenkinsJavaProject\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='header']/h1/a")).getText());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		driver.findElement(By.xpath("//a[text()='Documentation']")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
	   
	    driver.close();
	}
}
