

package pageObjectsPackage;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.openqa.selenium.By;


public class ListExpensesPage {
	
	public static WebElement element = null;
	
	public static void editListedExpenses(WebDriver driver) {
		try{
			List<WebElement> listedExpense = driver.findElements(
					By.xpath("//*[@title='edit expense']"));
			int size = listedExpense.size();
			for (int i=0; i<size;) {
				listedExpense.get(i).click();
				Reporter.log("clicked to edit the listed expenses");
			}
		}
		catch (Exception e) {
			}	
		}
	
	
	public static void deleteListedExpenses(WebDriver driver) {
		try{
			List<WebElement> listedExpense = driver.findElements(
					By.xpath("//*[@title='delete expense']"));
			int size = listedExpense.size();
			for (int i=0; i<size;) {
				listedExpense.get(i).click();
				Reporter.log("clicked to delete the listed expenses");	
			}	
		}
		catch (Exception e) {
			}
		Alert alert = driver.switchTo().alert();
		Reporter.log("pop up alert before deleting");
		alert.accept();
		Reporter.log("Accepted alert message and delete successful");
		}
	
	
	public static void ListExpenses(WebDriver driver) {
		driver.findElement(By.id("go_list_expenses")).click();
		WebElement table_element = driver.findElement(By.xpath("//table[@class='table']"));
		Reporter.log("List of expenses are :", true);
	    ArrayList<WebElement> rows = (ArrayList<WebElement>) table_element.findElements(By.tagName("tr"));
	    for (WebElement row : rows) {
	        ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
	        for (WebElement cell : cells) {
	            Reporter.log(cell.getText(), true);
	        }
	    }
	}
	
}
