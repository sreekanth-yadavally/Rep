package TestScripts;
import org.testng.annotations.Test;
import BusinessFunctions.Login;
public class TC1_Login extends RootTest 
{
	static Login login=new Login(brow);
	@Test
	public static void verifyOrangeHRM() throws Exception
	{
		brow.startBrowserFirefox();
		brow.maximiseBrowser();
		//verify title
		brow.verifyTitle("OrangeHRM - New Level of HR Management");
		login.setUp();
		login.loginToapp("qaplanet1","user1");
		brow.waitForPageToLoad();
		//verify title
		brow.verifyTitle("OrangeHRM");
		login.logout();
		brow.closeBrowser();
		brow.QuitObject();
	}
}
