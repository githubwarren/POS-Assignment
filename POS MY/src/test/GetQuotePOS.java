package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetQuotePOS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium ChromeDriver v.130\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		try {
		
		driver.manage().window().maximize();
        driver.get("https://pos.com.my/send/ratecalculator");
        
       
        //Step 1: Malaysia selected as default From Country
        driver.findElement(By.xpath("//span[text()='Country']"));
        driver.findElement(By.xpath("//span[text()='Malaysia']"));
        
        //Step 2: Enter Postcode
        driver.findElement(By.cssSelector("input[placeholder='Postcode']")).sendKeys("35600");
       
        //Step 3: Select India as To Country
        driver.findElement(By.cssSelector("label[for='country']"));
        
        WebElement inputField = driver.findElement(By.cssSelector("#mat-input-0"));
        inputField.clear();
        Thread.sleep(3000);
        inputField.sendKeys("India"); 
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("small[title='India - IN']")).click();
        

        //Step 4: Enter "1" as weight
        driver.findElement(By.cssSelector("input[placeholder='eg. 0.1kg']")).sendKeys("1");

        // Step 5: Click "Calculate" button
        driver.findElement(By.cssSelector("a.bg-red-600.text-white")).click();
        
        //System.out.println(driver.findElement(By.xpath("//h1[text()='Your Quote']")).getText());
      
      
    } catch (Exception e) {
        System.out.println("An error occurred during the test: " + e.getMessage());
    } 
		
	}

}
