import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//firstcommit
public class Sample {

	public static void main(String[] args) 
	{
		System.out.println("Hello");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mpsc.gov.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		String p=driver.getWindowHandle();
		driver.switchTo().window(p);
		driver.get("https://www.atlassian.com/jira");
		System.out.println(driver.getTitle());
	}

}
