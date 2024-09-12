package PageObject;

import org.openqa.selenium.By;

public class Add_products_element {
	public By click_on_more_products = By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div[3]/div/a");
	public By product_1_add_cart = By.xpath("//*[@id=\"productListTable\"]/tbody/tr[1]/td[6]/a[2]");
	public By product_2_Add_cart = By.xpath("//*[@id=\"productListTable\"]/tbody/tr[2]/td[6]/a[2]/span");
	public By product_3_Add_cart = By.xpath("//*[@id=\"productListTable\"]/tbody/tr[3]/td[6]/a[2]/span");
	public By product_4_Add_cart = By.xpath("//*[@id=\"productListTable\"]/tbody/tr[4]/td[6]/a[2]");
	public By product_5_Add_cart = By.xpath("//*[@id=\"productListTable\"]/tbody/tr[5]/td[6]/a[2]");
	public By click_on_next_page = By.xpath("//*[@id=\"productListTable_next\"]/a");
	public By product_6_Add_cart = By.xpath("//*[@id=\"productListTable\"]/tbody/tr/td[6]/a[2]");
	public By continue_shopping_btn = By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[1]/a");
	public By product1 = By.xpath("//*[@id=\\\"count_3\\\"]");
	public By product2 = By.xpath("//*[@id=\\\"count_6\\\"]");
			
	public Add_products_element() {
	}

}
