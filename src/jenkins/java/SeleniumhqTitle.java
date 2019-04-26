package jenkins.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumhqTitle {
	@Test
	public void getTitlel()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TestYantra\\SrinidhiJenkinsJavaProject\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		System.out.println("Selenium");
		System.out.println(driver.findElement(By.xpath("//div[@id='header']/h1/a")).getText());
		driver.findElement(By.xpath("//a[text()='Download']")).click();
	    System.out.println(driver.getTitle());
	    driver.close();
	}
}
