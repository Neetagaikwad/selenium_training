package scriptshome;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class retrievejobstatus {
	
	@Test
	public void jobstatus() {
	String url="https://control.dtitsupport247.net";
	String jobstatus;
	
	WebDriver driver = new FirefoxDriver();
	driver.get(url);
	driver.findElement(By.xpath("//*[@id='user_txt']")).sendKeys("its.portal@continuum.net");
	driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("Its@1234");
	driver.findElement(By.xpath("//*[@id='Submit']")).click();
	driver.findElement(By.xpath("//*[@id='leftPanel_mnuJobs']/a")).click();
	driver.findElement(By.xpath("//*[@id='searchBox']")).sendKeys("test trigger_restartshutdown");
	driver.findElement(By.xpath("//*[@id='btnSearch']")).click();
	driver.findElement(By.xpath("//*[@id='JobHome']/table/tbody/tr/td[1]")).click();
	for(int i=1; i<=5; i++) {
	jobstatus = driver.findElement(By.xpath("//*[@id='JobInstance']/table/thead/tr/th[" + i + "]/a")).getText();
	System.out.println("Job status is " + jobstatus);
	//return fActualMPayment;
	}

}
}
