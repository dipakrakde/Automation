import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
   @Test
		public void test() {
			
			System.setProperty("webdriver.driver.chrome","C:\\Users\\hii\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.in");
			
			driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
			driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
			//driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).click();
			
			driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Starlight/dp/B09G9D8KRQ/ref=sr_1_1_sspa?crid=UX1J00J7521D&keywords=iphone&qid=1701104719&sprefix=%2Caps%2C1420&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
			
			driver.findElement(By.id("add-to-cart-button")).click();
			
			
			
			
		
	}

}
