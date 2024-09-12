package PageObject;

import org.openqa.selenium.By;

public class CheckOutAndOrderWebElement {
	public By cick_on_checkout = By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[4]/a");
	public By select_previous_address = By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/div/div/div/a");
	public By fill_new_address1 = By.xpath("//*[@id=\"addressLineOne\"]");
	public By fill_new_address2 = By.xpath("//*[@id=\"addressLineTwo\"]");
	public By fill_city = By.xpath("//*[@id=\"city\"]");
	public By fill_postal_code =By.xpath("//*[@id=\"postalCode\"]");
	public By fill_state = By.xpath("//*[@id=\"state\"]");
	public By fill_Country = By.xpath("//*[@id=\"country\"]");
	public By click_on_add_address = By.xpath("//*[@id=\"billingForm\"]/div[7]/div/button");
	public CheckOutAndOrderWebElement() {
	}
	

}
