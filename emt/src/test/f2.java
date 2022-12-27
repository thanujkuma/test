package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class f2 extends f1{
	@Test
	public void tes() throws AWTException, InterruptedException
	{
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		Dimension d = new Dimension(100, 100);
		driver.manage().window().setSize(d);
		Point p = new Point(20,10);
		driver.manage().window().setPosition(p);
		
	}
	

}
