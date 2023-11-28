import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
	
	public void test() {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\hii\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
	  driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]")).click();
	  
	  driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  driver.findElement(By.xpath("//a[@id=\"createAccountSubmit\"]")).click();
		
	  driver.findElement(By.xpath("//input[@id=\"ap_customer_name\"]")).sendKeys("Dipak Rakde");
	  
	  driver.findElement(By.xpath("//input[@id=\"ap_phone_number\"]")).sendKeys("9284530341");
	  
	  driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("Dipak123");
	  
	  driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	}

	}


