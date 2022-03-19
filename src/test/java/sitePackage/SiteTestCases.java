package sitePackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import storePages.CategoriesPage;
import storePages.HomePage;

public class SiteTestCases {

	private WebDriver driver;
	private HomePage home;
	private CategoriesPage category;

	@Test
	public void assertAppPageTitleIsCorrect() {
		home.ClickOnAppsButton();
		String appPageTitle = home.AppsGetTitle();
		Assert.assertEquals(appPageTitle, "Android Apps on Google Play");
	}

	@Test
	public void assertEducationPageTitleIsCorrect() {
		home.ClickOnCategoriesButton();
		category.ClickOnEducationTab();
		Boolean EducationGetTitle = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.titleContains("Education"));
		String educationPageTitle = category.EducationGetTitle();
		Assert.assertEquals(educationPageTitle, "Education - Android Apps on Google Play");

	}

	@BeforeMethod
	public void beforeMethod() throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		home = new HomePage(driver);
		category = new CategoriesPage(driver);

		home.navigate();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
