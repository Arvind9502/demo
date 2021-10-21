package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class download {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		WebElement excel=driver.findElement(By.partialLinkText("Excel"));
		excel.click();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		File loc=new File("C:\\Users\\admin\\Downloads");
		File[] list=loc.listFiles();
	for (File checkexcel : list) {
		if (checkexcel.getName().equals("testleaf.xlsx")) {
			System.out.println("file present");
			break;
		}
		
	}
		WebElement pdf=driver.findElement(By.linkText("Download PDF"));
		pdf.click();
		Thread.sleep(5000);
		Takesnapshot(driver,"exam");
	}

	private static void Takesnapshot(WebDriver driver, String string) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot pic=((TakesScreenshot)driver);
		File img=pic.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(img,new File("C:\\Users\\admin\\Desktop\\selenium\\ss.png"));
		driver.navigate().back();
		
		
		
		//get text from 3rd link
		WebElement text=driver.findElement(By.linkText("Download Text"));
		text.click();
		WebElement text1=driver.findElement(By.xpath("/html/body/pre"));
		//System.out.println(text1.getText());
		String actual="You have downloaded the file.";
		String validate=text1.getText();
		if (actual.equals(validate)) {
			System.out.println("verified succesfull");
		}
		else {
			System.out.println("not verified");
		}
		driver.close();
	}
}
