package PageObject;

import org.openqa.selenium.By;

public class SignUp_webElement {
	
	public By sign_up = By.xpath("//*[@id=\"signup\"]/a");
	public By fill_first_name = By.xpath("//*[@id=\"firstName\"]");
	public By fill_last_name = By.xpath("//*[@id=\"lastName\"]");
	public By fill_email = By.xpath("//*[@id=\"email\"]");
	public By fill_phone = By.xpath("//*[@id=\"contactNumber\"]");
	public By fill_password = By.xpath("//*[@id=\"password\"]");
	public By fill_confirm_password = By.xpath("//*[@id=\"confirmPassword\"]");
	public By select_role_supplier = By.xpath("//*[@id=\"registerForm\"]/div[7]/div/label[2]");
	public By next_billing_button = By.xpath("//*[@id=\"registerForm\"]/div[8]/div/button");
	public By fill_Address_1 = By.xpath("//*[@id=\"addressLineOne\"]");
	public By fill_Address_2 = By.xpath("//*[@id=\"addressLineTwo\"]");
	public By fill_city = By.xpath("//*[@id=\"city\"]");
	public By fill_postal_code = By.xpath("//*[@id=\"postalCode\"]");
	public By fill_state = By.xpath("//*[@id=\"state\"]");
	public By fill_country = By.xpath("//*[@id=\"country\"]");
	public By click_next = By.xpath("//*[@id=\"billingForm\"]/div[7]/div/button[2]");
	public By click_on_confirm = By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/a");
	public By btn_to_navigate_to_login = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/a");
	public SignUp_webElement() {
	}


}
