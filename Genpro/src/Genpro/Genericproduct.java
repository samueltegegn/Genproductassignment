package Genpro;


		/*
		 * This program is for generic product
		 * Done by Samuel Tegegn 
		 * Date 3/3/2020
		 */
		public class Genericproduct {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				product item1= new product();
				item1.setProcode(10);
				item1.setDecription("Desk top computer");
				item1.setPrice(1000.00);
				item1.setQuantity(3);
				
				product item2= new product();
				item2.setProcode(100);
				item2.setDecription("Laptop computer");
				item2.setPrice(800.00);
				item2.setQuantity(2);
				
				product item3= new product();
				item3.setProcode(20);
				item3.setDecription("Printer");
				item3.setPrice(500.00);
				item3.setQuantity(5);
				
				System.out.println("We have " + item1.getQuantity() + " " + item1.getDecription());
				System.out.println("We have " + item2.getQuantity() + " " + item2.getDecription());
				System.out.println("We have " + item3.getQuantity() + " " + item3.getDecription());
				System.out.println("_______________________________________________________");
				System.out.println("We have " + product.typeofproducts + " types of items");
				System.out.println("_______________________________________________________");
				System.out.println("The price of single " + item1.getDecription() +" "+ item1.getPriceFormatted());
				System.out.println("The price of single " + item2.getDecription() +" "+ item2.getPriceFormatted());
				System.out.println("The price of single " + item3.getDecription() +" "+ item3.getPriceFormatted());
				
			}

		}
