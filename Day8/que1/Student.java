package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	private int rollno;
	private String name,address;
	private int age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rollno",nullable=false)
	public int getRollno() {
		return rollno;
	} 

	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="address")
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Employee [rollno=" + rollno + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}

}


















