package Test;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;

public class LoginTest extends BaseTest {

	 @Test
	 public void LoginTest() {
	    page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Username$"))).nth(2).click();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("Admin");
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
	    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin123");
	    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
	    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("My Info")).click();
	    page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
//	    assertThat(page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("First Name"))).isVisible();
//	    assertThat(page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("First Name"))).hasValue("manda");
}
}