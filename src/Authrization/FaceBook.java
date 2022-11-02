package Authrization;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver_win32//chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    Thread.sleep(3000);
	    driver.get("http://127.0.0.1:5500/index.html");
	    String myTitle=driver.getTitle();
	    System.out.println(myTitle);
	    
	    List <WebElement> myListOfOptions=driver.findElements(By.tagName("option"));//  طريقه رقم 1 لحتى اجيب البيانات

	    for(int i=0;i<myListOfOptions.size();i++) {
	    	System.out.println(myListOfOptions.get(i).getText());
	    }


	   // String myTitle1=driver.getTitle(); لطباعه اسم العنوان 
	    
	    
	}

}
