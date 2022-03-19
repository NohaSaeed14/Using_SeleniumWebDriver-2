package storePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoriesPage {
	// variables
	private WebDriver driver;
	// locators
	private By educationTab = By.linkText("Education");

	// constructor
	public CategoriesPage(WebDriver driver) {
		this.driver = driver;
	}
	// keywords / actions
	// TestCase No.2

	public void ClickOnEducationTab() {

		driver.findElement(educationTab).click();
	}
	

	public String EducationGetTitle() {
		return driver.getTitle();

	}

}
