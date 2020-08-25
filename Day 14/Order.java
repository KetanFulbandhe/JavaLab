package Day14Pack;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Order {
	enum Type
	{
		BUY,SELL;
	}
	private int quantity;
	private double price;
	private Type type;
	
	
	public Order(int quantity, double price, Type type) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.type = type;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> mlist = new ArrayList<Order>();
		mlist.add(new Order(10, 100.00, Type.SELL));
		mlist.add(new Order(20, 200.00, Type.BUY));
		mlist.add(new Order(30, 300.00, Type.SELL));
		mlist.add(new Order(40, 400.00, Type.SELL));
		mlist.add(new Order(50, 500.00, Type.BUY));
		
		int total = (int)(mlist.stream().filter(reft->reft.getType().equals(Type.SELL)).count());
		System.out.println(">Count of SELL Type :"+total);
		
		double price = (double)(mlist.stream().mapToDouble(refp->refp.getPrice()).sum());
		System.out.println(">Sum of all Price is :"+price);
		
		int SumQty = (int)(mlist.stream().mapToInt(refq->refq.getQuantity()).sum());
		System.out.println(">Sum of all Quantity :"+SumQty);
	}

}
