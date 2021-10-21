package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class goibibo {

	public static void main(String[] args) throws InterruptedException {
		//Initialize driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Get URL
		driver.get("https://www.goibibo.com/hotels/");
		Actions act=new Actions(driver);
		//select India radio button
		WebElement India=driver.findElement(By.xpath("//h4[contains(text(),'India')]"));
		System.out.println("Selected Country is "+India.getText());
		India.click();
		//Select any city from "Where" drop down.
		WebElement City=driver.findElement(By.xpath("//input[@id='downshift-1-input']"));
		act.moveToElement(City).click().build().perform();
		Thread.sleep(1000);
		WebElement select=driver.findElement(By.xpath("//p[contains(text(),'Mysor')]"));
		System.out.println("Selected City is "+select.getText());
		act.moveToElement(select).click().build().perform();
		
		//Select any date from "Check-in" Calendar.
		WebElement date=driver.findElement(By.xpath("//input[@id='search-widget-checkin-input']"));
		act.moveToElement(date).click().build().perform();
		
		WebElement checkin=driver.findElement(By.xpath("//*[@id=\"search-widget-calendar-element\"]/div[2]/section/div/div[2]/div[2]/div/ul[2]/li[10]/span"));
		//System.out.println("Check In "+checkin.getAttribute("data-testid"));
		checkin.click();
		//.Select any date from "Check-out" Calendar.
		WebElement checkout=driver.findElement(By.xpath("//*[@id=\"search-widget-calendar-element\"]/div[2]/section/div/div[2]/div[2]/div/ul[2]/li[12]/span"));
		//System.out.println("Check Out "+checkout.getAttribute("data-testid"));
		checkout.click();
		//Select 2 Rooms ,3 adults, 2 children as Guests.
		WebElement rooms=driver.findElement(By.xpath("//input[@value='2 Guests in 1 Room ']"));
		rooms.click();
		WebElement add=driver.findElement(By.xpath("//*[@id='root']/section[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/span[2]"));
		add.click();
		WebElement add1=driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div[4]/div/div/div[2]/div/span[2]"));
		add1.click();
		WebElement add2=driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div[4]/div/div/div[3]/div/span[2]"));
		act.moveToElement(add2).click().click().build().perform();
	
		WebElement count1=driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div[4]/div/div/div[3]/div/h4"));
		System.out.println("Child=  "+count1.getText());
		WebDriverWait wait=new WebDriverWait(driver, 10);
		//Check 2 "Child" drop down is enabled or not
	    WebElement one = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div[4]/div/div/div[4]/div")));			
	    act.moveToElement(one).click().build().perform();
	    
	    //select age of first children 
	    WebElement age=driver.findElement(By.xpath("//li[contains(text(),'10')]"));
	    System.out.println("Age of child one is "+age.getText()+" years");
	    act.moveToElement(age).click().build().perform();
	  
	    //select age of second children 
	   WebElement age1=driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div/div[4]/div/div/div[5]/div"));
	   act.moveToElement(age1).click().build().perform();
	   WebElement two=driver.findElement(By.xpath("//li[contains(text(),'8')]"));
	   System.out.println("Age of child two is "+two.getText()+" years");
	   two.click();
	 
	   //click on done
	   WebElement done=driver.findElement(By.xpath("//button[contains(text(),'Done')]"));
	   done.click();
	}

}
