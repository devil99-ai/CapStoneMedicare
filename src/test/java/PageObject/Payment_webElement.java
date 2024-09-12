package PageObject;

import org.openqa.selenium.By;

public class Payment_webElement {
	public By fill_card_number = By.xpath("//*[@id=\"cardNumber\"]");
	public By fill_exp_month = By.xpath("//*[@id=\"expityMonth\"]");
	public By fill_exp_year = By.xpath("//*[@id=\"expityYear\"]");
	public By fill_cvv = By.xpath("//*[@id=\"cvCode\"]");
	public By pay_btn = By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/a");
	public Payment_webElement() {
	}
	
}
