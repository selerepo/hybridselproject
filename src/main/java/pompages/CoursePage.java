package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {
	@FindBy(id="Selenium Training")
	private WebElement sele;
	
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	@FindBy(xpath="(//i[@class='fa fa-linkedin'])[2]")
	private WebElement linkedin;
	
	public CoursePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
		
	}

	public WebElement getSele() {
		return sele;
	}

	public WebElement getCartarea() {
		return cartarea;
	}

	public WebElement getLinkedin() {
		return linkedin;
	}
	public void linkedin() {
		linkedin.click();
	}

}
