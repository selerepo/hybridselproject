package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.CoursePage;
import pompages.SkillraryDemoLogin;
import pompages.SkillraryLoginPage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.getGearsbtn();
		s.getDemoapp();
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutiles.switchTabs(driver);
        driverutiles.dropdown(sd.getCoursedd(),pdata.getData("coursedd")); 	
		
        CoursePage cp=new CoursePage(driver);
        driverutiles.dragandrop(driver,cp.getSele(),cp.getCartarea());
        
        WebElement loc=cp.getLinkedin();
        Point l=loc.getLocation();
        int x=l.getX();
        int y=l.getY();
        
        driverutiles.scrollBar(driver, x, y);
        cp.linkedin();
        
	}

}
