package launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Start of the program ONE");		
System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shareselenium.herokuapp.com/CheckBox.html");
		
		try {
			
			WebElement element = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
			
			if(element.isSelected()) {
				System.out.println("Element is selected");
			}
			else {
				System.out.println("Element is not selected");
				element.click();
			}
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("The End of Program");
	}

}
