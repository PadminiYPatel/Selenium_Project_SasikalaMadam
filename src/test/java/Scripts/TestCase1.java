package Scripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POM.SkillraryDemoAppPage;
import POM.Skillrary_Homepage;
import POM.TestingPage;

public class TestCase1 extends BaseClass {
	@Test
	public void tc1() throws Throwable 
	{
		Skillrary_Homepage s=new Skillrary_Homepage(driver);
		s.gearsbutton();
		s.skillrarydemoapplink();
		utilities.childBrowser(driver);
		SkillraryDemoAppPage ds=new SkillraryDemoAppPage(driver);
		utilities.dropDowns(ds.getSelectDd(), pdata.getPropertyData("coursedd"));
		TestingPage tp=new TestingPage(driver);
		//utilities.scrollBar(driver,tp.);
		tp.fbIconWebelement();
	}
}
