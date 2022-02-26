package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Agilysys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Geetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugesan");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT Department");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating New Lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hemamurugesan2794@gmail.com");
		WebElement Province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sc = new Select(Province);
		sc.selectByVisibleText("New York ");
		driver.findElement(By.name("description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important Note Text");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Lead Created sucessfully");
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("syntel");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("udhaya");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		System.out.println("Lead Duplicated Sucessfully");

		
		
		
	}

}
