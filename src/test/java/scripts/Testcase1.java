package scripts;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pompages.AddToCartPage;
import pompages.SkillraryDemoLogin;
import pompages.SkillraryLoginPage;


public class Testcase1 extends BaseClass{
	@Test
	
	public void tc1() {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.getGearsbtn();
	s.getDemoapp();
	
	
	SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
	driverutiles.switchTabs(driver);
	driverutiles.mousehover(driver,sd.getCoursetab());
	sd.getSeleniumtraining();
	
	AddToCartPage ad=new AddToCartPage(driver);
	driverutiles.doubleclick(driver,ad.getAddbtn());
	ad.getAddtocartbtn();
	driverutiles.alertpopup(driver);
	
	
	
	
	}
}
