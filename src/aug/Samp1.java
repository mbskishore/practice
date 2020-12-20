package aug;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Drivers//chromedriver.exe");
		ChromeDriver c1= new ChromeDriver();
		c1.get("https://www.facebook.com/");
		Thread.sleep(1000);
	  c1.findElement(By.xpath("//input[@id='email']")).sendKeys("kishore143123@gmail.com");
	
	
	//	c1.findElement(By.cssSelector("img[class='_s0 _4ooo _1x2_ _1ve7 _1gax img']")).click();
		c1.findElement(By.id("pass")).sendKeys("password");
	//	c1.findElement(By.id("u_0_b")).click();
		System.out.println("Hi");
		c1.quit();
	}

}
