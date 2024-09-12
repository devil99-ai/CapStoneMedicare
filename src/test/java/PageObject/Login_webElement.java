package PageObject;

import org.openqa.selenium.By;

public class Login_webElement {
	public By clickonlogin=By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/a");
	public By click_on_login = By.xpath("//*[@id=\"login\"]/a");
	public By fill_email = By.xpath("//*[@id=\"username\"]");
	public By fill_password = By.xpath("//*[@id=\"password\"]");
	public By click_on_submit = By.xpath("//*[@id=\"loginForm\"]/div[3]/div/input[2]");
	public By login_btn_on_home = By.xpath("//*[@id=\"dropdownMenu1\"]");
	public By failed_login = By.xpath("/html/body/div/div[1]/div/div[1]/div/div");
	public Login_webElement() {
	}

}
