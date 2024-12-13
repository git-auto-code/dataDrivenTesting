package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckboxes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();  // Automatically manages driver version
    	//System.setProperty("webdriver.chrome.driver","E:/drivers/chromedriver-win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        //1)select specific checkbox
        //driver.findElement(By.id("monday")).click();
        
        //2)select all the checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        	/*for(int i=0;i<checkboxes.size();i++) 
        	{
        		checkboxes.get(i).click();
        	}*/
        
        //3)select last 3 checkboxes
        /*for(int i=4;i<checkboxes.size();i++) 
        {
        	checkboxes.get(i).click();
        }*/
        //4)select first 5 checkboxes
        for(int i=0;i<5;i++) 
        {
        	checkboxes.get(i).click();
        }
        //5)Unselect checkboxes if they are selected
        /*for(int i=0;i<checkboxes.size();i++) 
        {
        	if(checkboxes.get(i).isSelected())
        	{
        		checkboxes.get(i).click();
        	}
        }*/
        
    }
}

