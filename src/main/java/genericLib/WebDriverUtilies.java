package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilies {
	//obj for select class
	public void dropdown(WebElement ele,String Text) {
		Select s=new Select(ele);
		s.selectByVisibleText(Text);
	}
     //obj for actions class
	public void mousehover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void doubleclick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
		
	public void dragandrop(WebDriver driver,WebElement src,WebElement dest)	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src,dest).perform();
	}
	public void switchFrame(WebDriver driver)	{
		driver.switchTo().frame(0);
	}
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void switchTabs(WebDriver driver) {
		Set<String> child=driver.getWindowHandles();
		for(String b:child) {
		driver.switchTo().window(b);
	}
	}
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	}
	
	
