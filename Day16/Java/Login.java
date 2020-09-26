package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="login")
public class Login 
{
	private int id;
	private String uname,password;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@NotEmpty(message="name can not be empty")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "name must contain characters")
	@Size(max = 6)
	public String getUname() {
		return uname;
	}
	@Column
	public void setUname(String uname) {
		this.uname = uname;
	}
	@NotEmpty(message="password can not be empty")
	@Pattern(regexp = "^[A-Za-z]+[0-9]+$", message = "password must contain characters as well as digits")
	@Size(min=4,max = 7)
	public String getPassword() {
		return password;
	}
	@Column
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	/*private int rollno;
	private String name;
	private int age;
	private String email;
	
	@NotEmpty(message="email can not be empty")
	@Email(message="invalid email id")
	public String getEmail() {
		return email;
	}
	@Column
	public void setEmail(String email) {
		this.email = email;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@NotEmpty(message="name can not be empty")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "name must contain characters")
	public String getName() {
		return name;
	}
	@Column
	public void setName(String name) {
		this.name = name;
	}
	
	@Range(min=18,max=30,message="age should be between {min} and {max}")
	public int getAge() {
		return age;
	}
	@Column
	public void setAge(int age) {
		this.age = age;
	}*/
	
}







