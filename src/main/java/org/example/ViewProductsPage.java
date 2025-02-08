package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewProductsPage {
    WebDriver driver;
    WebElement productTableContainer = driver.findElement(By.className("product-list-container"));
    WebElement filterInputBar = productTableContainer.findElement(By.className("filter-textbox"));
    WebElement filterButton = productTableContainer.findElement(By.cssSelector("[data-testid='filter-button']"));
    WebElement resetButton = productTableContainer.findElement(By.cssSelector("[data-testid='reset-filter-button']"));

    public ViewProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public ViewProductsPage PopulateFilterInputBar()
    {
        return this;
    }
}
