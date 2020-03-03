package Genpro;

import java.text.NumberFormat;

public class product {
	
	private int procode, quantity;
	private String decription;
	private double price;
	static int typeofproducts;
	
	product(){
		typeofproducts ++;
	}
	
	public int getProcode() {
		return procode;
	}
	public void setProcode(int procode) {
		this.procode = procode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	 public String getPriceFormatted() 
	    {
	        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
              return formattedPrice;
		 
	
	
	    }
}
