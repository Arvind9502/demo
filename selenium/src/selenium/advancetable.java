package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class advancetable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\drivers\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/sorttable.html");
		
		//get the list and sort it
		List<WebElement> list1=driver.findElements(By.xpath("//td[2]"));
		System.out.println(list1.size());
		ArrayList<String> unsortedlist=new ArrayList<String>();
		for (WebElement string : list1) {
			String table=string.getText();
			unsortedlist.add(table);
		}
		System.out.println("Before sorting="+unsortedlist);
		unsortedlist.sort(null);
		System.out.println("Sorting using code ="+unsortedlist);
		
		//sort by clicking 
		WebElement click=driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/table/thead/tr/th[2]"));
		click.click();
		List<WebElement>list2=driver.findElements(By.xpath("//td[2]"));
		ArrayList<String> sortedlist=new ArrayList<String>();
		for (WebElement string1 : list2) {
			String getlist=string1.getText();
			sortedlist.add(getlist);
		}
		System.out.println("Sorting done on website="+sortedlist);
		if (unsortedlist.equals(sortedlist)) {
			
			System.out.println("The Sorting function is working");
			
			}
		
		else {
		System.out.println("The Sorting function is not working");
			}
		
		
		driver.close();
	}

}
