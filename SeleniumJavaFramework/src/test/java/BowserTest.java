import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BowserTest {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/C:/Users/Gaurav/java_workspace/SeleniumJavaFramework/Driver/Geekodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumhq.org");
	}
}
