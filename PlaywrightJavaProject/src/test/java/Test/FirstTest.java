package Test;

import org.testng.annotations.Test;

import base.BaseTest;

public class FirstTest extends BaseTest {
	

		
			 
			   @Test
			   public void verifyTitle() {
			       page.navigate("https://www.google.com/ncr");
			       
			       // Optional: Handle cookie popup
			       if (page.isVisible("button:has-text('Accept all')")) {
			           page.click("button:has-text('Accept all')");
			       }
			   }
		/*	       }
        try (Playwright playwright = Playwright.create()) {
            // Playwright starts here
        	
        	Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page=	browser.newPage();
            page.navigate("https://mvnrepository.com/artifact/com.microsoft.playwright/playwright/1.57.0");
           
            System.out.println( page.title());
        }*/

    }

