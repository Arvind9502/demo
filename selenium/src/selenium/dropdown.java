package selenium;

import java.util.Iterator;
import java.util.List;

import javax.swing.JSpinner.ListEditor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetElementSelected;
import org.openqa.selenium.support.ui.Select;
//import com.sun.tools.javac.util.List;


public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\drivers\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//using id
		WebElement index=driver.findElement(By.id("dropdown1"));
		Select select=new Select(index);
		select.selectByIndex(2);
		
		//using text
		WebElement text=driver.findElement(By.name("dropdown2"));
		Select select1= new Select(text);
		select1.selectByVisibleText("Selenium");
		
		//select option using value
		
		WebElement value=driver.findElement(By.id("dropdown3"));
		Select select2= new Select(value);
		select2.selectByValue("3");
		
		//get count of options available under dropdown.
		List<WebElement> optionlist= select1.getOptions();
		System.out.println(optionlist.size());
		int size= optionlist.size();
	   for (int i = 0; i <size ; i++)
	   {
		System.out.println(optionlist.get(i).getText());
	   }
		//select option using sendkeys
		
		WebElement keys=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
		keys.sendKeys("Selenium");
		
		//select from list
		WebElement select3=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select/option[1]"));
		select3.sendKeys("Loadrunner");
	}

}
