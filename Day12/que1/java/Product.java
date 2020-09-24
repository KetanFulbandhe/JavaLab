package mypack;

import javax.persistence.*;

@Entity

public class Product {
private int pid;
private String pname;
private int price;
private int quantity;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id",nullable=false)
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity + "]";
}

}
