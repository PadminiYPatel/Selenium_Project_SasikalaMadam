package Scripts;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import POM.ClickingDownloadInvoiceInFeedbackTab;
import POM.SkillraryDemoAppPage;
import POM.Skillrary_Homepage;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2()
	{
		Skillrary_Homepage s=new Skillrary_Homepage(driver);
		s.gearsbutton();
		s.skillrarydemoapplink();
		utilities.childBrowser(driver);
		SkillraryDemoAppPage ds=new SkillraryDemoAppPage(driver);
		ds.feedbackButton();
		ClickingDownloadInvoiceInFeedbackTab ip=new ClickingDownloadInvoiceInFeedbackTab(driver);
		ip.InvoiceButton();
	}
}
