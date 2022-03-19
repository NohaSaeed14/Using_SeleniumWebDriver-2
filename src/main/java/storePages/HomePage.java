package storePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	// variables
	private WebDriver driver;
	private String url = "https://play.google.com/store/apps";

	// locators
	private By appsButton = By.xpath("//span[text()='Apps']");
	private By categoriesTab = By.xpath("//span[text()='Categories']");

	// constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// keywords / actions
	public void navigate() {
		driver.navigate().to(url);
	}

	// TestCase No.1
	public void ClickOnAppsButton() {
		driver.findElement(appsButton).click();

	}

	public String AppsGetTitle() {
		return driver.getTitle();
	}

	// TestCase No.2
	public void ClickOnCategoriesButton() {
		driver.findElement(categoriesTab).click();
	}

}
