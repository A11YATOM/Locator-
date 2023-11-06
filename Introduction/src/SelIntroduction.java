import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrana\\Downloads\\chromedriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrana\\Downloads\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mrana\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	
		driver.get("https://www.williams-sonoma.com/customer-service/order-shipment-tracking/?signInFailure=true");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();
	}

}


