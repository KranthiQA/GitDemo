package Kranthi.MyfirstMav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class seleniumTest {
	@Test(groups="smoke")
	public void BrowserAutomation() {
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c=new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\chromedriver.exe" );
		WebDriver d=new ChromeDriver(c);
		d.get("https://www.google.com/");
		System.out.println("BrowserAutomation");
		System.out.println("this is branching in git");
	}
	@Test(groups= {"smoke"})
	public void hitURL() {
		System.out.println("hitURL");
		System.out.println("git");
		System.out.println("From other git");
	}
	@Test
	public void hitsecondURL() {
		System.out.println("hitsecondURL");
		System.out.println("git2");
		System.out.println("Wah branching	");
	}

}
