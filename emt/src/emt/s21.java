package emt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class s21 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.findElement(By.xpath("//div[@class='text']")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("thanujkumar8495");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Live@123");
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		driver.findElement(By.xpath("//div[@class='icon mail']")).click();
		driver.findElement(By.xpath("//a[@data-test-id='compose-button']")).click();
		driver.findElement(By.xpath("//input[@id='message-to-field'")).sendKeys("thanujkumardm8495@gmail.com");
		driver.findElement(By.xpath("//input[@id='message-to-field'")).sendKeys("hi");
		driver.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
}
}
