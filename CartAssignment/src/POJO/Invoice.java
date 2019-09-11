package POJO;

import java.util.ArrayList;

import Servlets.firstServlet;

public class Invoice {
	public static String generateInvoice(ArrayList<Product> al) {
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("%-10s %-10s %-10s<br>", "Produt Name","Quantity","Price"));
		double total = 0;
		for(Product p:al) {
			double price = p.getPrice();
			int qty = p.getQuantity();
			total = total + qty*price;
			sb.append(String.format("%-10s %-10s %-10s<br>", p.getProductName(),qty,price));
		}
		sb.append(String.format("%-20s : %-10s", "Total",total));
		firstServlet.al.clear();
		return String.valueOf(sb);
		
	}
}

 