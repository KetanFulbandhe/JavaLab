package mypack;

import javax.persistence.*;
@Entity
public class Register

{    
	private int id;
	private String name;
    private String address;

private String email;

private String user;
private String password;


@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}



   public void setPassword(String password) {
	this.password = password;
}
   public String getPassword() {
		return password;
	}
	
@Override
public String toString() {
	return "Register [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", user=" + user
			+ ", password=" + password + "]";
	
	
}
}
