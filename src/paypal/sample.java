package paypal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class sample 
{
	static WebDriver driver;
	@BeforeMethod
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.paypal.com/in/home");
		Thread.sleep(5000);
		WebElement click_on_login_button = driver.findElement(By.xpath("//a[text()='Login']"));
		click_on_login_button.click();
		Thread.sleep(5000);
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		UserName.sendKeys("9182433739");
		WebElement click_on_Next = driver.findElement(By.xpath("//button[@id='btnNext']"));
		click_on_Next.click();
		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("vinay123");
		WebElement click_On_Login = driver.findElement(By.xpath("//button[@id='btnLogin']"));
		click_On_Login.click();
	}
/*	@Test
	public void SummaryFunctions() throws InterruptedException  {
		WebElement Click_On_Summary = driver.findElement(By.xpath("//a[@id='header-newSummary']"));
		Click_On_Summary.click();
		Thread.sleep(2000);
		WebElement Click_On_Send_Button = driver.findElement(By.xpath("//span[text()='Send']"));
		Click_On_Send_Button.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement Click_On_Request_Button = driver.findElement(By.xpath("//span[text()='Request']"));
		Click_On_Request_Button.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement Recent_Activity = driver.findElement(By.xpath("//a[text()='Recent activity']"));
		Recent_Activity.click();
		driver.navigate().back();
		WebElement View_All_Activities = driver.findElement(By.xpath("//a[text()='View all activity']"));
		View_All_Activities.click();
		driver.navigate().back();
		WebElement Seller_Tool = driver.findElement(By.xpath("//a[text()='Seller Tools']"));
		Seller_Tool.click();
		driver.navigate().back();
		WebElement Get_Paid = driver.findElement(By.xpath("//span[text()='Get paid']"));
		Get_Paid.click();
		driver.navigate().back();
		WebElement Banks_And_Cards = driver.findElement(By.xpath("//a[text()='Banks and cards']"));
		Banks_And_Cards.click();
		driver.navigate().back();
		WebElement Link_BankAccount = driver.findElement(By.xpath("//a[text()='Link a Card or Bank Account']"));
		Link_BankAccount.click();
		driver.navigate().back();
		WebElement help_link = driver.findElement(By.xpath("(//a[text()='Help'])[2]"));
		help_link.click();
		driver.navigate().back();
		WebElement Contact_Us = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		Contact_Us.click();
		driver.navigate().back();
		WebElement Security_link = driver.findElement(By.xpath("//a[text()='Security']"));
		Security_link.click();
		driver.navigate().back();
		
	}*/
	@Test
	public void Activitie_Functionalities () {
		WebElement Click_On_Activity = driver.findElement(By.xpath("//a[text()='Activity']"));
		Click_On_Activity.click();
		WebElement startDate = driver.findElement(By.xpath("//input[@id='filters-startDate']"));
		startDate.sendKeys("18/08/1995");
	}
	@AfterMethod
	public void Logout() {
		WebElement click_On_LogoutButton = driver.findElement(By.xpath("(//a[text()='Log Out'])[2]"));
		click_On_LogoutButton.click();
		driver.close();	
	}
	
	

}
