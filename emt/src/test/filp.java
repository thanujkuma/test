package test;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class filp {
	@Test 
		public void test() throws InterruptedException
		{

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Purple, 128 GB)']")).click();
		String p_id = driver.getWindowHandle();
		Set<String> c_id = driver.getWindowHandles();
		ArrayList<String> a = new ArrayList<String>(c_id);
		String s = a.get(1);
		driver.switchTo().window(s);
		Thread.sleep(2000);
		WebElement f = driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Purple, 128 GB)']/../../../div[2]/div[1]/div[4]/div[1]/div[1]/div[1]"));
		String text = f.getText();
		String st = text;
		String r = st.replaceAll(",", "");
		int value=Integer.parseInt(r);
		System.out.println(value);
		
		 
		System.out.println(text);
	}

@Test
public void test1() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 12");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	String w = driver.getWindowHandle();
	Set<String> h = driver.getWindowHandles();
	ArrayList<String> l = new ArrayList<String>(h);
	String t = l.get(1);
	driver.switchTo().window(t);
	Thread.sleep(2000);
	WebElement fe = driver.findElement(By.xpath("//span[.='49,900']"));
	String tex = fe.getText();
	String tex2 = tex;
	String ra = tex2.replaceAll(",", "");
	int value1=Integer.parseInt(ra);
	System.out.println(value1);
	
	
	
}
}

 

